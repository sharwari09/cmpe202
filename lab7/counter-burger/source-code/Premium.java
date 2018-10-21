public class Premium extends LeafDecorator
{
    private String[] options ;
    
    
    public Premium( String d )
    {
        super(d) ;
    }
    
    // Add $+1.50 for every premium topping
    public void setOptions( String[] options )
    {
        this.options = options ;
        for ( int i = 0; i<options.length; i++ )
        {
            //$3 for Marinated Tomatoes
            if ( "Marinated Tomatoes".equals(options[i]) ) 
                this.price += 3  ;
            else 
                this.price +=1;
        }
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