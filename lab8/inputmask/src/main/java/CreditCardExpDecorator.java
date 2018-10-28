

public class CreditCardExpDecorator implements IDisplayComponent, IKeyEventHandler{
	private CreditCardExp exp;
	
	public CreditCardExpDecorator(CreditCardExp c) {
		exp = c;
	}
	
    public void setNext( IKeyEventHandler next) {
    	if(exp != null)
    		exp.setNext(next);
    }	
    
    private String formatCardExp(String key) {
		if(key.length() <= 2)
			return key;

		String formatted = "";

	    for(int i = 0; i < key.length(); i++) {
	        if (i % 2 == 0 && i > 0) {
	            formatted += "/";
	        }
	        formatted += key.substring(i, i+1);
	    }

	    return formatted;
	}

	public String display() {
		if(exp == null)
			return "[MMYY]";
		String keyStr = exp.display().trim();
		keyStr = keyStr.replace("[", "");
		keyStr = keyStr.replace("]", "");
		if(keyStr.length() > 2)
			keyStr = formatCardExp(keyStr);
		return "[" + keyStr.trim() + "]";
	}	

	public void key(String ch, int cnt) {
		if(exp != null)
			exp.key(ch, cnt);
	}

	public void addSubComponent( IDisplayComponent c ) {
		return ; // do nothing
	}
}
