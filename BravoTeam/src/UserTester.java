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
		
		User student = new Student(1, "Jerry", "Seinfeld", false, "0654", null, true);
		User landlord = new Landlord(2, "George", "Castanza", false, null);
		
		System.out.println("student: ");
		System.out.println(student.printData());
		System.out.println("landlord: ");
		System.out.println(landlord.printData());
	}
}
