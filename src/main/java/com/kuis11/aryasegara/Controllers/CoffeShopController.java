// package com.kuis11.aryasegara.Controllers;

// import java.util.List;

// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.stereotype.Controller;
// import org.springframework.web.bind.annotation.GetMapping;


// @Controller
// public class CoffeShopController {
//         @Autowired
//     private ChefRestraurantService chefRestraurantService;

//     @GetMapping("/chef-restaurant")
//     public String getChefRestaurant(Model model){
//         List<ChefRestaurant> chefRestaurants = chefRestraurantService.getChefRestaurants();

//         model.addAttribute("chefRestaurant",chefRestaurants);
//         return "chef-restaurant";
//     }
// }
