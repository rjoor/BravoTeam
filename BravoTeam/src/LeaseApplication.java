
import java.util.Scanner;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
/**
 * LeaseApplication class creates a simple lease application between a student and a landlord. Also
 * sends the completed application to the landlord.
 * 
 * @author Vince Kolb-Lugo Bravo Team 2020-10-18
 *
 */
public class LeaseApplication extends LeaseConstants {
	//TODO change variable types for instances to match the types in the user classes
	private static Scanner input = new Scanner(System.in);
	public String lease ="";
	public Landlord landlord;
	public Listing listing;
	private String date, landlord_name, num_bed, num_bath, address, zip, start_date, end_date, rent, payment_address, damage_cost;
	private ArrayList<String> tenants = new ArrayList<String>();
	
	
	/**
	 * getInfo method grabs information from the user and listing classes to populate
	 * the fields of the lease agreement. 
	 */
	public void getInfo() {
		date = this.date;
		landlord_name = this.landlord.getFirstName();
		tenants = this.tenants;
		num_bed = Integer.toString(listing.getNumBeds());
		num_bath = Double.toString(listing.getNumBaths());
		address = listing.getAddress();
	}
	
	/**
	 * makeTemplate method reads in the LeaseTemplate text file and returns
	 * @param fileName
	 */
	public String makeTemplate(String fileName) {
		try
		{
			File file = new File(fileName);
			Scanner scannerObject = new Scanner(file);
			
			while(scannerObject.hasNextLine()) {
				lease += scannerObject.nextLine();
			}
			scannerObject.close();
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		return lease;
	}
	
	public void parseTemplate(String lease) {
		//TODO read the lease string, parse it for the constants, and 
		//replace values with user and listing types
	}

	
	
	
	
	
	
	
	
	
	

	
  //private User leasee;
  //private Listing residence;

  /**
   * generateApp method passes a user, landlord, and address as parameters and generates a simple
   * lease application.
   * 
   * @param leasee a User of type student
   * @param leaser a User of type landlord
   * @param residence a Listing of type listing
   */
  //public void generateApp(User leasee, User leaser, Listing residence) {
    // TODO set values here
  //}

  /**
   * sendApp method sends the completed application to a landlord's email address
   * 
   * @param email a String of the landlord's email address
   */
  //public void sendApp(String email) {
    // TODO write the logic here
  //}
  
}
