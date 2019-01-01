package com.onexo.tpa.tpasys.controller;

import com.onexo.tpa.tpasys.model.UserModel;
import com.onexo.tpa.tpasys.service.UserDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AdminController {
    @Autowired
    UserDetailsService userDetailsService;

    @RequestMapping(value = "/")
    public List<UserModel> getUserList(){
        return userDetailsService.getUserList();
    }
}
