package Testnglearn;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Test1 {
	@Test
	public void ked() {
		// TODO Auto-generated method stub
		System.out.println("kedar");
		System.out.println("kedar1");
		System.out.println("kedar2");
		System.out.println("kedar3");
		System.out.println("kedar4");
		
	}

	@Test(groups= {"smoke"})
	public void testsecong() {
		System.out.println("Ydav");

	}

	@BeforeMethod
	private void TEste2() {
		// TODO Auto-generated method stub

		System.out.println("************");

	}

	@AfterMethod
	private void TEe2() {
		// TODO Auto-generated method stub

		System.out.println("$$$$$$$$$$$$$$$$$$$$");

	}
	
	@AfterClass
	private void AfterClass() {
		// TODO Auto-generated method stub

		System.out.println("Clas test 1 end");

	}
	
	
	@BeforeClass
	private void Beforeclass() {
		// TODO Auto-generated method stub

		System.out.println("Class Test 1 Start");

	}
}
