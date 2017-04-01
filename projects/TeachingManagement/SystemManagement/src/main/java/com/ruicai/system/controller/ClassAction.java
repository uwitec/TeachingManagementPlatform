package com.ruicai.system.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 班级管理
 * Created by XuMing on 2017/3/31.
 */
@Controller
@RequestMapping("/class")
public class ClassAction {

    @RequestMapping("/index.action")
    public String index() {
        return "classEdit";
    }
}