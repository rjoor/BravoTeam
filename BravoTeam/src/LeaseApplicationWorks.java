import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
/**
 * 
 * @author Vince Kolb-Lugo
 * Bravo Team
 * 2020-10-31
 *
 */
public class LeaseApplicationWorks {
	
	Student leasee;
	Landlord leaser;
	Listing residence;
	String leaseAgreement = "";
	SimpleDateFormat today = new SimpleDateFormat();
	SimpleDateFormat start = new SimpleDateFormat();
	SimpleDateFormat end = new SimpleDateFormat();
	
	public void generateLease(Student leasee, Landlord leaser, Listing residence) {
		try
		{
			Scanner fileScanner = new Scanner(new File("C:\\Users\\José\\Desktop\\USC\\Software Engineering\\BravoLocal\\src\\LeaseTemplate.txt"));
			while(fileScanner.hasNextLine())
			{//Reads in a line from text file, splits it into array of strings, 
				//then parse each word replacing target values. 
				String line = fileScanner.nextLine();
				String[] words = line.split("\\s");
				for(int i = 0; i < words.length; i++) 
				{
					if(words[i].equalsIgnoreCase("<DATE>")) {
						words[i] = today.toString();
						leaseAgreement = leaseAgreement.concat(words[i]);
					} else if(words[i].equalsIgnoreCase("<LANDLOARD>")) {
						words[i] = leaser.getFirstName() + " " + leaser.getLastName();
						leaseAgreement = leaseAgreement.concat(words[i]) + " ";
					} else if(words[i].equalsIgnoreCase("<NUM_BED>")) {
						words[i] = (Integer.toString(residence.getNumBeds()));
						leaseAgreement = leaseAgreement.concat(words[i]) + " ";
					} else if(words[i].equalsIgnoreCase("<NUM_BATH>")) {
						words[i] = (Double.toString(residence.getNumBaths()));
						leaseAgreement = leaseAgreement.concat(words[i]) + " ";
					} else if(words[i].equalsIgnoreCase("<PROPERTY_ADDRESS>")) {
						words[i] = residence.getAddress();
						leaseAgreement = leaseAgreement.concat(words[i]) + " ";
					} else if(words[i].equalsIgnoreCase("<ZIP>.")) {
						words[i] = residence.getZip() + ".";
						leaseAgreement = leaseAgreement.concat(words[i]) + " ";
					} else if(words[i].equalsIgnoreCase("<START DATE>")) {
						words[i] = start.format("2020-08-01");
						leaseAgreement = leaseAgreement.concat(words[i]) + " ";
					} else if(words[i].equalsIgnoreCase("<END DATE>")) {
						words[i] = "2020-07-01";
						leaseAgreement = leaseAgreement.concat(words[i]) + " ";
					} else if(words[i].equalsIgnoreCase("<RENT>")) {
						words[i] = (Integer.toString(residence.getRentCost()));
						leaseAgreement = leaseAgreement.concat(words[i]) + " ";
					} else if(words[i].equalsIgnoreCase("to:<PAYMENT ADDRESS>")) {
						words[i] = residence.getAddress();
						leaseAgreement = leaseAgreement.concat(words[i]) + " ";
					} else if (words[i].equalsIgnoreCase("<DAMAGE COST>")) {
						words[i] = (Integer.toString(residence.getRentCost() * 2));
						leaseAgreement = leaseAgreement.concat(words[i]) + " ";
					} else 
						leaseAgreement = leaseAgreement.concat(words[i]);
				}
				leaseAgreement = leaseAgreement.concat("\n");
			}
			System.out.println(leaseAgreement);
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
/*
	public static void main(String[] args) {
		Student student = new Student(1, "Steve", "Jobs", false, 2, null, null, true);
		Landlord landloard = new Landlord(2, "Dan", "The Man", false, 2, null);
		Listing listing = new Listing("100 Here St", 3, 3, 3, null, 666, true, "13 months", false, 1, true, 1, Type.Apartment);
		String leaseText ="";
		
		generateLease(student, landloard, listing);

	}
*/
}
