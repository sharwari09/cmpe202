import java.util.ArrayList;
import java.util.List;

public class Order {
    double subTotal;
    String date;
    String time;
    int orderNumber;
    List<Items> items = new ArrayList<>();

    public Order(String date, String time, int  orderNumber) {
        this.subTotal = 0;
        this.date = date;
        this.time = time;
        this.orderNumber = orderNumber;
    }
    public void setItemsInOrder(List<Items> items){
        this.items = items;
    }

    public double getOrderSubtotal(){
        for (Items i: items)
        {
            this.subTotal = i.total;
        };
        return this.subTotal;
    }

}
