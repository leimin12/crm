package com.zking.crm.tag.ui;

import java.util.Map;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.BodyTagSupport;

import com.zking.crm.util.PageBean;


public class PageTag extends BodyTagSupport{

	private PageBean pageBean;
	
	
	public PageBean getPageBean() {
		return pageBean;
	}

	public void setPageBean(PageBean pageBean) {
		this.pageBean = pageBean;
	}

	public PageTag() {
	}
	
	
	@Override
	public int doStartTag() throws JspException {
		
		try {
			if(null!=pageBean){
				String converHTML = converHTML();
				this.pageContext.getOut().print(converHTML);
			}else{
				throw new RuntimeException("没有找到该pageBean对象");
			}
			return SKIP_BODY;
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
	
	
	/**
	 * pageBean转化为html字符串
	 * @return String
	 */
	private String converHTML(){
		StringBuffer sf=new StringBuffer();
		
		//3、动态生成js代码
		sf.append("<script type='text/javascript'>");
		sf.append("function doSkipPage(o){");
		sf.append("document.pageBeanForm.pindex.value=o;");
		sf.append("document.pageBeanForm.submit();");
		sf.append("}");
		sf.append("var max="+pageBean.getMaxPageNumber()+";");
		sf.append("function doGotoPage(){");
		sf.append("var gotovalue=document.getElementById('goto').value;");
		sf.append("if(!gotovalue||isNaN(gotovalue)||parseInt(gotovalue)<=0||parseInt(gotovalue)>max){");
		sf.append("alert('只能输入1~"+pageBean.getMaxPageNumber()+"之间的数字！');");
		sf.append("document.getElementById('goto').value='';");
		sf.append("document.getElementById('goto').focus();");
		sf.append("return;");
		sf.append("}");
		sf.append("doSkipPage(gotovalue);");
		sf.append("}");
		sf.append("</script>");
		
		//2、动态的生成分页代码
		sf.append("<div style='text-align: right;'>");
		sf.append("	 当前页数：["+pageBean.getCurPage()+"/"+pageBean.getMaxPageNumber()+"]");
		sf.append("<a href='javascript:doSkipPage(1)'>首页</a>");
		sf.append("<a href='javascript:doSkipPage("+pageBean.getPreviousPageNumber()+")'>上一页</a>");
		sf.append("<a href='javascript:doSkipPage("+pageBean.getNextPageNumber()+")'>下一页</a>");
		sf.append("<a href='javascript:doSkipPage("+pageBean.getMaxPageNumber()+")'>末页</a>");
		sf.append("<input type='text' id='goto' style='width: 30px'><a href='javascript:doGotoPage()'>GO</a>");
		sf.append("</div>");
		
		//1、动态的生成form表单
		sf.append("<form name='pageBeanForm' action='"+pageBean.getUrl()+"' method='post'>");
		sf.append("<input type='hidden' name='pindex' value=''> ");
		for(Map.Entry<String, String[]> m : pageBean.getParameterMap().entrySet()){
			String name=m.getKey();
			String[] values=m.getValue();
			if("pindex".equals(name)){
				continue;
			}
			for(String value:values){
				sf.append("<input type='hidden' name='"+name+"' value='"+value+"'>");
			}
		}
		sf.append("</form>");
		
		return sf.toString();
	}	
	
	
	
	
	
}
