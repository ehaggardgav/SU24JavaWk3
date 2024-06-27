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

//allows user to input name of the student to remove, and returns a prompt if the student's name is not on the roster
  System.out.println();
  String studentToRemove;
  while (true) {
      System.out.print("Enter name of the student to remove: ");
      studentToRemove = scan.nextLine();
      if (students.contains(studentToRemove)) {
          break;
      } else {
          System.out.println("Student not found. Please try again.");
      }
  }

  // Remove the student with the specified name and print their name
students.remove(studentToRemove);
System.out.println(studentToRemove + " has been removed.");

System.out.println();

//Exam 1 
System.out.println("Student scores for Exam 1:");
ArrayList<Integer> exam1 = new ArrayList<>();
  
for (String student : students) {
  System.out.print(student + ": ");
    int grade = scan.nextInt();
    scan.nextLine(); 
    exam1.add(grade);
}

//System.out.println(exam1); 

//Average score for Exam 1
float sum = 0;
  for (int grade : exam1) {
    sum += grade;
  }

  float average = sum / exam1.size();
  System.out.println("Exam 1 Average: " + average);

//Exam 2
System.out.println();

System.out.println("Student scores for Exam 2:");
ArrayList<Integer> exam2 = new ArrayList<>();

for (String student : students) {
  System.out.print(student + ": ");
    int grade2 = scan.nextInt();
    scan.nextLine(); 
    exam2.add(grade2);
  }

  //System.out.println(grades_exam2); 

  //Average score for Exam 2
float sum2 = 0;
  for (int grade2 : exam2) {
    sum2 += grade2;
  }

  float average2 = sum2 / exam2.size();
  System.out.println("Exam 2 Average: " + average2);

//Exam 3
System.out.println();

System.out.println("Student scores for Exam 3:");
ArrayList<Integer> exam3 = new ArrayList<>();

for (String student : students) {
  System.out.print(student + ": ");
    int grade3 = scan.nextInt();
    scan.nextLine(); 
    exam3.add(grade3);
  }

//System.out.println(grades_exam3); 

//Average score for Exam 3
  float sum3 = 0;
    for (int grade3 : exam3) {
      sum3 += grade3;
    }

    float average3 = sum3 / exam3.size();
    System.out.println("Exam 3 Average: " + average3);

//Final Averages
ArrayList<Float> finals = new ArrayList<>();
float finalScore = 0;
System.out.println("\nFinal Grades:");
  for (int i = 0; i < students.size(); i++) {
    float finalGrades = (exam1.get(i) * 0.2f) + (exam2.get(i) * 0.3f) + (exam3.get(i) * 0.5f);
        finals.add(finalGrades);
        finalScore += finalGrades;
        System.out.println(students.get(i) + ": " + finalGrades);
    }

// Calculate and print average final grade
float averageFinals = finalScore / students.size();
System.out.printf("\nFinal Average: %.1f\n", + averageFinals);



  

  

}
    //System.out.println(nums_arr[3]);

  // @Test
  // void addition() {
  //     assertEquals(2, 1 + 1);
  // }
}