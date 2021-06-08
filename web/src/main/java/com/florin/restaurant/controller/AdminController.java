package com.florin.restaurant.controller;


import com.florin.restaurant.util.Mappings;
import com.florin.restaurant.util.ViewNames;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.handler.MappedInterceptor;

@Controller
public class AdminController {


    @GetMapping(Mappings.ADMIN)
    public String admin(){
        return ViewNames.ADMIN;
    }

}
