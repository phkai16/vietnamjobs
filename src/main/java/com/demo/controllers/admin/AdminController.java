package com.demo.controllers.admin;

import com.demo.services.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("/admin/account")
public class AdminController {

    @Autowired
    private AccountService accountService;


    @GetMapping(value = {"index", "", "/"})
    private String index(ModelMap model) {
        model.put("accounts", accountService.findAll());
        return "admin/account/index";
    }

    @GetMapping(value = "remove/{id}")
    private String remove(@PathVariable int id, RedirectAttributes attr) {
//        Account account = accountService.findById(id);
//        if(accountService.remove(account)) {
//            attr.addFlashAttribute("next", "Removed successfully.");
//        } else {
//            attr.addFlashAttribute("error", "Remove Failued.");
//        }
        return "redirect:/admin/account/index";
    }

    @GetMapping(value = {"/submitted-tests"})
    private String participants(
            @RequestParam(value = "accountId") Integer accountId,
            ModelMap model) {
//        Account account = this.accountService.findById(accountId);
//        model.put("tests", subjectService.getTestsHistory(account.getId()));
        return "admin/test/history";
    }

}
