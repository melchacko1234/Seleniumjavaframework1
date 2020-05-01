package demo;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Testng_Parameters_Demo {
	
	@Test
	@Parameters({"MyName"})
	public void test(@Optional("Mel")String name)
	{
		System.out.println("The Name is :"+name );
	}

}
