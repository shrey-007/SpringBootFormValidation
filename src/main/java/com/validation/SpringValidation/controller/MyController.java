package com.validation.SpringValidation.controller;

import com.validation.SpringValidation.entity.User;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;



@Controller
public class MyController {
    @GetMapping("/form")
    public String openForm(Model model){
        model.addAttribute("User",new User());
        return "form";
    }

    @PostMapping("/submitForm")
//    @Valid annotations lagane se hi jo constraint user class mai lagaye hai vo validate hoge.
//    aur jo message aaega voh Bindingesult ke object mai aaega
    public String submitForm(@Valid @ModelAttribute("User") User user, BindingResult result){
        if (result.hasErrors()){
            System.out.println(result);
            return "form";
        }
        System.out.println(user);
        return "success";
    }
}
