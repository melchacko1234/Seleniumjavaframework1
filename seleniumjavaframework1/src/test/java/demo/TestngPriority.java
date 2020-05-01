package demo;

import org.apache.maven.plugin.surefire.runorder.Priority;
import org.testng.annotations.Test;

public class TestngPriority {
	@Test
	public void one()
	{
		System.out.println("First test is completed ");
	}

	@Test(priority=2)
	public void Two()
	{
		System.out.println("Second test is completed ");
	}
	@Test(priority = 1)
	public void Three()
	{
		System.out.println("Third test is completed ");
	}

}
