
/**
 * Write a description of class Main here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Main {

    public static void main(String[] args) {
        GumballMachine gumballMachine = new GumballMachine(5);
        OneQuarterGumballMachine oneQuarterGumballMachine =new OneQuarterGumballMachine(10);
        TwoQuarterGumballMachine twoQuarterGumballMachine =new TwoQuarterGumballMachine(15);
        
        System.out.println("\n **** Testing One Quarter Cents machine **** ");
        oneQuarterGumballMachine.insertQuarter();
        oneQuarterGumballMachine.turnCrank();
        
        System.out.println("\n\n **** Testing Two Quarter Cents machine ****");
        twoQuarterGumballMachine.insertQuarter();
        twoQuarterGumballMachine.insertQuarter();
        twoQuarterGumballMachine.turnCrank();
        twoQuarterGumballMachine.insertNickel();
        twoQuarterGumballMachine.insertDime();
        twoQuarterGumballMachine.insertDime();
        twoQuarterGumballMachine.insertDime();
        twoQuarterGumballMachine.insertNickel();
        twoQuarterGumballMachine.insertDime();
        twoQuarterGumballMachine.turnCrank();

        System.out.println("\n\n **** Testing Slot machine ****");
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();
        gumballMachine.insertNickel();
        gumballMachine.insertDime();
        gumballMachine.insertDime();
        gumballMachine.turnCrank();
    }
}