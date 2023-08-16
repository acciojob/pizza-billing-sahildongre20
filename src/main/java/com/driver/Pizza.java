package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill="";

    private int basePrice;
    final private int cheesePrice=80;
    final private int bagPrice=20;
    private int toppingPrice;
    //boolean attributes
    private boolean cheeseAdded;
    private boolean toppingAdded;
    private boolean bagAdded;
    private boolean billGenerated;




    /**
     * menu
     *
     * Veg pizza base price = 300
     * Non-veg pizza base price = 400
     * Extra Cheese Price = 80
     * Extra Toppings For Veg Pizza = 70
     * Extra Toppings For Non-veg Pizza = 120
     * Paper bag Price = 20
     */

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        if (this.isVeg){
            basePrice=300;
            toppingPrice=70;
        }
        else{
            basePrice=400;
            toppingPrice=120;
        }
        price+=basePrice;
        // your code goes here
    }
    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        if (!cheeseAdded){
            price+=cheesePrice;
            cheeseAdded=true;
        }

    }

    public void addExtraToppings(){
        // your code goes here
        if(!toppingAdded){
            price+=toppingPrice;
            toppingAdded=true;
        }
    }

    public void addTakeaway(){
        // your code goes here
        if (!bagAdded){
            price+=bagPrice;
            bagAdded=true;
        }
    }

    public String getBill(){
        // your code goes here
        if(billGenerated){
        if(isVeg){
            bill+="Base Price Of The Pizza: 300\n";
        }
        else {
            bill+="Base Price Of The Pizza: 400\n";
        }
        if (cheeseAdded){
            bill+="Extra Cheese Added: 80\n";
        }
        if(toppingAdded){
            bill+="Extra Toppings Added: 70\n";
        }
        if (bagAdded){
            bill+="Paperbag Added: 20\n";
        }
        bill+="Total Price: "+price+"\n";
        }
        billGenerated=true;
        return this.bill;
    }
}
