

public class CreditCardNumDecorator implements IDisplayComponent, IKeyEventHandler{
	private CreditCardNum number;
	

	public void key(String ch, int cnt) {
		if(number != null)
			this.number.key(ch, cnt);
	}

	
	public void setNext(IKeyEventHandler next) {
		number.setNext(next);
	}
	
	public CreditCardNumDecorator(CreditCardNum c) {
		if(c != null)
			this.number = c;
	}
	
	public String display() {
		if(number == null)
			return "[4444 4444 4444 4444]";
		String keyStr = number.display().trim().replace("[", "");
		keyStr = keyStr.replace("]", "");
		keyStr = decorateCardNumber(keyStr);
		return "[" + keyStr.trim() + "]";
	}
	
	private String decorateCardNumber(String key) {
		if(key.length() <= 4)
			return key;
		
		StringBuffer temp = new StringBuffer("");
		for(int i = 0; i < key.length(); i++) {
			temp.append(Character.toString(key.charAt(i)));
			if(i > 0 && ((i+1) % 4) == 0)
				temp.append(" ");
		}

		return temp.toString();
	}

	
	public void addSubComponent(IDisplayComponent c) {
		number.addSubComponent(c);
	}
}
