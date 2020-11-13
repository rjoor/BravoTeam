import static org.junit.Assert.assertFalse;
import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
/**
 * 
 * @author Vince Kolb-Lugo
 * Bravo Team
 * 2020-11-13
 * 
 *
 */
class StudentLoaderTest {
	private StudentList students = StudentList.getInstance();
	private ArrayList<Student> studentList = students.getStudents();

	@BeforeEach
	void setUp() throws Exception {
		studentList.clear();
		studentList.add(new Student(1, "Tommy", "Bahama", true, 3, null, null, false));
		studentList.add(new Student(2, "John", "Stewart", true, 5, null, null, false));
		StudentWriter.saveStuddent();
	}

	@AfterEach
	void tearDown() throws Exception {
		students.getInstance().getStudents().clear();
		StudentWriter.saveStuddent();
	}

	@Test
	void testGetStudentsListSize() {
		studentList = StudentLoader.loadStudent();
		assertEquals(2, studentList.size());
	}
	
	@Test
	void testAddStudent() {
		studentList.add(new Student(3, "Dan", "The Man", true, 2, null, null, false));
		assertEquals(3, studentList.size());
	}
	
	@Test 
	void testLoadNonexistingStudent(){
		studentList = StudentLoader.loadStudent();
		assertFalse("Stan", students.getStudents().get(3).getFirstName());
	}
	
	@Test
	void testExistingStudent() {
		studentList = StudentLoader.loadStudent();
		assertEquals("Tommmy", students.getStudents().get(0).getFirstName());
	}


	//TODO test for empty student, null student, length, add, overright, samenes
	//and other tests you see in Portia's example
}
