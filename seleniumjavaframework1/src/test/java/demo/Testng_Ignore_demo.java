package demo;

import org.testng.annotations.Test;




public class Testng_Ignore_demo {
	
	@Test(enabled=false)
	public void test1()
	
	{
		System.out.println("I am inside test1");
	}
	
	@Test
	public void test2()
	
	{
		System.out.println("I am inside test2");
	}


}
