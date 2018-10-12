public class OrderContext {

    private PrintOrder printorderstrategy;

    public OrderContext(PrintOrder printorderstrategy){
        this.printorderstrategy = printorderstrategy;
    }

    public String executeprintOrderStrategy(){
        return printorderstrategy.printOrderReceipt();
    }
}
