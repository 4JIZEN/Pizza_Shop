package pizza_shop;

public class Pizza {

    private String name;
    private int MAX_TOPPING = 10;
    private String[] toppings = new String[MAX_TOPPING];
    private int totalToppings;
    private int n = 0;
    
    public void setName(String name) {
        this.name = name;
    }
    
    public void addTopping(String topping) {
        if (n < MAX_TOPPING) {
            this.toppings[n++] = topping;
        }
    }
    
    public String[] printAllToppings() {
        return this.toppings;
    }
    
    public String getName() {
        return this.name;
    }
    
    public int getTotalToppings() {
        return this.n;
    }
    
    public int getPrice() {
        return 100 + (n * 10);
    }
}
