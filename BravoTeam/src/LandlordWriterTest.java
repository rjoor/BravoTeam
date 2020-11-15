import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class LandlordWriterTest {
  private static LandlordList landlordlist = LandlordList.getInstance();
  private ArrayList<Landlord> landlords = landlordlist.getLandlord();
  
  @BeforeEach
  public void setup() {
    landlordlist.getInstance().getLandlord().clear();
  }
  
  @AfterEach
  public void teardown() {
    landlordlist.getInstance().getLandlord().clear();
  }
  
  @Test
  void testWritingZeroLandlords() {
    landlords = LandlordLoader.loadLandlord();
    assertEquals(0, landlords.size());
  }
  
  @Test
  void testWritingOneLandlord() {
    landlords.add(new Landlord(0, "Bob", "Ross", false, null));
    LandlordWriter.saveLandlord();
    assertEquals("Bob", LandlordLoader.loadLandlord().get(1).getFirstName());
  }
  
  @Test
  void testWritingThreeLandlords() {
    landlords.add(new Landlord(1, "Bob", "Ross", false, null));
    landlords.add(new Landlord(2, "Brad", "Pitt", false, null));
    landlords.add(new Landlord(3, "Derek", "Jeter", false, null));
    LandlordWriter.saveLandlord();
    assertEquals(3, LandlordLoader.loadLandlord().get(1).getID());
  }
  
  @Test
  void testWritingEmptyLandlord() {
    landlords.add(new Landlord(0, "", "", false, null));
    assertEquals("", LandlordLoader.loadLandlord().get(1).getFirstName());
  }  
}
