class Items {
    String name;
    double price;
    int quantity;
    double total;

    String[] toppingsOnTopBun;
    String[] toppingsOnMeat;

    String meat;

    boolean haveToppings;

    Items(String name, double price, int quantity,
                 boolean haveToppings) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.total = price * quantity;
        this.haveToppings = haveToppings;
    }

    void settoppingsOnTopBun(String[] toppingsOnTopBun){

        this.toppingsOnTopBun = toppingsOnTopBun;
    }

    void settoppingsOnMeat(String[] toppingsOnMeat){
        this.toppingsOnMeat = toppingsOnMeat;
    }

    void setMeat(String meat){
        this.meat = meat;
    }
}

