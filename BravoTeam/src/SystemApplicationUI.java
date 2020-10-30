import java.util.Scanner;
import java.util.ArrayList;
/**
 * 
 * @author Bravo Team 10/26/20
 *
 */
public class SystemApplicationUI {
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
	
	public void run() {
		System.out.println(WELCOME_MESSAGE);		
		
		while(true) {
			displayMenu();
			
			int usercommand = userCommand(mainMenuOptions.length - 1);
			
			if (usercommand == -1) {
				System.out.println("Not a valid command.");
				continue;
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
		//TODO Add logic 
	}
	
	private void logIn() {
		//TODO Add logic
	}
	
	private void searchHomes() {
		//TODO Add logic
	}
	
	/**
	 * Post Listing Funciton for UI
	 */
	private void postListing() {
		//TODO Add More logic
		System.out.println("Are you a registered property manager? \n1. Yes\n2. No");
		String input = scanner.nextLine();
		if (input.equalsIgnoreCase("2")) {
			System.out.println("Sorry, you must be a property manager to post a listing");
		}
		if (input.equalsIgnoreCase("1")) {
			System.out.println("What type of property is the listing?");
			String listingType = scanner.nextLine();
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
			scanner.hasNext();
			String length = scanner.nextLine();
			System.out.println("Can the leasee sublet the lease?");
			String sublet = scanner.nextLine();
			scanner.hasNext();
			System.out.println("What is the distance from campus, to the nearest mile?");
			int distance = scanner.nextInt();
			System.out.println("Enter all the amenities included, seperated by a comma");
			scanner.hasNext();
			String amenities = scanner.nextLine();
			//TODO Add the new listing
			//System.out.println("Congrats, your listing was succesfully added!");
		}
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
		
		String input = scanner.nextLine();
		int command = Integer.parseInt(input) - 1;
		
		if(command >= 0 && command <= numCommands - 1) 
			return command;
		
		return -1;
	}
	
	public static void main(String[] args) {
		SystemApplicationUI systemInterface = new SystemApplicationUI();
		systemInterface.addJSON();
		systemInterface.displayLandlord();
		systemInterface.run();
	}
}
