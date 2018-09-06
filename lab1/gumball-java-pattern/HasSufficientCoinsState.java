

import java.util.Random;

public class HasSufficientCoinsState implements State {
        GumballMachine gumballMachine; 
        public HasSufficientCoinsState(GumballMachine gumballMachine) {
            this.gumballMachine = gumballMachine;
        }
        
        public void insertCoin(int coin){
            if (gumballMachine.checkForCentAcceptance(coin))
                System.out.println("Inserted cents are accepted");
            else
                return;
            gumballMachine.setValueOfCoins(gumballMachine.getValueOfCoins() + coin);
        }
            
        public void ejectCoin() {
            System.out.println("Returning " + gumballMachine.getValueOfCoins() + " cents" );
            gumballMachine.setValueOfCoins(0);
            gumballMachine.setState(gumballMachine.getnoSufficientCoinsState());
        }
     
        public void turnCrank() {
            System.out.println("You turned...");
            gumballMachine.setState(gumballMachine.getSoldState());
        }
    
        public void dispense() {
            System.out.println("No gumball dispensed");
        }
 
        public String toString() {
            return "waiting for turn of crank...";
        }
}
