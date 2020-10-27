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
    /*for(Landlord landlord : landlordlist) {
      if((landlord.getFirstName() + " " + landlord.getLastName()).equals(landlordName)) {
        return landlord;
       }
     }
    ArrayList<Listing> dummyObject = new ArrayList<Listing>();
    Landlord nullLandlord = new Landlord("NULL", "NULL", false, -1, dummyObject);
    return nullLandlord;
    */
   }
}
