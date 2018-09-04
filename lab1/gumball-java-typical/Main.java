

public class Main {

    public static void main(String[] args) {
        GumballMachine25 gumballMachine25 = new GumballMachine25(5);
        GumballMachine50 gumballMachine50 = new GumballMachine50(5);
        GumballMachineCommon gumballMachineCommon = new GumballMachineCommon(5);
        
        System.out.println(gumballMachine25);

        gumballMachine25.insertQuarter();
        gumballMachine25.insertNickel();
        gumballMachine25.turnCrank();

        System.out.println(gumballMachine25);

    }
}
