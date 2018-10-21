
/**
 * Write a description of class SideFood here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class SideFood extends LeafDecorator
{
    // instance variables - replace the example below with your own
    private String[] options ;
    
    
    public SideFood( String d )
    {
        super(d) ;
    }
    
    // Every side 3.00
    public void setOptions( String[] options )
    {
        this.options = options ;
        if ( options.length > 0 )
            this.price += options.length * 3.00 ;
    }
    
    public String getDescription() 
    {
        String desc = "   " ;
        for ( int i = 0; i<options.length; i++ )
        {
            if (i>0) desc += " + " + options[i] ;
            else desc = options[i] ;
        }        
        return desc ;
    }
}
