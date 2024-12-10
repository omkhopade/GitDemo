package Inheritance;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assertion {

SoftAssert  sa= new SoftAssert();
@Test(priority = 1)
public void Verify1()
{
	Assert.assertEquals(7,5);
	System.out.println("This is after hard assrtion failed ");
}


@Test(priority = 2)
public void Verify2()
{
	Assert.assertEquals(2,2);
	System.out.println("This is verify 2");
}

@Test
public void verify3()
{
	sa.assertEquals(3, 9);
	System.out.println("This is after  soft assertion failed");
	sa.assertAll();
}




}
