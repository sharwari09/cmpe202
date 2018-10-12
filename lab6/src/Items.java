import java.util.ArrayList;
import java.util.List;

public class Items {
    String name;
    double price;
    int quantity;
    double total;

    public String[] toppingsOnTopBun = {"Lettuce", "Tomato"};

    public String[] toppingsOnMeat = {"G Onion", "JALA Grilled"};

    String meat = "Bacon";
    Boolean haveToppings;

    public Items(String name, double price, int quantity,
                 Boolean haveToppings) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.total = price * quantity;
        this.haveToppings = haveToppings;
    }

    public void setToppings(String[] toppingsOnTopBun,
                            String[] toppingsOnMeat){

        this.toppingsOnTopBun = toppingsOnTopBun;

        this.toppingsOnMeat = toppingsOnMeat;
    }

    public void setMeat(String meat){
        this.meat = meat;
    }
}

