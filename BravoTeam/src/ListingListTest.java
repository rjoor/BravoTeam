import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ListingListTest {
  private static ListingList listinglist = ListingList.getInstance();
  ListingList listings = ListingList.getInstance();
  
  @BeforeEach
  public void setup() {
    listinglist.getInstance().getListing().clear();
  }
  
  @AfterEach
  public void teardown() {
    listinglist.getInstance().getListing().clear();
  }
  
  @Test
  public void testAddingUser() {
	listings.addListing("103 Marion Street", 2, 2, 650, "free wifi, furnished, pool, gym, movie theater", 700, false, "12 months", true, 3, false, 5, Type.House);
    assertEquals(1, listinglist.getListing().size());
  }
}