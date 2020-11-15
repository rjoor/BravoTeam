import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class LandlordListLoaderTest {
  private LandlordList landlordlist = LandlordList.getInstance();
  private ArrayList<Landlord> landlord = landlordlist.getLandlord();
  
  @BeforeEach
  public void setup() {
    landlord.clear();
    landlordlist.addLandlord(1, "John", "Johnson", false, 5, null);
    landlordlist.addLandlord(2, "Jane", "Jackson", false, 4, null);
    LandlordWriter.saveLandlord();
  }
  
  @AfterEach
  public void teardown() {
    landlordlist.getInstance().getLandlord().clear();
    LandlordWriter.saveLandlord();
  }
  
  @Test
  void landlordArraySizeTest() {
    landlord = LandlordLoader.loadLandlord();
    assertEquals(2, landlord.size());
  }
  
  @Test
  void zeroSizeTest() {
    landlord.clear();
    LandlordWriter.saveLandlord();
    assertEquals(0, landlord.size());
  }
  
  @Test
  void getLastNameTest() {
    landlord = LandlordLoader.loadLandlord();
    assertEquals("Jackson", landlord.get(1).getLastName());
  }
  
}
