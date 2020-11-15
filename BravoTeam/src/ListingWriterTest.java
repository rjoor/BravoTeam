import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;

public class ListingWriterTest {
  private static ListingList listinglist = ListingList.getInstance();
  ArrayList<Listing> listings = listinglist.getListing();
  ListingList listingss = ListingList.getInstance();

  
  @BeforeEach
  public void setup() {
    listinglist.getInstance().getListing().clear();
  }
  
  @AfterEach
  public void teardown() {
    listinglist.getInstance().getListing().clear();
  }
  
  @Test
  void testWritingZeroListings() {
    listings = ListingLoader.loadListing();
    assertEquals(0, listings.size());
  }
  
  @Test
  void testWritingOneListing() {
	listingss.addListing("100 Apple Street", 2, 3, 600, "pool, pet friendly", 600, false, "12 months", true, 2, false, 1, Type.Apartment);
    ListingWriter.saveListing();
    assertEquals("100 Apple Street", ListingLoader.loadListing().get(1).getAddress());
  }
  
  @Test
  void testWritingFourListings() {
    listingss.addListing("100 Apple Street", 2, 3, 600, "pool, pet friendly", 600, false, "12 months", true, 2, false, 1, Type.Apartment);
	listingss.addListing("205 Brick Street", 2, 2.5, 800, "gym, pool, pet friendly", 1000, false, "12 months", true, 1, false, 2, Type.Duplex);
	listingss.addListing("20 Walk2Campus Ave", 1, 1, 700, "gym, free wifi, pet friendly, washer and dryer", 650, false, "12 months", true, 2, false, 3, Type.Apartment);
	listingss.addListing("5 Apple Street", 3, 3, 1200, "free wifi", 800, false, "12 months", true, 2, false, 4, Type.Apartment);
    ListingWriter.saveListing();
    assertEquals(3, ListingLoader.loadListing().get(1).getID());
  }
  
  @Test
  void testWritingEmptyListing() {
	listingss.addListing("", 0, 0, 0, "", 0, false, "", true, 0, false, 0, Type.Apartment);
    assertEquals("", ListingLoader.loadListing().get(1).getAddress());
  }  
}