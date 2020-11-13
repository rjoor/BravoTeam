
import java.util.ArrayList;

/**
 * Contains all pertinent instance variables and methods pertaining to a student's information and
 * their site privileges.
 * 
 * @author Ross Jaeger
 *
 */
public class Student extends User {
  private String studentid;
  private ArrayList<Listing> favoritesListings;
  private boolean isUSCStudent;

  public Student(int id, String firstName, String lastName, boolean isGuest, String studentid,
      ArrayList<Listing> favoritesListings, boolean isUSCStudent) {
    super(id, firstName, lastName, isGuest);
    this.studentid = studentid;
    this.favoritesListings = favoritesListings;
    this.isUSCStudent = isUSCStudent;
  }

  public boolean verifyID(String studentid) {
    // TODO add logic
    return true;
  }

  public Listing addFavorite(Listing favorite) {
    favoritesListings.add(favorite);
    return favorite;
  }

  public void editFavoriteRating(Listing favorite) {

  }

  public boolean getIsUSCStudent(boolean isUSCStudent) {
    if (isUSCStudent) {
      return true;
    } else {
      return false;
    }
  }
  
  public String getFavorites() {
	  String favs = "";
	  for(Listing listing : this.favoritesListings) {
		  favs += listing.toString();
	  }
	  return favs;
  }
}