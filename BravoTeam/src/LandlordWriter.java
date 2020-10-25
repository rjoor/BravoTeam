/**
 * Landlord JSON writer class for the JSON file
 * @author hkumte Bravo Team 10/25/20
 *
 */
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class LandlordWriter extends LandlordConstants {
	
	public static void saveLandlord() {
		UserList user = UserList.getInstance();
		ArrayList<User> landlords = user.getUser();
		JSONArray jsonLandlords = new JSONArray();
		
		for (int i = 0; i < landlords.size(); i++) {
			jsonLandlords.add(getLandlordJSON(landlords.get(i)));
		}
		
		try (FileWriter file = new FileWriter(LANDLORD_FILE_NAME)) {
			file.write(jsonLandlords.toJSONString());
			file.flush();
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static JSONObject getLandlordJSON(User user) {
		JSONObject userDetails = new JSONObject();
		userDetails.put(ID, user.getID());
		userDetails.put(FIRST_NAME, user.getFirtName());
		userDetails.put(LAST_NAME , user.getLastName());
		userDetails.put(IS_GUEST, user.getIsGuest());
		userDetails.put(RATING, user.getRating());
		userDetails.put(PROPERTIES_MANAGED, user.getPropertiesManaged());
		
		return userDetails;
	}
	

}
