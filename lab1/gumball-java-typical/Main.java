

public class Main {

    public static void main(String[] args) {
        GumballMachine gumballMachine = new GumballMachine(5);

        System.out.println("Testing 25 Cents machine");

        gumballMachine.insertQuarter( 30 );
        gumballMachine.turnCrank(1);

        System.out.println("Testing 50 Cents machine");

        gumballMachine.insertQuarter( 25 );
        gumballMachine.turnCrank(2);
        
        gumballMachine.insertQuarter( 25 );
        gumballMachine.insertQuarter( 30 );
        gumballMachine.turnCrank(2);
    }
}
