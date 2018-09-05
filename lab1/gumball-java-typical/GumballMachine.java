
public class GumballMachine
{

    public int num_gumballs;
    public boolean has_quarter;
    public boolean has_nickel;
    public boolean has_dime;
    public int noOfQuarters;
    public int valueOfCoins;

    public GumballMachine( int size )
    {
        // initialise instance variables
        this.num_gumballs = size;
        this.has_quarter = false;
        this.valueOfCoins = 0;
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
                break;
            case 2:
                turnCrankFor50Cents();
                break;
            
        }
    }
    
    public void turnCrankFor25Cents()
    {
        if ( this.has_quarter )
        {
            if ( this.num_gumballs > 0 )
            {
                this.num_gumballs-- ;
                this.has_quarter = false ;
                this.valueOfCoins = this.valueOfCoins - 25;
                System.out.println( "Thanks for your quarter.  Gumball Ejected!" ) ;
                System.out.format( "Value of coins is: %d\n",this.valueOfCoins ) ;
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
        System.out.format( "Value of coins is: %d\n",this.valueOfCoins ) ;
        if ( this.has_quarter )
        { 
            if (this.valueOfCoins >= 50)
            {
                if ( this.num_gumballs > 0 )
                {
                    this.num_gumballs-- ;
                    this.has_quarter = false ;
                    this.valueOfCoins = this.valueOfCoins - 50;
                    System.out.println( "Thanks for your quarter.  Gumball Ejected!" ) ;
                }
                else
                {
                    System.out.println( "No More Gumballs!  Sorry, can't return your quarters." ) ;
                }
            }
            else
            {
                System.out.println( "You have inserted " + this.valueOfCoins + "cents" ) ;
                System.out.format("Please insert more %d to get a gumball\n", (50 - this.valueOfCoins)) ;
            }
        }
        else 
        {
            System.out.println( "Please insert a quarter" ) ;
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
