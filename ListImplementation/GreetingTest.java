package ListImplementation;

import org.junit.Assert;
import org.junit.Test;

public class GreetingTest {
	@Test
	public void saysHello(){
		Greeting greeting = new Greeting();
		Assert.assertTrue(greeting.getMessage("hello"));
		
	}

}
