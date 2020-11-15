import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ListingListLoaderTester {
  private ListingList listinglist = ListingList.getInstance();
  private ArrayList<Listing> listing = listinglist.getListing();
  
  @BeforeEach
  public void setup() {
    listing.clear();
	listinglist.addListing("100 Apple Street", 2, 3, 600, "pool, pet friendly", 600, false, "12 months", true, 2, false, 1, Type.Apartment);
	listinglist.addListing("205 Brick Street", 2, 2.5, 800, "gym, pool, pet friendly", 1000, false, "12 months", true, 1, false, 2, Type.Duplex);
    ListingWriter.saveListing();
  }
  
  @AfterEach
  public void teardown() {
    listinglist.getInstance().getListing().clear();
    ListingWriter.saveListing();
  }
  
  @Test
  void listingArraySizeTest() {
    listing = ListingLoader.loadListing();
    assertEquals(2, listing.size());
  }
  
  @Test
  void zeroSizeTest() {
    listing.clear();
    ListingWriter.saveListing();
    assertEquals(0, listing.size());
  }

  
  @Test
  void getAddressTest() {
    listing = ListingLoader.loadListing();
    assertEquals("205 Brick Street", listing.get(1).getAddress());
  }
  
}