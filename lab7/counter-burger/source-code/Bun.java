
/**
 * Write a description of class Bun here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Bun extends LeafDecorator
{
    // instance variables - replace the example below with your own
    private String[] options ;
    
    
    public Bun( String d )
    {
        super(d) ;
    }
    
    // No extra cost for bun type
    public void setOptions( String[] options )
    {
        this.options = options ;
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
