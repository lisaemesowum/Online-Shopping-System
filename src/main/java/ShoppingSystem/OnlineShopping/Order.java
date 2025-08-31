package ShoppingSystem.OnlineShopping;

public interface Order {
    void addItem(String Item, double price,int quantity);
    void removeItem(String item);

}
