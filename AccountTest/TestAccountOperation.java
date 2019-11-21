package AccountTest;

import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.Assert;

public class TestAccountOperation {
	Account account = new Account();
	@Test
	public void testDeposit() {
		account.afterDeposit(200);
		assertEquals("after deposit",200,account.balance());
		
		
		
	
	}
	@Test
	public void testWithdrawal(){
		account.afterWithdrawal(-100);
		assertEquals("after withdrawal",100,account.balance());
		
	}
	

}
