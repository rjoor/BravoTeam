import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
/*
 * Bravo Team 11-15-20
 * The ListingListLoaderTest performs tests on the ListingListLoader class.
 */
public class ListingListLoaderTester {
  private ListingList listinglist = ListingList.getInstance();
  private ArrayList<Listing> listing = listinglist.getListing();
  /*
   * The setup() method adds 2 listings to the loader before each of the tests.
   */
  @BeforeEach
  public void setup() {
    listing.clear();
	listinglist.addListing("100 Apple Street", 2, 3, 600, "pool, pet friendly", 600, false, "12 months", true, 2, false, 1, Type.Apartment);
	listinglist.addListing("205 Brick Street", 2, 2.5, 800, "gym, pool, pet friendly", 1000, false, "12 months", true, 1, false, 2, Type.Duplex);
    ListingWriter.saveListing();
  }
  /*
   * The teardown() method clears the listing loader after each of the tests.
   */
  @AfterEach
  public void teardown() {
    listinglist.getInstance().getListing().clear();
    ListingWriter.saveListing();
  }
  /*
   * The listingArraySizeTest() method performs a test of loading 2 listings.
   */
  @Test
  void listingArraySizeTest() {
    listing = ListingLoader.loadListing();
    assertEquals(2, listing.size());
  }
  /*
   * The zeroSizeTest() method performs a test of an zero size listing list.
   */
  @Test
  void zeroSizeTest() {
    listing.clear();
    ListingWriter.saveListing();
    assertEquals(0, listing.size());
  }

  /*
   * The getAddressTest() method performs a test to display the address of the listing.
   */
  @Test
  void getAddressTest() {
    listing = ListingLoader.loadListing();
    assertEquals("205 Brick Street", listing.get(1).getAddress());
  }
  
}