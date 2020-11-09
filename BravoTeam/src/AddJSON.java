
public class AddJSON {
	public void addListingsJSON() {
		ListingList listings = ListingList.getInstance();
		listings.addListing("100 Apple Street", 2, 3, 600, "pool, pet friendly", 600, false, "12 months", true, 2, false, 1, Type.Apartment);
		listings.addListing("205 Brick Street", 2, 2.5, 800, "gym, pool, pet friendly", 1000, false, "12 months", true, 1, false, 2, Type.Duplex);
		listings.addListing("20 Walk2Campus Ave", 1, 1, 700, "gym, free wifi, pet friendly, washer and dryer", 650, false, "12 months", true, 2, false, 3, Type.Apartment);
		listings.addListing("5 Apple Street", 3, 3, 1200, "free wifi", 800, false, "12 months", true, 2, false, 4, Type.Apartment);
		listings.addListing("103 Marion Street", 2, 2, 650, "free wifi, furnished, pool, gym, movie theater", 700, false, "12 months", true, 3, false, 5, Type.House);
		listings.addListing("25 South Lane", 2, 1, 500, "pool", 500, false, "12 months", true, 1, false, 6, Type.Apartment);
		listings.addListing("100 North Street", 4, 4, 700, "washer and dryer, fridge", 500, false, "12 months", true, 2, false, 7, Type.Apartment);
		listings.addListing("5 LiveSC", 1, 1, 800, "gym, pool, free wifi, furnished, pet friendly", 800, false, "12 months", true, 2, false, 8, Type.Apartment);
		listings.addListing("5 LiveSC", 2, 1, 700, "gym, pool, free wifi, furnished, pet friendly", 700, false, "12 months", true, 2, false, 9, Type.Apartment);
		listings.addListing("5 LiveSC", 2, 2, 650, "gym, pool, free wifi, furnished, pet friendly", 600, false, "12 months", true, 2, false, 10, Type.Apartment);
	}
}
