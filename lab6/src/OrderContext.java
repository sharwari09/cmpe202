public class OrderContext {

    private PrintOrder printorderstrategy;
    //private PrintOrder addItemToOrderstrategy;

    public OrderContext(PrintOrder printorderstrategy){
        this.printorderstrategy = printorderstrategy;
    }

    public void executeprintOrderStrategy(){

        printorderstrategy.printOrderReceipt();
    }
}
