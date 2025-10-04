package com.example.RegistrationForm.Controller;

import com.example.RegistrationForm.Entities.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserController {

    @GetMapping("/")
    public String getIndex(){
        return "index";
    }

    @PostMapping("/register")
    public String saveDetails(@ModelAttribute User user , Model model){

        model.addAttribute("firstname" , user.getFname());
        model.addAttribute("lastname" , user.getLname());
        model.addAttribute("mail" , user.getEmail());
        model.addAttribute("password" , user.getPass());

        return "welcome";
    }
}
