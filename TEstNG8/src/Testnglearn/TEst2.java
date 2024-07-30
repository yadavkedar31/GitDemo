package Testnglearn;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class TEst2 {

	@BeforeMethod
	private void TEste2() {
		// TODO Auto-generated method stub

		System.out.println("************");

	}

	@Test(groups= {"smoke"})
	private void TEste3() {
		// TODO Auto-generated method stub

		System.out.println("Smoke2");
		System.out.println("Smoke2");
		System.out.println("Smoke2");
		System.out.println("Smoke2");
		System.out.println("Smoke2");
		

	}
	
	@Test
	private void CASE1() {
		// TODO Auto-generated method stub

		System.out.println("BYE BYE123");
		System.out.println("BYE BYE123");
		System.out.println("BYE BYE123");
		System.out.println("BYE BYE123");
		System.out.println("BYE BYE123");
		

	}

	@Test
	private void CASE12() {
		// TODO Auto-generated method stub

		System.out.println("BYE BYE123");
		System.out.println("BYE BYE123");
		System.out.println("BYE BYE123");
		System.out.println("BYE BYE123");
		System.out.println("BYE BYE123");
		

	}

	@AfterTest
	private void CASE4() {
		// TODO Auto-generated method stub

		System.out.println("BYE BYE344444444444444444444444");
	}

	@BeforeSuite
	private void CASE3() {
		// TODO Auto-generated method stub

		System.out.println("BYE BYE  Start");
	}

	@AfterSuite
	private void CASE2() {
		// TODO Auto-generated method stub

		System.out.println("BYE BYE END  ");
	}

	

}
