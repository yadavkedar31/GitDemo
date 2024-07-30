package Testnglearn;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.Assert;

public class TEst3 {

	@Test(groups = { "smoke" })
	private void tEste3() {
		// TODO Auto-generated method stub

		System.out.println("BYE BYE2***********11111");
		Assert.assertTrue(false);
	

	}

	@Test(dataProvider="getdata")
	private void CASE1(String k , String y) {
		// TODO Auto-generated method stub

		System.out.println(k);
		System.out.println(y);

	}

	@Parameters({ "URL" })
	@Test
	public void sfsfsfd(String k) {
		// TODO Auto-generated method stub

		System.out.println("BYE2");
		System.out.println(k);

	}

	@DataProvider
	public Object[][] getdata() {

		Object[][] data = new Object[3][2];
		//1
		data[0][0] = "U1";
		data[0][1] = "P1";
		//2
		data[1][0] = "U2";
		data[1][1] = "P2";
		//3
		data[2][0] = "U3";
		data[2][1] = "P3";
		return data;
	}

}
