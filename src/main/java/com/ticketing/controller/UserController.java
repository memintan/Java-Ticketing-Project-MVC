package com.ticketing.controller;

import com.ticketing.dto.RoleDTO;
import com.ticketing.dto.UserDTO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class UserController {

    @GetMapping("/create")
    public String createUser(Model model){
        model.addAttribute("user",new UserDTO());

        //dataGenerator
        //

        return "/user/create";
    }
}
