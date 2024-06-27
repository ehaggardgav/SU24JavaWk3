// import static org.junit.jupiter.api.Assertions.assertEquals;

// import org.junit.jupiter.api.Test;


//test comment
import java.util.Scanner;
import java.util.ArrayList;
public class Main {
public static void main(String[] args) {
//Create dynamic array to hold student names
ArrayList<String> students = new ArrayList<>();
Scanner scan = new Scanner(System.in);

//Construct student roster
System.out.println("Student Roster");
System.out.println(""); 
  
String name = "";
int studentNum = 1;
  do {
    System.out.print("Student" + studentNum + ": ");
    name = scan.nextLine();
    if (!name.equals("x")){
      students.add(name);
    }
    
    studentNum++;
  } while (!name.equals("x"));

  //print command was a check to see that the array was created properly, and can now be commented out, does not need to be executed in the console
  //System.out.println(students);

String studentRemoved = students.remove(2);
//System.out.println(students);

System.out.println();
System.out.println(studentRemoved + " has been removed.");

System.out.println();

System.out.println("Student grades for exam 1:");
ArrayList<Integer> grades_exam1 = new ArrayList<>();
  
for (String student : students) {
  System.out.print(student + ": ");
    int grade = scan.nextInt();
    scan.nextLine(); 
    grades_exam1.add(grade);
}

  
  /*
  System.out.println("");
  System.out.print(items[0] + ": ");
  Integer quantity1 = scan.nextInt();
        scan.nextLine();
*/




  

  

}
    //System.out.println(nums_arr[3]);

  // @Test
  // void addition() {
  //     assertEquals(2, 1 + 1);
  // }
}