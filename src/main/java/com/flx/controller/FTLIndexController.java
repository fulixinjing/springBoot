package com.flx.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.HashMap;
import java.util.Map;

@Controller
public class FTLIndexController {

    @RequestMapping("/ftlIndex")
    public String ftlIndex(Map<String,String> map){
        map.put("name","张三");
        return "ftl_index";
    }
}
