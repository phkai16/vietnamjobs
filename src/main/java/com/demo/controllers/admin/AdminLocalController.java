package com.demo.controllers.admin;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin/local")
public class AdminLocalController {

    //ROUTES
    @GetMapping(value = {"/index", "", "/"})
    private String index(ModelMap model) {
        return "admin/local/index";
    }

    @GetMapping(value = {"/add"})
    private String add(ModelMap model) {
        return "admin/local/add";
    }

}
