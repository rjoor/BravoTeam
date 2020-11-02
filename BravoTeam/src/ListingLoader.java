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
			FileReader reader = new FileReader(LISTING_FILE_NAME);
			JSONParser parser = new JSONParser();
			JSONArray listingsJSON = (JSONArray) new JSONParser().parse(reader);
			
			for(int i = 0; i < listingsJSON.size(); i++)
			{
				JSONObject listingJSON = (JSONObject)listingsJSON.get(i);
				int id = (int)listingJSON.get(ID);
				String address = (String)listingJSON.get(ADDRESS);
				int numBeds = (int)listingJSON.get(NUM_BEDS);
				double numBaths = (double)listingJSON.get(NUM_BATHS);
				int squareFootage = (int)listingJSON.get(SQUARE_FOOTAGE);
				String amenities = (String)listingJSON.get(AMENITIES);
				int rentCost = (int)listingJSON.get(RENT_COST);
				boolean utilitiesIncluded =  (boolean)listingJSON.get(UTILITIES_INCLUDED);
				String leaseDuration = (String)listingJSON.get(LEASE_DURATION);
				boolean isCanSublet = (boolean)listingJSON.get(CAN_SUBLET);
				int distanceFromCampus = (int)listingJSON.get(DISTANCE_FROM_CAMPUS);
				boolean isHandicapAccessible = (boolean)listingJSON.get(IS_HANDICAP_ACCESSIBLE);
				Type type = (Type)listingJSON.get(TYPE);
				
				listings.add(new Listing(address, numBeds, numBaths, squareFootage, amenities, rentCost, utilitiesIncluded, leaseDuration, isCanSublet, distanceFromCampus, isHandicapAccessible, id, type));
			}
			
			return listings;
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
		return null;
		
		
	}
	
	
}