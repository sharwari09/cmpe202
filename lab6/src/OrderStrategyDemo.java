public class OrderStrategyDemo {

    public static void main(String[] args) {
        OrderContext orderContext = new OrderContext(new Receipt());
        System.out.println(orderContext.executeprintOrderStrategy());

        orderContext = new OrderContext(new PackingSlip());
        System.out.println(orderContext.executeprintOrderStrategy());

    }
}
