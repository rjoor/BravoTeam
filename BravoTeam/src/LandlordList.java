import java.util.ArrayList;

public class LandlordList {
  private static LandlordList landlordlist;
  ArrayList<Landlord> landlords = new ArrayList<Landlord>();
  

  private LandlordList() {}
	  
  public static LandlordList getInstance() {
	  if (landlordlist == null)
	    landlordlist = new LandlordList();
	  return landlordlist;
  }
	  
  public ArrayList<Landlord> getLandlord() {
    return landlords;
  }
  
  public void addLandlord(int id, String firstName, String lastName, boolean isGuest, int rating, ArrayList<Listing> propertiesManaged) {
	  landlords.add(new Landlord(id, firstName, lastName, isGuest, rating, propertiesManaged));
	  LandlordWriter.saveLandlord();
  }
}
