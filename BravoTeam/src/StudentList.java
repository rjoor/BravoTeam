import java.util.ArrayList;

public class StudentList {
  private static StudentList studentlist;
  ArrayList<Student> students = new ArrayList<Student>();

  private StudentList() {}
  
  public static StudentList getInstance() {
    if (studentlist == null)
      studentlist = new StudentList();
    return studentlist;
  }
  
  public ArrayList<Student> getStudent() {
    return students;
   }
}