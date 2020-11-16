import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
/*
 *  Bravo Team 11-15-20
 *  The ListingWriterTester runs a variety of tests on the ListingWriter class to check for errors within.
 */
public class ListingWriterTest {
  private static ListingList listinglist = ListingList.getInstance();
  ArrayList<Listing> listings = listinglist.getListing();
  ListingList listingss = ListingList.getInstance();

  /*
   * The setup() method clears the listing before each test.
   */
  @BeforeEach
  public void setup() {
    listinglist.getInstance().getListing().clear();
  }
  /*
   * The teardown() method clears the listing after each test is performed.
   */
  @AfterEach
  public void teardown() {
    listinglist.getInstance().getListing().clear();
  }
  /*
   * The testWritingZeroListings() method performs the first test on the Writer class by asserting 0 listings.
   */
  @Test
  void testWritingZeroListings() {
    listings = ListingLoader.loadListing();
    assertEquals(0, listings.size());
  }
  /*
   * The testWritingOneListing() method performs a test with 1 listing in the Writer.
   */
  @Test
  void testWritingOneListing() {
	listingss.addListing("100 Apple Street", 2, 3, 600, "pool, pet friendly", 600, false, "12 months", true, 2, false, 1, Type.Apartment);
    ListingWriter.saveListing();
    assertEquals("100 Apple Street", ListingLoader.loadListing().get(1).getAddress());
  }
  /*
   * The testWritingFourListings() method performs a test with 3 listings in the Writer.
   */
  @Test
  void testWritingFourListings() {
    listingss.addListing("100 Apple Street", 2, 3, 600, "pool, pet friendly", 600, false, "12 months", true, 2, false, 1, Type.Apartment);
	listingss.addListing("205 Brick Street", 2, 2.5, 800, "gym, pool, pet friendly", 1000, false, "12 months", true, 1, false, 2, Type.Duplex);
	listingss.addListing("20 Walk2Campus Ave", 1, 1, 700, "gym, free wifi, pet friendly, washer and dryer", 650, false, "12 months", true, 2, false, 3, Type.Apartment);
	listingss.addListing("5 Apple Street", 3, 3, 1200, "free wifi", 800, false, "12 months", true, 2, false, 4, Type.Apartment);
    ListingWriter.saveListing();
    assertEquals(3, ListingLoader.loadListing().get(1).getID());
  }
  /*
   * The testWritingEmptyListing() method performs a test of an empty listing in the Writer.
   */
  @Test
  void testWritingEmptyListing() {
	listingss.addListing("", 0, 0, 0, "", 0, false, "", true, 0, false, 0, Type.Apartment);
    assertEquals("", ListingLoader.loadListing().get(1).getAddress());
  }  
}