package com.kuis11.aryasegara.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.kuis11.aryasegara.Models.Coffee;
import com.kuis11.aryasegara.Services.CoffeService;


@Controller
public class CoffeeController {
        @Autowired
    private CoffeService coffeeService; ;

    @GetMapping("/coffe")
    public String listChef (Model model) {
        List <Coffee> chefs = coffeeService.getAllCoffe();
        model.addAttribute("chefs",chefs);
        return "chef";
    }
}
