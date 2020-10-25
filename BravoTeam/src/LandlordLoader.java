/**
 * Landlord Loader class for the Landlord JSON file
 * @author hkumte Bravo Team 10/25/20
 *
 */
import java.io.FileReader;
import java.util.ArrayList;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class LandlordLoader extends LandlordConstants {
	public static ArrayList<User> loadLandlord() {
		ArrayList<User> landlords = new ArrayList<User>();
		
		try {
			FileReader reader = new FileReader(LANDLORD_FILE_NAME);
			JSONParser parser = new JSONParser();
			JSONArray landlordJSON = (JSONArray) new JSONParser().parse(reader);
			
			for(int i = 0; i < landlordJSON.size(); i++)
			{
				JSONObject userJSON = (JSONObject)landlordJSON.get(i);
				String id = (String)userJSON.get(ID);
				String firstName = (String)userJSON.get(FIRST_NAME);
				String lastName = (String)userJSON.get(LAST_NAME);
				String isGuest = (String)userJSON.get(IS_GUEST);
				String rating = (String)userJSON.get(RATING);
				String propertiesManaged = (String)userJSON.get(PROPERTIES_MANAGED);
				
				landlords.add(new User(id, firstName, lastName, isGuest, rating, propertiesManaged));
			}
			
			return landlords;
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
		return null;
	}

}
