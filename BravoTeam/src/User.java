
public class User {
	protected int id;
  protected String firstName, lastName;
  protected boolean isGuest;
  protected int rating;

  public User(int id, String firstName, String lastName, boolean isGuest) {
	  this.id = id;
    this.firstName = firstName;
    this.lastName = lastName;
    this.isGuest = true;
  }

  /*********************************************************************
   * General methods
   */
  
  /**
   * getId returns User's id, which corresponds to its index in an array list
   * 
   * @return the integer value of the id
   */
  public int getId() {
	  return id;
  }
  
  /**
   * setId takes in a id parameter and sets it as the value
   * 
   * @param id and integer value corresponding to a place in a list
   */
  public void setId(int id) {
	  this.id = id;
  }

  /**
   * getFirstName returns a string representation of the user's first name
   * 
   * @return firstName a string of the first name
   */
  public String getFirstName() {
    return firstName;
  }

  /**
   * setFirstName takes an input and sets it to the user's first name
   * 
   * @param firstName a string value of a user's first name
   */
  public void setFirstName(String firtName) {
    this.firstName = firtName;
  }

  /**
   * getLastName returns a string of the user's last name
   * 
   * @return lastName a string of the user's last name
   */
  public String getLastName() {
    return lastName;
  }

  /**
   * setLastName takes in a string and sets the value to the user's last name
   * 
   * @param lastName a string of the user's last name
   */
  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  /**
   * isGuest returns true or false, signifying if a user is a guest or not
   * 
   * @return isGuest a boolean value
   */
  public boolean isGuest() {
    return isGuest;
  }

  /**
   * setIsGuest sets value to true by default for a user
   * 
   * @param isGuest a boolean value automatically set to true
   */
  public void setGuest(boolean isGuest) {
    this.isGuest = isGuest;
  }

  /**
   * getRating returns a user's rating
   * 
   * @return rating an integer value
   */
  public int getRating() {
    return rating;
  }

  /**
   * setRating takes in an integer value to set it as the user's rating
   * 
   * @param rating an integer value representing a user's rating
   */
  public void setRating(int rating) {
    this.rating = rating;
  }
  
  public boolean getIsGuest() {
    return isGuest;
  }
  
  /**
   * Prints data for the tester
   */
  public String printData() {
	  String ret = "firstName: " + firstName + ", lastName: " + lastName + ", isGuest: " + isGuest + ", rating: " + rating;
	  return ret;
  }
}