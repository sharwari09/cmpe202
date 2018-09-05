

public class Main {

    public static void main(String[] args) {
        GumballMachine gumballMachine = new GumballMachine(5);

        System.out.println("Testing 25 Cents machine\n");
        System.out.println("Adding 30 in first machine instead of a quarter\n");
        gumballMachine.insertQuarter( 30 );
        
        gumballMachine.turnCrank(1);
        System.out.println("Testing 50 Cents machine\n\n");

        gumballMachine.insertQuarter( 25 );
        gumballMachine.turnCrank(2);
        
        gumballMachine.insertQuarter( 25 );
        gumballMachine.insertQuarter( 30 );
        gumballMachine.turnCrank(2);
        
        System.out.println("Testing All Cents machine\n\n");
        gumballMachine.insertNickel( 5 );
        gumballMachine.turnCrank(3);
        
        gumballMachine.insertDime( 10 );
        gumballMachine.insertDime( 10 );
        gumballMachine.turnCrank(3);
        gumballMachine.insertQuarter( 25 );
        gumballMachine.turnCrank(3);

    }
}
