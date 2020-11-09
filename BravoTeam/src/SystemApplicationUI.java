import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.ArrayList;
/**
 * 
 * @author Bravo Team 10/26/20
 *
 */
public class SystemApplicationUI {
	SimpleDateFormat today = new SimpleDateFormat();
	private static final String WELCOME_MESSAGE = "Welcome to the online USC housing search!";
	private String[] mainMenuOptions = {"Create an Account", "Log In", "Search for Homes", "Post a listing", "Log Out"};
	private Scanner scanner;
	private SystemApplication systemapplicationUI;
	
	SystemApplicationUI() {
		scanner = new Scanner(System.in);
		systemapplicationUI = new SystemApplication();
	}
	
	/**
	 * Example add to the landlord JSON
	 */
	public void addJSON() {
		LandlordList landlord = LandlordList.getInstance();
		landlord.addLandlord(3, "Antonio", "Brown", false, 4, null);
		landlord.addLandlord(1, "Bobby", "Brown", false, 2, null);
	}
	
	/**
	 * Reading landlord JSON
	 */
	public void displayLandlord() {
		LandlordList landlord = LandlordList.getInstance();
		ArrayList<Landlord> lists = landlord.getLandlord();
		for (Landlord ll : lists) {
			System.out.println(ll.getFirstName() + " " + ll.getLastName() + ", Rating: " + ll.getRating() + ", Properties Managed: " + ll.getPropertiesManaged());
		}
	}
	
	 
	public void displayListings() {
		ListingList listings = ListingList.getInstance();
		ArrayList<Listing> lists = listings.getListing();
		for (Listing ll : lists) {
			System.out.println("\nName and Address: " +  ll.getAddress() +", ID: " + ll.getID() + ", Number of Beds: " + ll.getNumBeds() + ", Number of Baths: "+ ll.getNumBaths() + ", Monthly Cost: " + ll.getRentCost() +  ", Distance to campus to the closest mile: " + ll.distanceFromCampus + "\nAmenities: " +ll.getAmenities()  +"\n");
			System.out.println("------------------");
		}
	}
	
	public void add() {
		AddJSON json = new AddJSON();
		json.addListingsJSON();
	}
	
	public void display() {
		DisplayListingJSON json = new DisplayListingJSON();
		json.displayListings();
	}
	
	public void run() {
		System.out.println(WELCOME_MESSAGE);		
		
		while(true) {
			displayMenu();
			
			int usercommand = userCommand(mainMenuOptions.length - 1);
			
			if (usercommand == -1) {
				System.out.println("Goodbye");
				break;
			}
			
			//If the user chooses the last option, log out
			if (usercommand == mainMenuOptions.length - 1) {
				break;
			}
			
			// Switch for user command based on input
			switch(usercommand) {
			case(0):
				createAccount();
				break;
				
			case(1):
				logIn();
				break;
				
			case(2):
				searchHomes();
				break;
			
			case(3):
				postListing();
				break;
				
			default:
				break;
			}
		}
	}
	
	private void createAccount() {
		System.out.println("Are you a student or property manager? \n1. Student \n2. Property Manager");
		int input = scanner.nextInt();
		if (input == 1) {
			System.out.println("What is your first name?");
			String name = scanner.nextLine();
			scanner.hasNextLine();
			System.out.println("What is your last name?");
			String lastname = scanner.nextLine();
			scanner.hasNextLine();
			System.out.println("What is your username?");
			String username = scanner.nextLine();
			scanner.hasNextLine();
			System.out.println("What is your password?");
			scanner.hasNextLine();
			String password = scanner.nextLine();
			System.out.println();
			String test = scanner.nextLine();
			User student = new Student(1, name, lastname, true, "0654", null, true);
			//add to student JSON method
			System.out.println("Congrats, your account is created!");
		}
		else if (input == 2) {
			System.out.println("What is your first name?");
			String name = scanner.nextLine();
			scanner.hasNextLine();
			System.out.println("What is your last name?");
			String lastname = scanner.nextLine();
			scanner.hasNextLine();
			System.out.println("What is your username?");
			String username = scanner.nextLine();
			scanner.hasNextLine();
			System.out.println("What is your password?");
			scanner.hasNextLine();
			String password = scanner.nextLine();
			System.out.println();
			String test = scanner.nextLine();
			//scanner.hasNextLine();
			//LandlordList landlord = LandlordList.getInstance();
			//landlord.addLandlord(6, name, lastname, false, 0, null);
			System.out.println("Congrats, your account is created!");
			return;
		}
		else {
			System.out.println("Invalid command");
			return;
		}
		
	}
	
	private void logIn() {
		System.out.println("What is your username?");
		String input = scanner.nextLine();
		System.out.println();
		String test = scanner.nextLine();
		System.out.println("What is your password?");
		String password = scanner.nextLine();
		System.out.println("Welcome back, "+ input + test);
		return;
	}
	
