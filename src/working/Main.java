package working;
import java.util.*;
import static utils.Base.*;
/*Formula object:
→ id : int
→ expression : String
→ type : String (identity / formula)
→ category : String (pythagorean / double angle / etc)
→ level1keywords: ArrayList (specific: sin²x, cos²x)
→ level2keywords: ArrayList (broad: sin, cos, tan)

The Formula object must store: id (int), 
expression (String), type (String — identity or formula),
 category (String), level1keywords (dynamic list of specific keywords),
  level2keywords (dynamic list of broad keywords).
Check for: correct field types, constructor completeness,
 whether ArrayList is used over static arrays for keywords, 
 and whether the class is sufficient to support add/search/list/edit operations.*/
class Formula
{
    int id;
    String expression;
    String type;
    String category;
    ArrayList<String> lvl1Keywords;
    ArrayList<String> lvl2Keywords;

    Formula(int id,String ex, String type , String category )
    {
        this.id=id;
        this.expression=ex;
        this.type=type;
        this.category=category;
        lvl1Keywords=new ArrayList<>();
        lvl2Keywords=new ArrayList<>();
        
    }

}
class Database 
{
    ArrayList<Formula> database= new ArrayList<>();
    void add(Formula ob)
    {
        //code here
    }

    void search(String searchWord)
    {
        //match variable againsts the id , expression , type... then search the Formula object list with the variable value searchWord 
    }

    void list()
    {
        for(int i=0;i<database.size();i++)
        {
            pl(database.get(i).expression);
        }
    }

    void list(String type)
    {
        // list specific field 
    }

    void edit()
    {
         // edit anything except id
    }
}


public class Main 
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Database db = new Database(); // Create one database for the program to use

        while (true) {
            System.out.println("1. Add Formula\n2. Search\n3. List All\n4. Edit Keywords\n5. Exit");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Clear the \n trap

            // Route the choice
            if (choice == 3) {
                db.list(); // Call the list method on your db instance
            } else if (choice == 5) {
                break; // Exit the loop
            }
            // Add other cases later
        }
    }
}