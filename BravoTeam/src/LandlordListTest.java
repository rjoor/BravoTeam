import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class LandlordListTest {
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
  void testAddingUser() {
    landlords.add(new Landlord(0, "Bob", "Ross", false, null));
    assertEquals(1, landlordlist.getLandlord().size());
  }
}
