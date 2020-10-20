
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

  public Student(String firstName, String lastName, boolean isGuest, int rating, String studentid,
      ArrayList<Listing> favoritesListings, boolean isUSCStudent) {
    super(firstName, lastName, isGuest, rating);
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
}
