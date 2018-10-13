import java.util.ArrayList;
import java.util.List;

public class OrderStrategyDemo {

    public static void main(String[] args) {

        Order order = new Order("12/12/2016", "1:46:54 PM", 45);

        List<Items> itemsToBeAdded = new ArrayList<>();
        Items item1 = new Items("LBB", 5.59, 1,true);
        Items item2 = new Items("LTL CAJ", 2.79, 1,false);

        String[] toppingsOnTopBun = {"Lettuce", "Tomato"};

        String[] toppingsOnMeat = {"G Onion", "JALA Grilled"};


        item1.settoppingsOnMeat(toppingsOnMeat);
        item1.settoppingsOnTopBun(toppingsOnTopBun);
        item1.setMeat("Bacon");

        itemsToBeAdded.add(item1);
        itemsToBeAdded.add(item2);

        System.out.println(itemsToBeAdded.toString());
        order.setItemsInOrder(itemsToBeAdded);

        System.out.println("Displaying Receipt..");
        OrderContext orderContext = new OrderContext(new Receipt());
        orderContext.executeprintOrderStrategy(order);

        System.out.println("\n\nDisplaying Packing Slip..");
        orderContext = new OrderContext(new PackingSlip());
        orderContext.executeprintOrderStrategy(order);

    }

}
