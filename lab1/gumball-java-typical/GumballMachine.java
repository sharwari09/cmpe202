
public class GumballMachine
{

    public int num_gumballs;
    public boolean has_quarter;
    public boolean has_nickel;
    public boolean has_dime;
    public int valueOfCoins = 0 ;

    public GumballMachine( int size )
    {
        // initialise instance variables
        this.num_gumballs = size;
        this.has_quarter = false;
    }
    
    public void insertQuarter(int coin)
    {
        if ( is_quarter(coin) == true ){
            this.has_quarter = true ;
            valueOfCoins = valueOfCoins + coin;
        }
        else 
            this.has_quarter = false ;
    }
    
    public void insertNickel(int coin)
    {
        if ( is_quarter(coin) == false ){
            valueOfCoins = valueOfCoins + coin;
        }
        else 
            this.has_quarter = false ;
    }
    
    public void insertDime(int coin)
    {
        if ( is_quarter(coin) == false ){
            valueOfCoins = valueOfCoins + coin;
        }
        else 
            this.has_quarter = false ;
    }
    
    public void turnCrank(int MachineType)
    {
        switch(MachineType)
        {
            case 1:
                turnCrankFor25Cents();
                initValueOfcoins();
                break;
            case 2:
                turnCrankFor50Cents();
                initValueOfcoins();
                break;
            case 3:
                turnCrankForAllCents();
                initValueOfcoins();
                break;
        }
    }
    
    public void initValueOfcoins()
    {
        valueOfCoins = 0;
    }
    
    public void turnCrankFor25Cents()
    {
        System.out.format( "In 25 cents machine \n \nValue of coins is: %d\n ", valueOfCoins ) ;
        if ( this.has_quarter )
        {
            if ( this.num_gumballs > 0 )
            {
                this.num_gumballs-- ;
                this.has_quarter = false ;
                valueOfCoins = valueOfCoins - 25;
                System.out.println( "Thanks for your quarter.  Gumball Ejected!" ) ;
                System.out.format( "Value of coins is: %d\n", valueOfCoins ) ;
            }
            else
           {
                System.out.println( "No More Gumballs!  Sorry, can't return your quarter." ) ;
            }
        }
        else 
        {
            System.out.println( "Please insert a quarter" ) ;
        } 
    }
    
    public void turnCrankFor50Cents()
    {
        System.out.format( "In 50 cents machine \n \nValue of coins is: %d\n ", valueOfCoins ) ;
        if ( this.has_quarter )
        { 
            if (valueOfCoins >= 50)
            {
                if ( this.num_gumballs > 0 )
                {
                    this.num_gumballs-- ;
                    this.has_quarter = false ;
                    valueOfCoins = valueOfCoins - 50;
                    System.out.println( "Thanks for your quarter.  Gumball Ejected!" ) ;
                }
                else
                {
                    System.out.println( "No More Gumballs!  Sorry, can't return your quarters." ) ;
                }
            }
            else
            {
                System.out.println( "You have inserted " + valueOfCoins + "cents" ) ;
                System.out.format("Please insert more %d to get a gumball\n", (50 - valueOfCoins)) ;
            }
        }
        else 
        {
            System.out.println( "Please insert a quarter" ) ;
        } 
    }
    
    public void turnCrankForAllCents()
    {
        System.out.format( "In All cents machine \n \nValue of coins is: %d\n ", valueOfCoins ) ;
        if (valueOfCoins >= 50)
            {
                if ( this.num_gumballs > 0 )
                {
                    this.num_gumballs-- ;
                    valueOfCoins = valueOfCoins - 50;
                    System.out.println( "Thanks for your money.  Gumball Ejected!" ) ;
                }
                else
                {
                    System.out.println( "No More Gumballs!  Sorry, can't return your  money." ) ;
                }
            }
            else
            {
                System.out.println( "You have inserted " + this.valueOfCoins + "cents" ) ;
                System.out.format("Please insert more %d to get a gumball\n", (50 - valueOfCoins)) ;
            }
    }
    
    public boolean is_quarter(int coin)
    {
        if ( coin == 25 )
            return true;
        else
            return false;
    }
    
    public boolean is_nickel(int coin)
    {
        if ( coin == 5 )
            return true;
        else
            return false;
    }
    
    public boolean is_dime(int coin)
    {
        if ( coin == 10 )
            return true;
        else
            return false;
    }

}
