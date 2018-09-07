public class SoldState implements State {
 
    GumballMachine gumballMachine;
 
        public SoldState(GumballMachine gumballMachine) {
            this.gumballMachine = gumballMachine;
        }
          
        public void insertCoin(int coin){
            System.out.println("Please wait, we're already giving you a gumball!");
        }
           
        public void ejectCoin() {
            System.out.println("Sorry, you already turned the crank!");
        }
     
        public void turnCrank() {
            System.out.println("Turning twice doesn't get you another gumball!");
        }

        public void dispense() {
            if (gumballMachine.getCount() > 0) {
                gumballMachine.releaseBall();
                if (gumballMachine.getValueOfCoins() > 0) {
                    int valueOfCoins = gumballMachine.getValueOfCoins();
                    System.out.println("Returning " + valueOfCoins + " cents" );
                    gumballMachine.setValueOfCoins(0);
                    }
                gumballMachine.setState(gumballMachine.getnoSufficientCoinsState());             
            } 
            else {
                System.out.println("Oops, out of gumballs!");
                gumballMachine.setState(gumballMachine.getSoldOutState());
            }
        }
 
        public String toString() {
            return "releasing a gumball...";
        }
}


