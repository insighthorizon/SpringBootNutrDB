package springProj.nutrDB.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/account")
public class AccountController {

    @GetMapping("login")
    public String renderLogin() {
        return "/pages/account/login";
    }

    @GetMapping("register")
    public String renderRegister(/* TODO @ModelAttribute UserDTO userDTO*/) {
        return"/pages/account/register";
    }

}
