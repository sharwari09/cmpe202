import java.util.Arrays;
import java.util.List;

public class GumballMachine{
 
        State soldOutState;
        State hasSufficientCoinsState;
        State noSufficientCoinsState;
        State soldState;
     
        State state = soldOutState;
        int count = 0;
        int valueOfCents = 0 ;
        public MachineType machineType;
        
        public enum MachineType
        {
            
            oneQuarterMachine{
                Integer[] acceptableCents = {25};
                int executeGetExpectedValue(){
                    return 25;
                }
                
                boolean isCentAcceptable(int coin){
                    List<Integer> acceptableCentsList = Arrays.asList(acceptableCents);
                    if(!acceptableCentsList.contains(coin)){
                        System.out.println("Please insert Quarters in One Quarter Gumball Machine");
                        return false;
                    }
                    return true;    
                }
            },
            twoQuarterMachine{
                Integer[] acceptableCents = {25};
                int executeGetExpectedValue(){
                    return 50;
                }
                boolean isCentAcceptable(int coin){
                    List<Integer> acceptableCentsList = Arrays.asList(acceptableCents);
                    if(!acceptableCentsList.contains(coin)){
                        System.out.println("Please insert Quarters in Two Quarters Gumball Machine !");
                        return false;
                    }
                    return true;
                }
            },
            slotMachine{
                Integer[] acceptableCents = {5, 10, 25};
                int executeGetExpectedValue(){
                    return 50;
                }
                boolean isCentAcceptable(int coin){
                    List<Integer> acceptableCentsList = Arrays.asList(acceptableCents);
                    if(!acceptableCentsList.contains(coin)){
                        System.out.println("Please insert Quarters, Dimes and Nickels in Slot Gumball Machine");
                        return false;
                    }
                    return true;
                }
            };
            abstract int executeGetExpectedValue();
            abstract boolean isCentAcceptable(int coin);
        }
 
        public GumballMachine(int numberOfGumballs) {
            soldOutState = new SoldOutState(this);
            noSufficientCoinsState = new NoSufficientCoinsState(this);
            hasSufficientCoinsState = new HasSufficientCoinsState(this);
            soldState = new SoldState(this);
           
    
            this.count = numberOfGumballs;
            if (numberOfGumballs > 0) {
                state = noSufficientCoinsState;
            } 
            setMachineType(MachineType.slotMachine);
        }
    
        public void setMachineType(MachineType machineType)
        {
            this.machineType = machineType;
        }
        
        public int getExpectedValueOfCents()
        {
            return this.machineType.executeGetExpectedValue();
        }
        
        public boolean checkForCentAcceptance(int coin)
        {
            return this.machineType.isCentAcceptable(coin);
        }
        
        public void insertNickel(){
            System.out.println("You have inserted a Nickel!");
            state.insertCoin(5);    
        }
        
        public void insertDime(){
            System.out.println("You have inserted a Dime!");
            state.insertCoin(10);
        }
     
        public void insertQuarter() {
            System.out.println("You have inserted a Quarter!");
            state.insertCoin(25);
        }
     
        public void turnCrank() {
            state.turnCrank();
            state.dispense();
        }
        
        public void ejectCoin() {
            state.ejectCoin();
        }
        
        public void setValueOfCoins(int coin){
            valueOfCents = coin;
        }
        
        public int getValueOfCoins() {
            return valueOfCents;
        }
        void releaseBall() {
            System.out.println("A gumball comes rolling out the slot...");
            if (count != 0) {
                count = count - 1;
                valueOfCents = valueOfCents - 50;
            } 
        }  
     
        int getCount() {
            return count;
        }
     
        void refill(int count) {
            this.count = count;
            state = noSufficientCoinsState;
        }
    
        public State  getState() {
            return state;
        }
    
        void setState(State state) {
            this.state = state;
        }
    
        public State  getSoldOutState() {
            return soldOutState;
        }
    
        public State  getnoSufficientCoinsState() {
            return noSufficientCoinsState;
        }
    
        public State  gethasSufficientCoinsState() {
            return hasSufficientCoinsState;
        }
    
        public State  getSoldState() {
            return soldState;
        }
     
        public String toString() {
            StringBuffer result = new StringBuffer();
            result.append("\nMighty Gumball, Inc.");
            result.append("\nJava-enabled Standing Gumball Model #2004");
            result.append("\nInventory: " + count + " gumball");
            if (count != 1) {
                result.append("s");
            }
            result.append("\n");
            result.append("Machine is " + state + "\n");
            return result.toString();
        }
     
}
