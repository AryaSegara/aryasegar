// package com.kuis11.aryasegara.service;

// import com.kuis11.aryasegara.Models.CoffeShop;
// import com.kuis11.aryasegara.model.Chef;
// import com.kuis11.aryasegara.model.ChefRestaurant;
// import com.kuis11.aryasegara.model.Food;
// import java.util.ArrayList;
// import java.util.List;
// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.stereotype.Service;

// @Service
// public class CoffeShopService {

//   @Autowired
//   private CoffeService coffeeService;

//   @Autowired
//   private BaristaService baristaService;

//   public List<CoffeShop> getChefRestaurants() {
//     List<CoffeService> coffeShop = new ArrayList<>();
//     List<Food> foods = foodService.getAllFood();
//     List<Chef> chefs = chefService.getAllChef();

//     for (int i = 0; i < foods.size(); i++) {
//       Food food = foods.get(i);
//       Chef chef = chefs.get(i % chefs.size());
//       chefRestaurants.add(new ChefRestaurant(food, chef));
//     }
//     return chefRestaurants;
//   }
// }