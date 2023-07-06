package seleniumproject;
import org.testng.annotations.*;
public class TestNgAnnotations {

		@AfterSuite()
		void m2()
		{
			System.out.println("Inside After Suite");
		}
		@BeforeTest()
		void m3()
		{
			System.out.println("Inside Before Test");
		}
		@AfterTest()
		void m4()
		{
			System.out.println("Inside After Test");
		}
		@BeforeClass()
		void m5()
		{
			System.out.println("Inside Before Class");
		}
		@AfterClass()
		void m6()
		{
			System.out.println("Inside After Class");
		}
		@BeforeGroups()
		void m7()
		{
			System.out.println("Inside Before Groups");
		}
		@AfterGroups()
		void m8()
		{
			System.out.println("Inside After Groups");
		}
		@BeforeMethod()
		void m9()
		{
			System.out.println("Inside Before Method");
		}
		@AfterMethod()
		void m10()
		{
			System.out.println("Inside After Method");
		}
		@Test(enabled=false)
		void testCase1()
		{
			System.out.println("Inside Test Case 1");
		}
		@Test()
		void testCase2()
		{
			System.out.println("Inside Test Case 2");
		}

		@BeforeSuite()
		void m1()
		{
			System.out.println("Inside Before Suite");
		}
	}


