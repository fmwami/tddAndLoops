package ListImplementation;

import org.hamcrest.Matcher;

public class Greeting {

	public boolean getMessage(String mess) {
		// TODO Auto-generated method stub
		String message="hello";
		if(mess.equals(message)){
			return true;
		}
		return false;
	}

}
