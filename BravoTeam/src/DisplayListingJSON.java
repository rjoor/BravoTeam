import java.util.ArrayList;

public class DisplayListingJSON {
	public void displayListings() {
		ListingList listings = ListingList.getInstance();
		ArrayList<Listing> lists = listings.getListing();
		for (Listing ll : lists) {
			System.out.println("\nName and Address: " +  ll.getAddress() +", ID: " + ll.getID() + ", Number of Beds: " + ll.getNumBeds() + ", Number of Baths: "+ ll.getNumBaths() + ", Monthly Cost: " + ll.getRentCost() +  ", Distance to campus to the closest mile: " + ll.distanceFromCampus + "\nAmenities: " +ll.getAmenities()  +"\n");
			System.out.println("------------------");
		}
	}
}
