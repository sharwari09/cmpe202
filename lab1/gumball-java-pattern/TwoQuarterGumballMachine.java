
/**
 * Write a description of class TwoQuarterGumballMachine here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class TwoQuarterGumballMachine extends GumballMachine
{
    // instance variables - replace the example below with your own
    /**
     * Constructor for objects of class TwoQuarterGumballMachine
     */
    public TwoQuarterGumballMachine(int numberOfGumballs)
    {
        // initialise instance variables
        super(numberOfGumballs);
        setMachineType(MachineType.twoQuarterMachine);
        
    }
    void releaseBall() {
		System.out.println("A gumball comes rolling out the slot...");
		if (count != 0) {
			count = count - 1;
			valueOfCents = valueOfCents - 50;
		}  
	}
    
    
}
