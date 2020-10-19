/**
 * 
 * @author hkumte Bravo Team 10/17/20
 */
import java.util.ArrayList;

public class Landlord extends User {
  private ArrayList<Listing> propertiesManaged;

  public Landlord(String firstName, String lastName, boolean isGuest, int rating,
      ArrayList<Listing> propertiesManaged) {
    super(firstName, lastName, isGuest, rating);
    this.propertiesManaged = propertiesManaged;
  }

  /**
   * Adds a listing to the array list by the landlord
   * 
   * @param listing is the listing that is going to be added
   */
  public void addListing(Listing listing) {
    propertiesManaged.add(listing);
  }

  /**
   * Removes a listing while given the index of the listing in the array list
   * 
   * @param index
   */
  public void removeListing(int index) {
    propertiesManaged.remove(index);
  }

  /**
   * Edits a listing in the array list
   * 
   * @param listing the information that is going to be added to the listing
   * @param index is the position of the listing in the array list
   */
  public void editListing(Listing listing, int index) {
    propertiesManaged.set(index, listing);
  }



}
