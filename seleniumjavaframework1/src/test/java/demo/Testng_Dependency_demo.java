package demo;

import org.testng.annotations.Test;

public class Testng_Dependency_demo

{
	
	@Test(dependsOnGroups={"Sanity1"} )
	public void test1()

	{
		System.out.println("I am inside test1");
	}
	@Test(groups="Sanity1")
	public void test2()

	{
		System.out.println("I am inside test2");
	}

	@Test(groups="Sanity007")
	public void test3()

	{
		System.out.println("I am inside test3");
		
		
	}

	@Test
	public void test4()

	{
		System.out.println("I am inside test4");
		
		
	}

}
