// import static org.junit.jupiter.api.Assertions.assertEquals;

// import org.junit.jupiter.api.Test;


//test comment
import java.util.Scanner;
import java.util.ArrayList;
public class Main {
public static void main(String[] args) {
//Create dynamic array to hold student names

Scanner scan = new Scanner(System.in);

System.out.println("Student Roster");
System.out.println(""); 
  
String name = "";
int studentNum = 1;
  do {
    System.out.print("Student" + studentNum + ": ");
    name = scan.nextLine();
    studentNum++;
  } while (!name.equals("x"));


}
    //System.out.println(nums_arr[3]);

  // @Test
  // void addition() {
  //     assertEquals(2, 1 + 1);
  // }
}