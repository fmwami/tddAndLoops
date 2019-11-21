package ListImplementation;



import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class ListDetailsTest {
	List<Object> list = new CustomList<>();
	@Test
	public void TestListEmpty (){
		list.add(null);
		
		Assert.assertFalse("The Lits is", list.isEmpty());
		
		
		
	}
	@Test
	public void TestCount(){
		
		
	}
	@Test
	public void TestSizeOfList(){
		
		
	}

}
