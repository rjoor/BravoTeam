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

		public static void saveListing() {
			ListingList listing = ListingList.getInstance();
			ArrayList<Listing> listings = listing.getListing();
			JSONArray jsonListings = new JSONArray();
		
		for (int i = 0; i < listings.size(); i++) {
			jsonListings.add(getListingJSON(listings.get(i)));
		}
		
		 try (FileWriter file = new FileWriter(LISTING_FILE_NAME)) {
			 file.write(jsonListings.toJSONString());
			 file.flush();
		 }
		 
		 catch (IOException e) {
			 e.printStackTrace();
		 }
		 
		}

public static JSONObject getListingJSON(Listing listing) {
		JSONObject listingDetails = new JSONObject();
		listingDetails.put(ID, listing.getID());	
		listingDetails.put(ADDRESS, listing.getAddress());	
		listingDetails.put(NUM_BEDS, listing.getNumBeds());	
		listingDetails.put(NUM_BATHS, listing.getNumBaths());
		listingDetails.put(SQUARE_FOOTAGE, listing.getSquareFootage());	
		listingDetails.put(AMENITIES, listing.getAmenities());	
		listingDetails.put(RENT_COST, listing.getRentCost());	
		listingDetails.put(UTILITIES_INCLUDED, listing.isUtilitiesIncluded());	
		listingDetails.put(LEASE_DURATION, listing.getLeaseDuration());	
		listingDetails.put(CAN_SUBLET, listing.isCanSublet());	
		listingDetails.put(DISTANCE_FROM_CAMPUS, listing.getDistanceFromCampus());	
		listingDetails.put(IS_HANDICAP_ACCESSIBLE, listing.getIsHandicapAccessible());	
		//listingDetails.put(TYPE, listing.getType());	
		
		return listingDetails;
	}
}
