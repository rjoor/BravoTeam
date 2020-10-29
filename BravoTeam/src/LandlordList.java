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
}
