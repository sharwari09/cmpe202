

public class NoSufficientCoinsState implements State {
    GumballMachine gumballMachine;
    
    public NoSufficientCoinsState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }
 
    public void insertCoin(int coin) {
        if (gumballMachine.checkForCentAcceptance(coin))
            System.out.println("Inserted cents are accepted");
        else
            return;

        gumballMachine.setValueOfCoins(gumballMachine.getValueOfCoins()+ coin);
        int valueOfCoins=gumballMachine.getValueOfCoins();
        
        if (valueOfCoins>=gumballMachine.getExpectedValueOfCents()){
            gumballMachine.setState(gumballMachine.gethasSufficientCoinsState());
            System.out.println("You have entered a total amount of "+ valueOfCoins +" cents.");
            System.out.println("Sufficient amount inserted, you may now turn the crank.");
        }
        else
            System.out.println("Please insert "+ (gumballMachine.getExpectedValueOfCents() - 
                               valueOfCoins) +" cents more.");
    }   
       
    public void ejectCoin() {
        int priceOfCoins= gumballMachine.getValueOfCoins();
        if (priceOfCoins>0){
            System.out.println("Returning" + priceOfCoins + " cents" );
            gumballMachine.setValueOfCoins(0);
        } 
        else
            System.out.println("You haven't inserted any coin");
    }
 
    public void turnCrank() {
        int expectedValueofCoins = gumballMachine.getExpectedValueOfCents();
        int balanceAmount = expectedValueofCoins-gumballMachine.getValueOfCoins();
        if (balanceAmount > 0){
            System.out.println("You turned the crank, but please check the balance once");
            System.out.println("Cost of a gumball for Gumball Machine ("+ gumballMachine.machineType +") is " 
                               + expectedValueofCoins + " cents, insert more "+
                               (balanceAmount + "Cents"));
                            }
        else
            System.out.println("You turned, but there's no coin");
    }
 
    public void dispense() {
        System.out.println("You need to pay sufficient amount first");
    } 
 
    public String toString() {
        return "waiting for additional coins...";
    }
}
