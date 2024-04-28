package com.demo.controllers;


//import com.demo.entities.Account;
//import com.demo.entities.AccountRole;
//import com.demo.services.AccountService;
//import jakarta.servlet.http.HttpSession;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.core.Authentication;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/account")
public class AccountController {

//    @Autowired
//    private AccountService accountService;
//
//    @Autowired
//    private BCryptPasswordEncoder _encoder;
//
//    @GetMapping(value = {"login", "/", ""})
//    private String login(
//            @RequestParam(value = "logout", required = false) String lg,
//            @RequestParam(value = "mistake", required = false) String mistake,
//            ModelMap model,
//            Authentication authen) {
//        if (authen != null && authen.getName() != null) {
//            return "redirect:/admin/homepage/index";
//        }
//        if (mistake != null) {
//            model.put("mistake", "Please check your account again.");
//        }
//        if (lg != null) {
//            model.put("next", "Logout successfully. See you again!!!");
//        }
//        return "account/login";
//    }
//
//    @GetMapping(value = "logout")
//    private String logout(HttpSession session) {
//        session.removeAttribute("account");
//        return "account/login";
//    }
//
//    @GetMapping(value = {"signup"})
//    private String signUp(ModelMap model) {
//        model.put("account", new Account());
//        return "account/signup";
//    }
//
//    @PostMapping(value = {"signup"})
//    private String signUp(@ModelAttribute("account") Account account,
//                          RedirectAttributes attr) {
//        account.setPassword(_encoder.encode(account.getPassword()));
//        account.setAccountRole(new AccountRole(2));
//        try {
//            if (accountService.create(account) != null) {
//                attr.addFlashAttribute("next", "Registered sucessfully.");
//                return "redirect:/account/login";
//            }
//        } catch (Exception ex) {
//            ex.printStackTrace();
//            attr.addFlashAttribute("error", "Registration failed.");
//        }
//        return "redirect:/account/signup";
//    }
//
//    @GetMapping(value = {"profile"})
//    private String profileGET(ModelMap model, Authentication authen) {
//        Account account = accountService.findByUsername(authen.getName());
//        model.put("account", account);
//        return "account/profile";
//    }
//
//    @PostMapping(value = {"profile"})
//    private String profilePost(@ModelAttribute("account") Account account,
//                               RedirectAttributes attr) {
//        if (accountService.save(account) != null) {
//            attr.addFlashAttribute("next", "Changed profile successfully");
//        } else {
//            attr.addFlashAttribute("error", "Changed profile failed");
//        }
//        return "redirect:/account/profile";
//    }
}
