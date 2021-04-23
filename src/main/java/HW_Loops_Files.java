import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.File;

public class HW_Loops_Files {

  private static final String dataFileName = "courseData.txt";

  // Public for testing purposes, these should be protected or private.
  public static double programWeight;
  public static double midtermWeight;
  public static double finalWeight;

  public static void main(String[] args) {

    int courseNumber;
    Scanner inputFile;

    try {
      inputFile = new Scanner(new File(dataFileName));

      // Read weights
      programWeight = inputFile.nextDouble();
      midtermWeight = inputFile.nextDouble();
      finalWeight = inputFile.nextDouble();

      while (inputFile.hasNextInt()) {
        int studentCount = 1;  // Introduce a bug, should be 0
        courseNumber = inputFile.nextInt();

        // Report header
        System.out.println("Grade Data For Class " + courseNumber);
        System.out.println();
        System.out.println(" ID   Programs  Midterm  Final  Weighted Average  Programs Grade");
        System.out.println("----  --------  -------  -----  ----------------  --------------");

        int studentId;
        double classAvg = 0.0;

        while ((studentId = inputFile.nextInt()) != 0) {
          studentCount++;
          int programGrade = inputFile.nextInt();
          int midtermGrade = inputFile.nextInt();
          int finalGrade = inputFile.nextInt();
          double studentGrade = ((double)programGrade * programWeight) + ((double) midtermGrade * midtermWeight) +
                  ((double)finalGrade * finalWeight);

          // Introduce a bug, should be 70
          String passFail = (programGrade >= 70) ? "Pass" : "Fail";

          // Print formatted student report
          System.out.println(studentId +
                             String.format("%7d", programGrade) +
                             String.format("%10d", midtermGrade) +
                             String.format("%8d", finalGrade) +
                             String.format("%13.2f", studentGrade) +
                             String.format("%16s", passFail));

          classAvg += studentGrade;
        }
        classAvg /= studentCount;
        System.out.println("Class average based on " + studentCount + ": " + String.format("%.2f", classAvg));
        System.out.println();
      }
    } catch(FileNotFoundException fnfEx){
      System.out.println("Course data file not found, exiting...");
    }
  }
}
