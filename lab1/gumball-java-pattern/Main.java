
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
        
        System.out.println("\n **** Testing for One Quarter Cents machine **** ");
        oneQuarterGumballMachine.insertQuarter();
        oneQuarterGumballMachine.turnCrank();
        
        System.out.println("\n\n **** Testing for Two Quarter Cents machine ****");
        twoQuarterGumballMachine.insertQuarter();
        twoQuarterGumballMachine.insertQuarter();
        twoQuarterGumballMachine.turnCrank();
        gumballMachine.insertNickel();
        gumballMachine.insertDime();
        gumballMachine.insertDime();
        gumballMachine.insertDime();
        gumballMachine.insertNickel();
        gumballMachine.insertDime();
        gumballMachine.turnCrank();

        System.out.println("\n\n **** Testing for Slot machine ****");
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();
        gumballMachine.insertNickel();
        gumballMachine.insertDime();
        gumballMachine.insertDime();
        gumballMachine.turnCrank();
    }
}