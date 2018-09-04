
public class GumballMachine25 implements GumballMachineInterface
{

    private int num_gumballs;
    private boolean has_quarter;
    private boolean is_quarter;
    private boolean is_half;

    public GumballMachine25( int size )
    {
        // initialise instance variables
        this.num_gumballs = size;
        this.has_quarter = false;
    }

    public void insertQuarter()
    {
        this.has_quarter = true ;
    }
    
    public void insertHalf(int coin)
    {
        System.out.println("Half inserted");
    }
    
    public void turnCrank()
    {
        if ( this.has_quarter )
        {
            if ( this.num_gumballs > 0 )
            {
                this.num_gumballs-- ;
                this.has_quarter = false ;
                System.out.println( "Thanks for your quarter.  Gumball Ejected!" ) ;
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
    public void insertNickel(){
        System.out.println("Sorry! Can't accept Nickels..");
    }
    public void insertDime(){
        System.out.println("Sorry! Can't accept Dimes..");
    }
    public boolean hasQuarter()
    {
        if (this.has_quarter == true){
            return true;
        }
        else{
            return false;
        }
    }
}
