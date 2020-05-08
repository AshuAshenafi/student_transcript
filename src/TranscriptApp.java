import java.util.ArrayList;
import java.util.Scanner;

public class TranscriptApp {

    static ArrayList<Student>allStudents = new ArrayList<>();

    public static void main(String[] args) {
        Validator begin = new Validator();
        begin.startApp();
        begin.bubleSortCourses();
        printAll();
    }
    public static void printAll(){
        Validator vld = new Validator();

        allStudents = vld.sendAllStudents();
        for(int i = 0; i <allStudents.size(); i++){

            // print name and id of student with current index
            printNameAndID(i);

            int tempYear1 = 0;
            int tempYear2 = 0;
            String semester1 = "";
            String semester2 = "";

            for(int j = 0; j < allStudents.get(i).getCourses().size(); j ++){

                tempYear1 = allStudents.get(i).getCourses().get(j).getYear();
                semester1 = allStudents.get(i).getCourses().get(j).getSemester();

                // if the sorted year changes, print academic year
                if(!(tempYear1 == tempYear2)){

                    System.out.printf("\n\n-----------------------------------------------------------------------------------------------------------------------------");
                    System.out.println("\nAcademic Year: " + tempYear1 + ",\t\tSemester: " + semester1); // to be sorted by semester
                    System.out.printf("-----------------------------------------------------------------------------------------------------------------------------");

                    // print table head for group of courses
                    printTableHead();
                    System.out.println();

                } else if(tempYear1 == tempYear2){
                    if(!(semester1.equalsIgnoreCase(semester2))){
                        System.out.println();
                    System.out.printf("\n                         -------------------------------------" + "Semester: " + semester1 + "-------------------------------------\n");

                    }

                }
                else{
                    System.out.println();
                }

                tempYear2 = tempYear1;
                semester2 = semester1;

                System.out.printf("\n%-30s %-40s %9s %-12s %-10s %-7s %-10s %12s", allStudents.get(i).getCourses().get(j).getCourseNumber(),
                        allStudents.get(i).getCourses().get(j).getCourseName(), " ",
                        allStudents.get(i).getCourses().get(j).getCreditHour(),
                        "      " + (allStudents.get(i).getCourses().get(j).getGrade()).toUpperCase(),
                        "            " + allStudents.get(i).getCourses().get(j).getQualityPoint(),
                        "      " + "",
//                        "      " + allStudents.get(i).getCourses().get(j).getYear(),
                        "");
//                        allStudents.get(i).getCourses().get(j).getSemester());

            }
            System.out.printf("\n\n%79s %-12s %6s %4s", "Student Total Credits:", vld.studentCredits(i), "CGPA: ", String.format("%.2f", vld.studentGpa(i)) );

            System.out.println("\n*****************************************************************************************************************************");
        }   // end of outer for loop


    }   // end of printAll() method
    public static void printNameAndID(int i) {

        System.out.println("\nStudent Name: " + allStudents.get(i).getFirstName() + " " + allStudents.get(i).getLastName());
        System.out.println("Student ID: " + allStudents.get(i).getStudent_ID());

    }
    public static void printTableHead(){

        System.out.printf("\n%30s %-38s %-10s %15s %20s", "Course Number                       ", "Course Name", "Credit hours", "Grade", "Quality Points");
        System.out.printf("\n%30s %-38s %-10s %15s %20s", "-----------                         ", "-----------", "------------", "-----", "--------------");
    }
}
