package demo;

import org.testng.annotations.Test;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;



@Test
public class Testng_Failedretry_demo {
	
	
		
		@Test
		public void test1()

		{
			System.out.println("I am inside test1");
		}
		@Test(retryAnalyzer=listener.RetryAnalyzer.class)
		public void test2()

		{
			System.out.println("I am inside test2");
			int i=1/0;
		}

		@Test(retryAnalyzer=listener.RetryAnalyzer.class)
		public void test3()

		{
			System.out.println("I am inside test3");
			int j=1/0;
			
			
		}
 

}
