import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
/*
 * Bravo Team 11-15-20
 * The ListingListTest performs tests on the ListingList class.
 */
public class ListingListTest {
  private static ListingList listinglist = ListingList.getInstance();
  ListingList listings = ListingList.getInstance();
  /*
   * The setup() method clears the ListingList before each test.
   */
  @BeforeEach
  public void setup() {
    listinglist.getInstance().getListing().clear();
  }
  /*
   * The teardown() method clears the ListingList after each test.
   */
  @AfterEach
  public void teardown() {
    listinglist.getInstance().getListing().clear();
  }
  /*
   * The testAddingUser() method runs a test by adding a listing from a User.
   */
  @Test
  public void testAddingUser() {
	listings.addListing("103 Marion Street", 2, 2, 650, "free wifi, furnished, pool, gym, movie theater", 700, false, "12 months", true, 3, false, 5, Type.House);
    assertEquals(1, listinglist.getListing().size());
  }
}