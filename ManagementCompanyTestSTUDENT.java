package application;

import static org.junit.jupiter.api.Assertions.*;

//import org.junit.jupiter.api.Test;

//import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class ManagementCompanyTestSTUDENT {
	
	ManagementCompany m;
	Property p1, p2, p3;
	
	@Before
	public void setUp() throws Exception {
		//student create a management company
		m = new ManagementCompany("Gravity", "4312",7);
		
		//student add three properties, with plots, to mgmt co
		p1 = new Property ("Connor lake", "Arlington", 1938, "Keith Hart",1,1,0,0);
		p2 = new Property ("Friends House", "Ashburn", 4121, "Bob Wart",2,2,1,1);
		p3 = new Property ("Jupiter Ground", "Columbia", 2250, "Karen Greg",3,3,2,2);
		
		m.addProperty(p1);
		m.addProperty(p2);
		m.addProperty(p3);
	}

	@After
	public void tearDown() throws Exception {
		//student set mgmt co to null
		//p1 = p2 = p3 = null;
		m = null;
	}

	@Test
	public void testAddPropertyDefaultPlot() {
		// fail("STUDENT test not implemented yet");
		//student should add property with 4 args & default plot (0,0,1,1)
		//student should add property with 8 args
		//student should add property that exceeds the size of the mgmt co array and can not be added, add property should return -1
		
		assertEquals(m.addProperty("Arizona Place", "Tampa", 3230, "John Frog"), 3, 0);
		assertEquals(m.addProperty("Grants Palace", "Hyattsville", 1725, "Greg Doss", 1, 1, 1, 1), 4, 0);
		assertEquals(m.addProperty("Frantz Terrace", "White Oak", 2350, "Paul Karen", 2, 2, 0, 0), -1, 2);
	}
 
	@Test
	public void testMaxRentProp() {
		//fail("STUDENT test not implemented yet");
		//student should test if maxRentProp contains the maximum rent of properties
		
		String maxRentString = m.maxRentProp().split("\n")[3];
		assertTrue(maxRentString.contains("4121"));
	}

	@Test
	public void testTotalRent() {
		//fail("STUDENT test not implemented yet");
		//student should test if totalRent returns the total rent of properties
		
		assertEquals(m.totalRent(), 8309.0, 0);
	}

 }
