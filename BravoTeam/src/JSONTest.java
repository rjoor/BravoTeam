import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.jupiter.api.Test;

class JSONTest {

	@BeforeClass
	public static void oneTimeSetup() {
		AddJSON json = new AddJSON();
		json.addListingsJSON();
	}
	
	@AfterClass
	public static void oneTimeTearDown() {
		
	}
	
	@Before
	public static void setup() {
		//runs before each test
		AddJSON json = new AddJSON();
		json.addListingsJSON();
	}
	
	@After
	public static void tearDown() {
		//runs after each test
	}
	
	//assertEquals(val1,val2)
	//assertFalse(val)
	//assertTrue(val)
	//assertSame(val1,val2)
	//assertNotSame(val1,val2)
	//assertNull(val)
	//assertNotNull(val)
	
	@Test
	public void testListingJSONAdd() {
		AddJSON json = new AddJSON();
		json.addListingsJSON();
		ListingList listings = ListingList.getInstance();
		ArrayList<Listing> lists = listings.getListing();
		String finalL = null;
		for (Listing ll : lists) {
			finalL = ll.getAddress();
		}
		assertEquals("5 LiveSC", finalL);
	}

}
