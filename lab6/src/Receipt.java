public class Receipt implements PrintOrder {


    String name;
    double price;
    int quantity;
    double total;

    public Receipt() {
        System.out.println("Receipt Display");
        this.name = "LBB";
        this.price = 5.59;
        this.quantity = 1;
        this.total = price * quantity;
    }
 /** Consider String array for toppings and print he toppings*/

    @Override
    public String printOrderReceipt() {
        return this.name + "                   $" + this.price+ "\n\n"
                + "Sub. Total:           $" + this.total;
    }

}
