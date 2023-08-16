package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;
    private boolean addedCheese=false;
    private boolean addedToppings = false;
    private boolean takeAway = false;

    public boolean isAddedCheese() {
        return addedCheese;
    }

    public void setAddedCheese(boolean addedCheese) {
        this.addedCheese = addedCheese;
    }

    public boolean isAddedToppings() {
        return addedToppings;
    }

    public void setAddedToppings(boolean addedToppings) {
        this.addedToppings = addedToppings;
    }

    public boolean isTakeAway() {
        return takeAway;
    }

    public void setTakeAway(boolean takeAway) {
        this.takeAway = takeAway;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Boolean getVeg() {
        return isVeg;
    }

    public void setVeg(Boolean veg) {
        isVeg = veg;
    }

    public void setBill(String bill) {
        this.bill = bill;
    }

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        this.bill="";
        if(isVeg){
            price+=300;
            this.bill+="Base Price Of The Pizza: 300\n";
        }
        else{
            price+=400;
            this.bill+="Base Price Of The Pizza: 400\n";

        }
        // your code goes here
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        if(!addedCheese) {
            this.price += 80;
            this.bill += "Extra Cheese Added: 80\n";
            this.addedCheese=true;
        }
    }

    public void addExtraToppings(){
        // your code goes here
        if(!addedToppings) {
            this.price += 70;
            this.bill += "Extra Toppings Added: 70\n";
            this.addedToppings = true;
        }
    }

    public void addTakeaway(){
        // your code goes here
        if(!takeAway) {
            this.price += 20;
            this.bill += "Paper bag Added: 20\n";
            this.takeAway=true;
        }
    }

    public String getBill(){
        // your code goes here
        this.bill+="Total Price: "+this.price+"\n";
        return this.bill;
    }
}
