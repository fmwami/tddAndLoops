package letsPlayTdd;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class savingsAccountTest {
	@Test
	public void depositAndWithdrawal(){
		SavingsAccount account = new SavingsAccount();
		account.deposit(100);
		assertEquals("after deposit",100,account.balance());
	     account.withdrawal(50);
	     assertEquals("after withdrawal",50,account.balance());
	
	}
	@Test
	public void TestPasswordLenght(){
		//PasswordValidator password= new PasswordValidator();
		assertEquals(true,PasswordValidator.isValid("12345"));
		
	}

}
