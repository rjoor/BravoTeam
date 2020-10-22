/**
 * UserTester class creates instances of a student and landlord to test
 * that they instantiate. 
 * 
 * @author Vince Kolb-Lugo
 * Bravo Team
 * 2020-10-20
 *
 */
public class UserTester {
	
	public static void main(String[] args) {
		
		User student = new Student("Jerry", "Seinfeld", false, 1, "0654", null, true);
		User landlord = new Landlord("George", "Castanza", false, 1, null);
		
		System.out.println("student: ");
		System.out.println(student.printData());
		System.out.println("landlord: ");
		System.out.println(landlord.printData());
	}
}
