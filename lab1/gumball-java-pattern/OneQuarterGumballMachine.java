
/**
 * Write a description of class OneQuarterGumballMachine here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class OneQuarterGumballMachine extends GumballMachine
{
    // instance variables - replace the example below with your own
    /**
     * Constructor for objects of class OneQuarterGumballMachine
     */
    public OneQuarterGumballMachine(int numberOfGumballs)
    {
        // initialise instance variables
        super(numberOfGumballs);
        setMachineType(MachineType.oneQuarterMachine);
        
    }
    void releaseBall() {
		System.out.println("A gumball comes rolling out the slot...");
		if (count != 0) {
			count = count - 1;
			valueOfCents = valueOfCents - 25;
		} 
	}
    
    
}
