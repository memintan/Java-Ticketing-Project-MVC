package com.ticketing.controller;

import com.ticketing.dto.RoleDTO;
import com.ticketing.dto.UserDTO;
import com.ticketing.service.RoleService;
import com.ticketing.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    RoleService roleService;
    @Autowired
    UserService userService;

    @GetMapping("/create")
    public String createUser(Model model){
        model.addAttribute("user", new UserDTO());
        model.addAttribute("roles", roleService.findAll());
        model.addAttribute("users", userService.findAll());

        //dataGenerator
        //

        return "/user/create";
    }
}
