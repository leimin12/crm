package com.zking.crm.biz.impl;

import com.zking.crm.biz.ISalChanceBiz;
import com.zking.crm.mapper.CstCustomerMapper;
import com.zking.crm.mapper.SalChanceMapper;
import com.zking.crm.model.CstCustomer;
import com.zking.crm.model.SalChance;
import com.zking.crm.util.PageBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
@Service
public class SalChanceBiz implements ISalChanceBiz {

    @Autowired
    private SalChanceMapper salChanceMapper;

    @Autowired
    private CstCustomerMapper cstCustomerMapper;

    @Override
    public void add(SalChance salChance) {
        salChanceMapper.insert(salChance);
    }

    @Override
    public void del(SalChance salChance) {
        salChanceMapper.deleteByPrimaryKey(salChance.getChcId());
    }


    @Override
    public void edit(SalChance salChance) {
        salChanceMapper.updateByPrimaryKey(salChance);
    }

    @Override
    public List<SalChance> list(SalChance salChance, PageBean pageBean) {
        return salChanceMapper.list(salChance);
    }

    @Override
    public SalChance load(SalChance salChance) {
        return salChanceMapper.selectByPrimaryKey(salChance.getChcId());
    }

    @Override
    public void editStatusByDispatch(SalChance salChance) {
        salChanceMapper.editStatusByDispatch(salChance);
    }

    @Override
    public List<SalChance> listToPlan(SalChance salChance, PageBean pageBean) {
        return salChanceMapper.listToPlan(salChance);
    }

    @Override
    public void editStatusByPlan(SalChance salChance) {
        if ("3".equals(salChance.getChcStatus())) {
            SalChance salc = salChanceMapper.selectByPrimaryKey(salChance.getChcId());
            CstCustomer cstCustomer = new CstCustomer();
            //时间
            SimpleDateFormat sdf = new SimpleDateFormat("yyMMdd");
            //获取数据库中的最大值
            String s = cstCustomerMapper.loadMax();
            //截取出后三位转化为数字  与下面进行比较
            int max = Integer.valueOf(s.substring(s.length() - 3, s.length()));
            //数字的转化器
            DecimalFormat df = new DecimalFormat("000");
            //创建StringBuffer进行id的拼接
            StringBuffer sb = new StringBuffer("KH");
            //转化好日期格式
            sb.append(sdf.format(new Date()));
            //用来取值
            int sum = 0;
            for (int i = 1; i < 1000; i++) {
                //如果循环的比从数据库中取到的值还要大就停止循环
                sum = i;
                if (sum>max) {
                    break;
                }
            }
            //继续拼接
            sb.append(df.format(sum));
            cstCustomer.setCustNo(sb.toString());
            cstCustomer.setCustName(salc.getChcCustName());
            cstCustomer.setCustTel(salc.getChcTel());
            //进行增加一个新的客户信息
            cstCustomerMapper.insert(cstCustomer);
        }
        salChanceMapper.editStatusByPlan(salChance);
    }
}
