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
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class LandlordLoader extends LandlordConstants {
  
    public static void main(String[] args) {
      ArrayList<Landlord> landlords = loadLandlord();
      for(Landlord l : landlords) {
        System.out.println(l.firstName);
      }
    }
  
	public static ArrayList<Landlord> loadLandlord() {
		ArrayList<Landlord> landlords = new ArrayList<Landlord>();
		
		try {
			FileReader reader = new FileReader(LANDLORD_FILE_NAME);
			JSONParser parser = new JSONParser();
			JSONArray landlordJSON = (JSONArray) new JSONParser().parse(reader);
			
			for(int i = 0; i < landlordJSON.size(); i++)
			{
				JSONObject userJSON = (JSONObject)landlordJSON.get(i);
				//int id = (int)userJSON.get(ID);
				String firstName = (String)userJSON.get(FIRST_NAME);
				String lastName = (String)userJSON.get(LAST_NAME);
				boolean isGuest = (boolean)userJSON.get(IS_GUEST);
				ArrayList<Listing> propertiesManaged = (ArrayList<Listing>)userJSON.get(PROPERTIES_MANAGED);
				
				landlords.add(new Landlord(firstName, lastName, isGuest, propertiesManaged));
			}
			
			System.out.println("x");
			return landlords;
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
		return null;
	}

}
