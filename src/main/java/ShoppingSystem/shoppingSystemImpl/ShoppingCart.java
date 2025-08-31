package ShoppingSystem.shoppingSystemImpl;

import ShoppingSystem.OnlineShopping.Cart;

import java.util.HashMap;
import java.util.Map;


public class ShoppingCart  implements Cart {

    //Map<String, Integer> items → keeps track of item names and their quantities.
    private Map<String , Integer > items;

    //this is a constructor to initialize a cart
    public void  ShoppingCart(){
        this.items = new HashMap<>();             //new HashMap<>() = creates an empty map that will hold the cart items and their quantities.
    }

    @Override
    public void removeCart() {
//        clear all the items
        items.clear();
        System.out.println("product was removed from cart");
    }

    //The goal of this method is to calculate how many total items are in the cart.
    @Override
    public int getTotalQuantity() {
        //sum all quantity
        int total = 0;  //Start with total = 0
        for(int quantity : items.values()){      //items is a HashMap<String, Integer>   items.values() → gives you just the quantities
            total += quantity;                   //Add the current quantity to total.
        }
        return total;
    }

    //add or update a product like - + (1) 0r (2)
    @Override
    public String increaseQuantity(String item, int amount) {
      items.put(item, items.getOrDefault(item, 1) + amount);   //If the item already exists in the map, get its quantity. if not set to 1;
        return amount +" " + item + "(s) Cart successfully updated" ;
    }

    @Override
    public String decreaseQuantity(String item, int amount) {
       if(!items.containsKey(item)){   //Checks if the item exists in the cart.
           return "not found";   //return this
       }

       //get current idem
        int currentItem = items.get(item);

       if(amount >= currentItem){
           items.remove(item);
           return item + "removed completely from the cart.";
       }
     else{
         items.put(item, currentItem - amount);
         return amount + " " + item + "(s) product successfully removed. ";
       }
    }
}
