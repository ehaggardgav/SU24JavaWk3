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

//This command requires that there are at least three students in the roster:
String studentRemoved = students.remove(2);

//System.out.println(students);

System.out.println();
System.out.println(studentRemoved + " has been removed.");

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
    int grade = scan.nextInt();
    scan.nextLine(); 
    exam2.add(grade);
  }

  //System.out.println(grades_exam1); 

  //Average score for Exam 1
float sum2 = 0;
  for (int grade : exam2) {
    sum2 += grade;
  }

  float average2 = sum2 / exam2.size();
  System.out.println("Exam 2 Average: " + average);

//Exam 3
System.out.println();

System.out.println("Student scores for Exam 3:");
ArrayList<Integer> exam3 = new ArrayList<>();

for (String student : students) {
  System.out.print(student + ": ");
    int grade = scan.nextInt();
    scan.nextLine(); 
    exam3.add(grade);
  }

//System.out.println(grades_exam1); 

//Average score for Exam 1
  float sum3 = 0;
    for (int grade : exam3) {
      sum3 += grade;
    }

    float average3 = sum3 / exam3.size();
    System.out.println("Exam 3 Average: " + average);

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