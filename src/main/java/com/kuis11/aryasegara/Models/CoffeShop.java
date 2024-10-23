package com.kuis11.aryasegara.Models;

public class CoffeShop {
    private Coffee coffee;
    private Barista barista;
    public CoffeShop(Coffee coffee, Barista barista) {
        this.coffee = coffee;
        this.barista = barista;
    }
    public Coffee getCoffee() {
        return coffee;
    }
    public void setCoffee(Coffee coffee) {
        this.coffee = coffee;
    }
    public Barista getBarista() {
        return barista;
    }
    public void setBarista(Barista barista) {
        this.barista = barista;
    }

    
}
