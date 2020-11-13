import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
/**
 * StudentWriterTest class tests the methods found in the Student Writer class and Student Loader class.
 * Testing focuses mostly on adding elements to JSON file.
 * 
 * @author Vince Kolb-Lugo
 * Bravo Team
 * 2020-11-13
 *
 */

class StudentWriterTest {
	
	private StudentList students = StudentList.getInstance();
	private ArrayList<Student> studentList = students.getStudents();

	
		@BeforeEach
	void setUp() throws Exception {
		StudentList.getInstance().getStudents().clear();
		StudentWriter.saveStuddent();
	}

	@AfterEach
	void tearDown() throws Exception {
		StudentList.getInstance().getStudents().clear();
		StudentWriter.saveStuddent();
	}

	@Test
	void testWriteZeroStudents() {
		studentList = StudentLoader.loadStudent();
		assertEquals(0, studentList.size());
	}
	
	@Test
	void testWriteNullUser() {
		studentList.add(new Student(0, null, null, false, 0, null, null, false));
		StudentWriter.saveStuddent();
		assertEquals(null, StudentLoader.loadStudent().get(0).getFirstName());
	}
	
	@Test
	void testWriteOneStudent() {
		studentList.add(new Student(0, "Roger", "Danger", true, 5, null, null, false));
		StudentWriter.saveStuddent();
		assertEquals("Roger", StudentLoader.loadStudent().get(0).getFirstName());
	}
	
	@Test
	void testWriteFourStudents() {
		studentList.add(new Student(0, "Larry", "Stooge", true, 1, null, null, false));
		studentList.add(new Student(0, "Curly", "Stooge", false, 0, null, null, false));
		studentList.add(new Student(0, "Moe", "Stooge", false, 0, null, null, false));
		studentList.add(new Student(0, "Karl", "Marx", false, 0, null, null, false));
		StudentWriter.saveStuddent();
		assertEquals("Karl", StudentLoader.loadStudent().get(4).getFirstName());
	}
	
	@Test
	void testWriteEmptyFirstNameStudent() {
		studentList.add(new Student(0, "", "", false, 0, null, null, false));
		StudentWriter.saveStuddent();
		assertEquals("", StudentLoader.loadStudent().get(0).getFirstName());
	}
	
	@Test 
	void testWriteEmptyLastNameStudent() {
		studentList.add(new Student(0, "", "", false, 0, null, null, false));
		StudentWriter.saveStuddent();
		assertEquals("", StudentLoader.loadStudent().get(0).getLastName());
	}
	
	@Test
	void testAddStudentCheckSize() {
		studentList.add(new Student(0, "TEST", "TEST", false, 0, null, null, false));
		StudentWriter.saveStuddent();
		assertEquals(1, studentList.size());
	}
}