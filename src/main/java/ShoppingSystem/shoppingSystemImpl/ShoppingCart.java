package ShoppingSystem.shoppingSystemImpl;

import ShoppingSystem.OnlineShopping.Cart;

public class ShoppingCart  implements Cart {
    @Override
    public void removeCart() {

    }

    @Override
    public int getTotalQuantity() {
        return 1;
    }

    @Override
    public String increaseQuantity(String item, int amount) {
        return "";
    }

    @Override
    public String decreaseQuantity(String item, int amount) {
        return "";
    }
}
