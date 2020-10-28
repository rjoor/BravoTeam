/**
 * 
 * @author ridgetj Bravo Team 10/25/20
 *
 */
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class ListingWriter extends ListingConstants {
	//TODO
	
public static JSONObject getListingJSON(Listing listing) {
		JSONObject listingDetails = new JSONObject();
		listingDetails.put(ID, listing.getID());	
		listingDetails.put(ADDRESS, listing.getAddress());	
		listingDetails.put(NUM_BEDS, listing.getNumBeds());	
		listingDetails.put(SQUARE_FOOTAGE, listing.getSquareFootage());	
		listingDetails.put(AMENITIES, listing.getAmenities());	
		listingDetails.put(RENT_COST, listing.getRentCost());	
		listingDetails.put(UTILITIES_INCLUDED, listing.isUtilitiesIncluded());	
		listingDetails.put(LEASE_DURATION, listing.getLeaseDuration());	
		listingDetails.put(CAN_SUBLET, listing.isCanSublet());	
		listingDetails.put(DISTANCE_FROM_CAMPUS, listing.getDistanceFromCampus());	
		listingDetails.put(IS_HANDICAP_ACCESSIBLE, listing.getIsHandicapAccessible());	
		listingDetails.put(TYPE, listing.getType());	
		
		return listingDetails;
	}
}
