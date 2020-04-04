package com.strap.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author 谭俊彦
 * @version 1.0 2020-03-30 20:57
 * @description
 */
@RestController
public class ForgotController {

    @GetMapping("/forgot")
    public ModelAndView forgot(){
        return new ModelAndView("forgot");
    }
}
