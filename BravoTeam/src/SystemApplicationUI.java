import java.util.Scanner;
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
	
	public void run() {
		System.out.println(WELCOME_MESSAGE);
		
		while(true) {
			displayMenu();
			
			int usercommand = userCommand(mainMenuOptions.length - 1);
			
			if (usercommand == -1) {
				System.out.println("Not a valid command.");
				continue;
			}
			
			if (usercommand == mainMenuOptions.length - 1) {
				break;
			}
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
		systemInterface.run();
	}
}
