package com.driver;

public class DeluxePizza extends Pizza {


    public DeluxePizza(Boolean isVeg) {
        super(isVeg);
        setAddedCheese(true);
        setAddedToppings(true);

        if(isVeg){
            setPrice(300+70+80);
            setBill("Base Price Of The Pizza: 450\n");

        }
        else {
            setPrice(400+70+80);
            setBill("Base Price Of The Pizza: 550\n");
        }
        // your code goes here
    }

}
