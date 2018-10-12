import java.util.ArrayList;
import java.util.List;

public class PackingSlip implements PrintOrder {
    Order order;
    List<Items> itemsToBeAdded = new ArrayList<>();

    public PackingSlip()
    {
        double total = 0;
        order = new Order("12/12/2016", "1:46:54 PM", 45);

        Items item1 = new Items("LBB", 5.59, 1,true);
        Items item2 = new Items("LTL CAJ", 2.79, 1,false);

        itemsToBeAdded.add(item1);
        itemsToBeAdded.add(item2);

        System.out.println(itemsToBeAdded.toString());
        order.setItemsInOrder(itemsToBeAdded);

    }

    @Override
    public void printOrderReceipt() {
        System.out.println(order.date + "    " + order.time);
        System.out.println("Order Number " + order.orderNumber);

        for (Items item : order.items) {
            System.out.println(item.name);
            if (item.haveToppings){
                for (String topping: item.toppingsOnTopBun)
                    System.out.println(topping);
                for (String topping: item.toppingsOnMeat)
                    System.out.println("->| " + topping);
                System.out.println("{{{{ "+ item.meat +"}}}}");
            }
            System.out.println("\n");
        }

    }

}
