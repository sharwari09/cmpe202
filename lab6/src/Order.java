import java.util.ArrayList;
import java.util.List;

class Order {
    double subTotal;
    String date;
    String time;
    int orderNumber;
    List<Items> items = new ArrayList<>();

    Order(String date, String time, int  orderNumber) {
        this.subTotal = 0;
        this.date = date;
        this.time = time;
        this.orderNumber = orderNumber;
    }

    void setItemsInOrder(List<Items> items){
        this.items = items;
    }

    double getOrderSubtotal(){
        for (Items i: items)
        {
            this.subTotal = this.subTotal + i.total;
        };
        return this.subTotal;
    }

}
