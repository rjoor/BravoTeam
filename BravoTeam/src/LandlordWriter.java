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
		LandlordList landlord = LandlordList.getInstance();
		ArrayList<Landlord> landlords = landlord.getLandlord();
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
	
	public static JSONObject getLandlordJSON(Landlord landlord) {
		JSONObject userDetails = new JSONObject();
		//userDetails.put(ID, landlord.getID());
		userDetails.put(FIRST_NAME, landlord.getFirstName());
		userDetails.put(LAST_NAME , landlord.getLastName());
		userDetails.put(IS_GUEST, landlord.getIsGuest());
		userDetails.put(PROPERTIES_MANAGED, landlord.getPropertiesManaged());
		
		return userDetails;
	}
	

}
