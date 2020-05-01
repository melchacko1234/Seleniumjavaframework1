package demo;

import org.testng.annotations.Test;
@Test(groups= {"AllClassTests"})
public class Testng_grouping_demo {

	@Test(groups= {"Linus.Regression"})
	public void test1()
	{
		System.out.println("This is Test1");
	}
	
	
	@Test(groups= {"Windows.Regression"})
	public void test2()
	{
		System.out.println("This is Test2");
	}
	
	
	@Test(groups= {"Windows.Regression"})
	public void test3()
	{
		System.out.println("This is Test3");
	}
	
	
	@Test(groups= {"Regression","smoke"})
	public void test4()
	{
		System.out.println("This is Test4");
	}
	
	
	@Test
	public void test5()
	{
		System.out.println("This is Test5");
	}


}
