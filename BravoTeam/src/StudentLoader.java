import java.io.FileReader;
import java.util.ArrayList;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class StudentLoader extends StudentConstants {
  public static ArrayList<User> loadStudent() {
    ArrayList<User> students = new ArrayList<User>();
    
    try {
        FileReader reader = new FileReader(STUDENT_FILE_NAME);
        JSONParser parser = new JSONParser();
        JSONArray studentJSON = (JSONArray) new JSONParser().parse(reader);
        
        for(int i = 0; i < studentJSON.size(); i++)
        {
            JSONObject userJSON = (JSONObject)studentJSON.get(i);
            int id = (int)userJSON.get(ID);
            String firstName = (String)userJSON.get(STUDENT_FIRST_NAME);
            String lastName = (String)userJSON.get(STUDENT_LAST_NAME);
            boolean isGuest = (boolean)userJSON.get(IS_GUEST);
            String studentID = (String)userJSON.get(STUDENT_ID);
            boolean isUSCStudent = (boolean)userJSON.get(IS_USC_STUDENT);
            int rating = (int)userJSON.get(STUDENT_RATING);
            ArrayList<Listing> favoriteListings = (ArrayList<Listing>)userJSON.get(FAVORITE_LISTINGS);
            
            students.add(new Student(id, firstName, lastName, isGuest, rating, studentID, favoriteListings, isUSCStudent));
        }
        
        return students;
    }
    catch (Exception e) {
        e.printStackTrace();
    }
    
    return null;
}

}
