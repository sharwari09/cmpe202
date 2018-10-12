public class OrderStrategyDemo {


    public static void main(String[] args) {
        System.out.println("Displaying Receipt..");
        OrderContext orderContext = new OrderContext(new Receipt());
        orderContext.executeprintOrderStrategy();

        System.out.println("\n\nDisplaying Packing Slip..");
        orderContext = new OrderContext(new PackingSlip());
        orderContext.executeprintOrderStrategy();

    }

}
