package com.demo.controllers.admin;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin")
public class AdminController {

    //ROUTES
    @GetMapping(value = {"index", "", "/", "/dashboard"})
    private String index(ModelMap model) {
        return "admin/index";
    }

}
