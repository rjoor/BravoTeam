/**
 * ListingTester creates an instance of the various types of listings specified 
 * by the enum Type.
 * 
 * Having launch issues on Vince Machine
 * 
 * @author Vince Kolb-Lugo
 * Bravo Team
 * 2020-10-20
 *
 */
public class ListingTester {

	public static void main(String[] args) {
		Listing house = new Listing("100 Spruce", 4, 2, 1200, null, 1300, false, "12 months", true, 1, false, 0, Type.House);
		Listing apartment = new Listing("200 Maple", 2, 1, 900, null, 1000, false, "12 months", true, 1, false, 1, Type.Apartment);
		Listing townhouse = new Listing("300 Oak", 3, 2, 950, null, 950, false, "12 months", false, 0, true, 2, Type.Townhouse);
		Listing duplex = new Listing("400 Apple", 2, 1, 600, null, 800, false, "whatever", true, 3, false, 3, Type.Duplex);
		
		//TODO add amenities to each instance. 
		
		System.out.println("House: ");
		System.out.println(house.printData());
		System.out.println("Apartment: ");
		System.out.println(apartment.printData());
		System.out.println("Townhouse: ");
		System.out.println(townhouse.printData());
		System.out.println("Duplex: ");
		System.out.println(duplex.printData());

	}

}
