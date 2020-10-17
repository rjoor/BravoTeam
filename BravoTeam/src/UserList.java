import java.util.ArrayList;
/**
 * UserList utilizes the singleton design pattern to track and keep 
 * references to users in the Bravo System. Creates an instance
 * of an arraylist and has methods to access content.
 * 
 * @author Vince Kolb-Lugo
 * Bravo Team
 * 2020-10-17
 *
 */
public class UserList {
	private static UserList userList;
	ArrayList<User> users = new ArrayList<User>();
	
	private UserList() {}
	
	/**
	 * getInstance creates the instance of the userlist of Users
	 * @return userList an arrayList of type User
	 */
	public static UserList getInstance() {
		if(userList == null) userList = new UserList();
		return userList;
	}
	
	/**
	 * getUser returns a user if it is in the arraylist
	 * @param userName a string of the user to search in the list
	 * @return User a class of the user
	 */
	public User getUser(String userName) {
		//TODO write logic
		return null;
	}

}
