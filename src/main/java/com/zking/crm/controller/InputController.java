package com.zking.crm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("input")
public class InputController {

    @RequestMapping("{dir}/{page}")
    public String forwardPath(@PathVariable String dir,@PathVariable String page){
        String path=dir+"/"+page;
        return path;
    }

    @RequestMapping("/toIndex")
    public String toIndex() {
        return "index";
    }

}
