class OrderContext {

    private PrintOrder printorderstrategy;

    OrderContext(PrintOrder printorderstrategy){
        this.printorderstrategy = printorderstrategy;
    }

    void executeprintOrderStrategy(Order order){

        printorderstrategy.printOrderReceipt(order);
    }
}
