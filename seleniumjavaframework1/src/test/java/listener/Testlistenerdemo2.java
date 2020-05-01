package listener;

import org.testng.annotations.Test;

import junit.framework.Assert;

import static org.testng.Assert.assertTrue;

import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Test

public class Testlistenerdemo2 {
	
	
	public void test4()
	{
		System.out.println("I am inside test4");
	}

	public void test5()
	{
		System.out.println("I am inside test5");
		
	}

	public void test6()
	{
		System.out.println("I am inside test6");
		throw new SkipException("This test3 is Skipped");
	}

}
