package com.wincert.framework.controller;

import com.wincert.framework.dao.user.dto.UserInfoDto;
import com.wincert.framework.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@RequestMapping(value = {"/", ""})
@Controller
public class TestController {

    @Autowired
    UserService userService;

    @RequestMapping(value = {"/", ""})
    public String sayHello(Model model) {
        System.out.println();
        System.out.println("로그 테스트");

        return "/dash/home";
    }

    @RequestMapping("/user/userInfo")
    public String userInfo(Model model) {
        model.addAttribute("userName", "아토 인터넷");
        model.addAttribute("userEmail", "admin@wincert.com");

        return "/user/userInfo";
    }

    @RequestMapping("/user/all")
    public String allUserInfo(Model model) {
        List<UserInfoDto> users = userService.getAllUser();

        model.addAttribute("users", users);
        return "/user/userList";
    }
}
