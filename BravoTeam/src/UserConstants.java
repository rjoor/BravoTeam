/**
 * UserConstants super class contains all the constants for both Student and 
 * Landlord user types. 
 * 
 * @author Vince Kolb-Lugo
 * Bravo Team
 * 2020-10-25
 *
 */
public abstract class UserConstants {
	protected static final String ID = "id";
	protected static final String USER_FILE_NAME = "src/users.json";
	protected static final String USERs = "users";
	protected static final String FIRST_NAME = "firstName";
	protected static final String LAST_NAME = "lastName";
	protected static final String IS_GUEST = "isGuest";
	protected static final String STUDENT_ID = "studentid";
	//Favorites list for student types
	protected static final String FAVORITE_LISTINGS = "favoritesListings";
	//For landlord types
	protected static final String PROPERTIES_MANAGED = "propertiesManaged";
	protected static final String IS_USC_STUDENT = "isUSCStudent";
	protected static final String RATING = "rating";
}
