package com.kuis11.aryasegara.Services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.kuis11.aryasegara.Models.Coffee;

@Service

public class CoffeService {
        public List <Coffee> getAllCoffe() {
        List<Coffee> coffee = new ArrayList<>();
        coffee.add(new Coffee(1, "Ayam Goreng", 20000L,"Besar"));
        coffee.add(new Coffee(2, "Ayam Geprek", 18000L,"Sedang"));
        coffee.add(new Coffee(3, "Kentang Goreng", 25000L,"Sedang"));
        coffee.add(new Coffee(4, "Rendang", 25000L,"Besar"));
        return coffee;
    }
}
