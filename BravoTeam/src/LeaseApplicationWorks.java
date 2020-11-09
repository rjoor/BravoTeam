import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
/**
 * LeaseApplicationWorks class has instances of a student, landlord, and listing, and 
 * uses their attributes to fill out a lease application. A template application is
 * read into the class and a complete application is displayed to the console. 
 * 
 * @author Vince Kolb-Lugo
 * Bravo Team
 * 2020-10-31
 * 
 */
public class LeaseApplicationWorks {
	
	User leasee;
	User leaser;
	Listing residence;
	String leaseAgreement = "";
	SimpleDateFormat today = new SimpleDateFormat();
	
	/**
	 * generateLease method takes in a student, landloard, and listing, and uses their
	 * attributes to complete the lease agreement.
	 * 
	 * @param leasee a student who wants to rent a listings
	 * @param leaser a landlord who manages the listing
	 * @param residence a listing of type Listing
	 */
	public void generateLease(User leasee, User leaser, Listing residence) {
		try
		{
			//argument references document on local machine. needs to be replaced or edited
			Scanner fileScanner = new Scanner(new File("src/LeaseTemplate.txt"));
			while(fileScanner.hasNextLine())
			{//Reads in a line from text file, splits it into array of strings, 
				//then parse each word replacing target values. 
				String line = fileScanner.nextLine();
				String[] words = line.split("\\s");
				for(int i = 0; i < words.length; i++) 
				{
					if(words[i].equalsIgnoreCase("<DATE>")) {
						words[i] = today.toString();
						leaseAgreement += words[i] + " ";
					} else if(words[i].equalsIgnoreCase("<LANDLOARD>")) {
						words[i] = leaser.getFirstName() + " " + leaser.getLastName();
						leaseAgreement += words[i] + " ";
					}else if(words[i].equalsIgnoreCase("<TENANT(s)>")) {
						words[i] = leasee.getFirstName() + " " + leasee.getLastName();
						leaseAgreement += words[i] + " ";
					}
					else if(words[i].equalsIgnoreCase("<NUM_BED>")) {
						words[i] = (Long.toString(residence.getNumBeds()));
						leaseAgreement += words[i] + " ";
					} else if(words[i].equalsIgnoreCase("<NUM_BATH>")) {
						words[i] = (Double.toString(residence.getNumBaths()));
						leaseAgreement += words[i] + " ";
					} else if(words[i].equalsIgnoreCase("<PROPERTY_ADDRESS>")) {
						words[i] = residence.getAddress();
						leaseAgreement += words[i] + " ";
					} else if(words[i].equalsIgnoreCase("<ZIP>.")) {
						words[i] = "29201.";
						leaseAgreement += words[i] + " ";
					} else if(words[i].equalsIgnoreCase("<START_DATE>")) {
						words[i] = "2020-08-01";
						leaseAgreement += words[i] + " ";
					} else if(words[i].equalsIgnoreCase("<END_DATE>")) {
						words[i] = "2020-07-01";
						leaseAgreement += words[i] + " ";
					} else if(words[i].equalsIgnoreCase("<RENT>")) {
						words[i] = (Long.toString(residence.getRentCost()));
						leaseAgreement += words[i] + " ";
					} else if(words[i].equalsIgnoreCase("<PAYMENT ADDRESS>")) {
						words[i] = residence.getAddress();
						leaseAgreement += words[i] + " ";
					}
					else if (words[i].equalsIgnoreCase("<DAMAGE_COST>")) {
						words[i] = (Long.toString(residence.getRentCost()));
						leaseAgreement += words[i] + " ";
					} else if(words[i].equalsIgnoreCase("<TENANT")) {
						words[i] = leasee.getFirstName() + " " + leasee.getLastName();
						leaseAgreement += words[i] + " ";
					} else if(words[i].equalsIgnoreCase("1>")) {
						words[i] = " ";
						leaseAgreement += words[i] + " ";
					} else if(words[i].equalsIgnoreCase("(TENANT")) {
						words[i] = leasee.getFirstName() + " " + leasee.getLastName();
						leaseAgreement += words[i] + " ";
					} else if(words[i].equalsIgnoreCase("<TENANTS(s)>.")) {
						words[i] = leasee.getFirstName() + " " + leasee.getLastName();
						leaseAgreement += words[i] + " ";
					}
					else 
						leaseAgreement += words[i] + " ";
				}
				leaseAgreement += "\n";
			}
			fileScanner.close();
			//Test if lease application scanned and fields replace
			System.out.println(leaseAgreement);
			
			//write a completed lease application to a text file and save it in local directory
			//needs to be edited
			FileWriter writer = new FileWriter("src/LeaseCompleted.txt");
			writer.write(leaseAgreement);
			writer.close();
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	public String toString(String ret) {
		return ret;
	}
	
	/*public void run() {
		User student = new Student(1, "Steve", "Jobs", false, "0584", null, true);
		//Landlord landloard = new Landlord(2, "Dan", "The Man", false, 2, null);
		User landlord = new Landlord(2, "George", "Castanza", false, null);
		Listing listing = new Listing("100 Here St", 3, 3, 3, null, 666, true, "13 months", false, 1, true, 1, Type.Apartment);
		String leaseText ="";
		generateLease(student, landlord, listing);
	}
	
//Used for testing purposes
	public static void main(String[] args) {
		User student = new Student(1, "Steve", "Jobs", false, "0584", null, true);
		//Landlord landloard = new Landlord(2, "Dan", "The Man", false, 2, null);
		User landlord = new Landlord(2, "George", "Castanza", false, null);
		Listing listing = new Listing("100 Here St", 3, 3, 3, null, 666, true, "13 months", false, 1, true, 1, Type.Apartment);
		String leaseText ="";
		

		LeaseApplicationWorks tester = new LeaseApplicationWorks();
		tester.run();
	}*/

}