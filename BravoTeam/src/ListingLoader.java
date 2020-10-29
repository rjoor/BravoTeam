/**
 * 
 * @author ridgetj	Bravo Team 10/25/20
 *
 */
import java.io.FileReader;
import java.util.ArrayList;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class ListingLoader extends ListingConstants {
	public static ArrayList<Listing> loadListing() {
		ArrayList<Listing> listings = new ArrayList<Listing>();
		
		try {
			FileReader reader = new FileReader(LISTING);
			JSONParser parser = new JSONParser();
			JSONArray landlordJSON = (JSONArray) new JSONParser().parse(reader);
			
			for(int i - 0; i < listingJSON.size(); i++)
			{
				JSONObject listingJSON = (JSONObject)listingJSON.get(i);
				int id = (int)listingJSON.get(ID);
				String address = (String)listingJSON.get(ADDRESS);
				int numBeds = (int)listingJSON.get(NUM_BEDS);
				int squareFootage = (int)listingJSON.get(SQUARE_FOOTAGE);
				String amenities = (String)listingJSON.get(AMENITIES);
				int rentCost = (int)listingJSON.get(RENT_COST);
				String utilitiesIncluded =  (String)listingJSON.get(UTILITIES_INCLUDED);
				String leaseDuration = (String)listingJSON.get(LEASE_DURATION);
				boolean isCanSublet = (boolean)listingJSON.get(CAN_SUBLET);
				int distanceFromCampus = (int)listingJSON.get(DISTANCE_FROM_CAMPUS);
				boolean isHandicapAccessible = (boolean)listingJSON.get(IS_HANDICAP_ACCESSIBLE);
				String type = (String)listingJSON.get(TYPE);
				
				listings.add(new Listing(id, address, numBeds, squareFootage, amenities, rentCost, utilitiesIncluded, leaseDuration, isCanSublet, distanceFromCampus, isHandicapAccessible, type));
			}
			
			return listings;
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
		return null;
		
		
	}
}
