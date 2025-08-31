package ShoppingSystem.OnlineShopping;

public interface Cart {
    void removeCart();
    int getTotalQuantity();
    String increaseQuantity(String item, int amount);
    String decreaseQuantity(String item, int amount);
}
