import java.util.ArrayList;

/**
 * ListingList class keeps track of and retrieves listings in the Bravo System by utilizing the
 * Singleton Design Pattern. Contains an instance of an arrayList of Listings and a public static
 * getInstance method which calls the arrayList.
 * 
 * @author Vince Kolb-Lugo Bravo Team 2020-10-17
 *
 */
public class ListingList {
  private static ListingList listingList = null;
  ArrayList<Listing> listings = new ArrayList<Listing>();
  //TODO write getters and setters
  //TODO unique identifier class in java. look at and learn

  private ListingList() {
  }

  /**
   * getInstance creates the single instance of the arrayList of listings in the Bravo System.
   * 
   * @return listingList an arrayList of type Listing
   */
  public static ListingList getInstance() {
    if (listingList == null)
      listingList = new ListingList();
    return listingList;
  }

  /**
   * getListing searches the arrayList for the listing that matches the address passed as the
   * argument.
   * 
   * @param address a string representation of the listing's address
   * @return Listing a class of the type Listing
   */
  public ArrayList<Listing> getListing() {
    return listings;
  }
  
   public void addListing(String address, Long numBeds, Long numBaths, Long squareFootage,
      ArrayList<String> amenities, Long rentCost, boolean utilitiesIncluded, String leaseDuration,
      boolean canSublet, Long distanceFromCampus, boolean isHandicapAccessible, Long id, Type type) {
      listings.add(new Listing(address, numBeds, numBaths, squareFootage,
        amenities, rentCost, utilitiesIncluded, leaseDuration, canSublet, distanceFromCampus, isHandicapAccessible));

      ListingWriter.saveListing();
  } 
}
