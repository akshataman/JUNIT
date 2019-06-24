package cg;

//import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

class CalculatorTest {
	static Calculator ob;
	
	@BeforeAll  //In Junit-4, @BeforeClass
	public static void beforeallTests()
	{
		System.out.println("BEFORE ALL TESTS");
		ob=new Calculator();
	}
	
	@AfterAll  //In Junit-4, @AfterClass
	public static void afterAllTests()
	{
		System.out.println("AFTER ALL TESTS");
		ob=null;
	}
	
	@BeforeEach  //in Junit 4, we use @Before
	public void beforeEachTest()  //custom name-- also called Setup in Testing
	{
		System.out.println("Before each test");
		//ob=new Calculator();
	}
	
	@AfterEach  //in Junit 4, we use @After
	public void afterEachTest()
	{
		System.out.println("After each test");
		//ob=null;
	}

	@Test
	void testadd() {
		System.out.println("test case testadd");
		//Calculator ob=new Calculator();
		//Assert.assertEquals(9, ob.add(4,5));
		assertEquals(9,ob.add(4,5));
		
	}
	
	@RepeatedTest(5)
	//@Test
	void testadd1() {
		System.out.println("test case testadd1");
		//Calculator ob=new Calculator();
		//Assert.assertEquals(9, ob.add(4,5));
		assertTrue(ob.add(4,5)>0);
		assertTrue(ob.add(4,-5)>=0);
		}
	
	@Disabled
	@Test
	void testidgenerator() {
		System.out.println("test case testidgenerator");
		
		assertTrue(Calculator.idgenerator()>0);
		//assertTrue(ob.add(4,-5)>=0);
		}
}
