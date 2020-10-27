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
		listingDetails.put(Address, listing.getAddress());	
		listingDetails.put(NumBeds, listing.getNumBeds());	
		listingDetails.put(SquareFootage, listing.getSquareFootage());	
		listingDetails.put(Amenities, listing.getAmenities());	
		listingDetails.put(RentCost, listing.getID());	
		listingDetails.put(UtilitiesIncluded, listing.getUtilitiesIncluded());	
		listingDetails.put(LeaseDuration, listing.getLeaseDuration());	
		listingDetails.put(CanSublet, listing.getCanSublet());	
		listingDetails.put(DistanceFromCampus, listing.getDistanceFromCampus());	
		listingDetails.put(IsHandicapAccessible, listing.getIsHandicapAccessible());	
		listingDetails.put(Type, listing.getType());	
		
		return listingDetails;
	}
}
