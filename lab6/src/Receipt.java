public class Receipt implements PrintOrder {


    @Override
    public void printOrderReceipt(Order order) {
        System.out.println("   FIVE GUYS    ");
        System.out.println(order.date + "    " + order.time);
        System.out.println("Order Number " + order.orderNumber);

        for (Items item : order.items) {
            System.out.println(item.name + "\t\t" + item.total);
            if (item.haveToppings){
                System.out.println("{{{{ "+ item.meat +"}}}}");
                for (String topping: item.toppingsOnTopBun)
                    System.out.println(topping);
                for (String topping: item.toppingsOnMeat)
                    System.out.println("->| " + topping);
            }
            System.out.println("");
        }
        System.out.println("Sub. Total:\t\t:" + order.getOrderSubtotal());

    }

}