	private void searchHomes() {
		System.out.println("\nWhat type of housing are you looking for? \n1. House\n2. Apartment \n3. Townhouse \n4. Duplex");
		String home = scanner.nextLine();
		System.out.println();
		String test2 = scanner.nextLine();
		display();
		// List out listing JSON
		System.out.println("\nSelect the id of the listing you desire");
		int id = scanner.nextInt();
		System.out.println("Would you like to live with another registered user? \n1. Yes \n2. No");
		int input1 = scanner.nextInt();
		if (input1 == 1) {
			System.out.println("What is their username?");
			String iser = scanner.nextLine();
			scanner.hasNextLine();
			System.out.println();
			String test = scanner.nextLine();
		}
		System.out.println("Do you have an account? \n1. Yes \n2. No");
		int login = scanner.nextInt();
		if (login == 2) {
			System.out.println("You must make an account in order to sign a lease");
			return;
			//scanner.hasNextLine();
			//User student = new Student(1, name, lastname, true, "0654", null, true);
		}
		System.out.println("What is your username?");
		String user = scanner.nextLine();
		System.out.println();
		String test = scanner.nextLine();
		System.out.println("What is your password?");
		String password = scanner.nextLine();
		System.out.println("Welcome back, "+ user + test);
		System.out.println("Verify your first name");
		String name = scanner.nextLine();
		System.out.println("Verify your last name");
		String lastname = scanner.nextLine();
		ListingList listings = ListingList.getInstance();
		ArrayList<Listing> lists = listings.getListing();
		for (Listing ll : lists) {
			if (ll.getID() == id) {
				Listing listing = new Listing(ll.getAddress(), ll.getNumBeds(), ll.getNumBaths(), ll.getSquareFootage(), ll.getAmenities(), ll.getRentCost(), ll.isUtilitiesIncluded(), ll.getLeaseDuration(), ll.canSublet, ll.distanceFromCampus, ll.isHandicapAccessible, ll.getID(), ll.getType());
				LeaseApplicationWorks lease = new LeaseApplicationWorks();
				User student = new Student(1, name, lastname, true, "0654", null, true);
				//User student = new Student(1, "Steve", "Jobs", false, "0584", null, true);
				User landlord = new Landlord(2, "George", "Castanza", false, null);
				lease.generateLease(student, landlord, listing);
			}
		}
		// Code to generate and fill in lease agreement
		LeaseApplicationWorks lease = new LeaseApplicationWorks();
		System.out.println("Congratulations on your new home, " + name + "!");
	}
	
	/**
	 * Post Listing Function for UI
	 */
	private void postListing() {
		//TODO Add More logic
		System.out.println("Are you a registered property manager? \n1. Yes\n2. No");
		int input = scanner.nextInt();
		if (input== 2) {
			System.out.println("Sorry, you must be a property manager to post a listing");
			return;
		}
		logIn();
			System.out.println("What type of property is the listing?");
			String listingType = scanner.nextLine();
			System.out.println();
			String test = scanner.nextLine();
			System.out.println("What is the name of the complex?");
			String name = scanner.nextLine();
			System.out.println("What is the unit's address?");
			String address = scanner.nextLine();
			System.out.println("How many beds in the unit?");
			int numBed = scanner.nextInt();
			System.out.println("How many baths in the unit?");
			double numBath = scanner.nextDouble();
			System.out.println("How many square feet is the unit?");
			int sqrfeet = scanner.nextInt();
			System.out.println("What is the monthly rate for the unit?");
			int rate = scanner.nextInt();
			System.out.println("Are utilities included? Y or N");
			scanner.hasNext();
			String utilities = scanner.nextLine();
			System.out.println("How long does the lease last?");
			String length = scanner.nextLine();
			System.out.println();
			String test2 = scanner.nextLine();
			System.out.println("Can the leasee sublet the lease?");
			String sublet = scanner.nextLine();
			System.out.println("What is the distance from campus, to the nearest mile?");
			int distance = scanner.nextInt();
			System.out.println("Enter all the amenities included, seperated by a comma");
			String amenities = scanner.nextLine();
			System.out.println();
			String test3 = scanner.nextLine();
			System.out.println("How many units are available?");
			int units = scanner.nextInt();
			//TODO Add the new listing
			System.out.println("Congrats, your listing was successfully added! Would you like to see it? 1.Y or 2.N");
			int inp = scanner.nextInt();
			if (inp == 2) {
				return;
			}
			displayListings();
		
	}
	
	
	
	private void displayMenu() {
		System.out.println("\n\n      Main Menu \n");
		for (int i = 0; i < mainMenuOptions.length; i++) {
			System.out.println((i+1) + ". " + mainMenuOptions[i]);
		}
		System.out.println("\n");
	}
	
	private int userCommand(int numCommands) {
		System.out.print("What would you like to currently do?: ");
		
		int input = scanner.nextInt();
		int command = input - 1;
		
		if(command >= 0 && command <= numCommands - 1) 
			return command;
		
		return -1;
	}
	

	
	public static void main(String[] args) {
		SystemApplicationUI systemInterface = new SystemApplicationUI();
		//systemInterface.addJSON();
		//systemInterface.displayLandlord();
		//systemInterface.addListingJSON();
		systemInterface.add();
		//systemInterface.displayListings();
		systemInterface.run();
		//System.out.println(java.util.Arrays.asList(Amenities.values()));
		
	}
} 