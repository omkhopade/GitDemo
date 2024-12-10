import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class TestNgDemo {

	@BeforeSuite
	public void Suit1()
	{
		System.out.println(" Before Suites");
	}
	
	@AfterSuite
	public void Suite2()
	{
		System.out.println("After Suites");
	}
	@Test
	public void T1()
	{
		System.out.println("Helle T1");
	}
	
	@BeforeMethod
	public void M1()
	{
		System.out.println("Before method");
	}
	
	@AfterMethod
	public void M12()
	{
		System.out.println("After Method");
	}
	
	@Test
	public static void T3()
	{
		System.out.println("Test 2");
	}
}
