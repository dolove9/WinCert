package com.wincert.framework.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping(value = {"/", ""})
@Controller
public class TestController {

    @RequestMapping(value = {"/index"})
    public String index() {
        return "/seem/index";
    }

    @RequestMapping(value = {"/index_step01"})
    public String index_step01() {
        return "/seem/index_step01";
    }

    @RequestMapping(value = {"/index_step02"})
    public String index_step02() {
        return "/seem/index_step02";
    }

    @RequestMapping(value = {"/index_step03"})
    public String index_step03() {
        return "/seem/index_step03";
    }

    @RequestMapping(value = {"/index_step03_exam"})
    public String index_step03_exam() {
        return "/seem/index_step03_exam";
    }

    @RequestMapping(value = {"/index_step04"})
    public String index_step04() {
        return "/seem/index_step04";
    }

    @RequestMapping(value = {"/login"})
    public String login() {
        return "/seem/login";
    }


}
