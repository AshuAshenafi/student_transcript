import java.util.ArrayList;
import java.util.Scanner;

public class Validator {
    // create arraylist of all students list
    static ArrayList<Student> listOfAllStudents = new ArrayList<>();

    public void startApp() {
        Scanner keybd = new Scanner(System.in);
        Loader loadArrayLists = new Loader();
        listOfAllStudents = loadArrayLists.loadArrayLists();
        boolean hasNextStudent = true;

        System.out.println("\nWelcome to the Transcript Application.");
        while (hasNextStudent) {
            System.out.println("\n--------------Student Infor--------------");
            System.out.print("Enter Student First Name: ");
            String firstName = keybd.nextLine();
            System.out.print("Enter Student Last Name: ");
            String lastName = keybd.nextLine();
            System.out.print("Enter Student ID: ");
            String studentId = keybd.nextLine();

            // receive address
            System.out.println("\n--------------Student Address--------------");
            System.out.print("Enter Student Address, \nFirst Enter Street Name: ");
            String streetName = keybd.nextLine();
            System.out.print("Address, Enter City: ");
            String city = keybd.nextLine();
            System.out.print("Address, Enter State: ");
            String state = keybd.nextLine();
            System.out.print("Address, Enter Zip Code: ");
            int zipCode = keybd.nextInt();
            keybd.nextLine();

            // push address to a temporary arraylist
            Address tempAddress = new Address(streetName, city, state, zipCode);

            // create an arraylist to store courses a student took
            ArrayList<Course> coursesTaken = new ArrayList<>();

            boolean hasNextCourse = true;
            while (hasNextCourse) {
                System.out.println("\n--------------Course Information--------------");
                System.out.print("Enter Courses taken: ");
                System.out.print("Enter Course Number: ");
                String courseNumber = keybd.nextLine();
                System.out.print("Enter Course Name: ");
                String courseName = keybd.nextLine();
                System.out.print("Enter Course Credit Hour: ");
                int creditHour = keybd.nextInt();
                keybd.nextLine();
                System.out.print("Enter Course Grade: ");
                String grade = keybd.nextLine();

                System.out.print("Enter Academic Year: ");
                int year = keybd.nextInt();
                keybd.nextLine();
                // validate if user entered correct word
                boolean cont = true;
                String semester = "";
                while (cont) {

                    System.out.print("Enter Semester: ");
                    semester = keybd.nextLine();
                    int temp = whatSeason(semester);
                    if (temp == 0) {
                        System.out.println("-----------");
                        System.out.println("\nplease type either of this?\n(summer, fall, winter, spring");
                        System.out.println("-----------");
                    } else {
                        cont = false;
                    }
                }

                Course tempCourse = new Course(courseNumber, courseName, creditHour, grade, year, semester);
                tempCourse.setQualityPoint(grade);

                // add courses on the temporary arraylist
                coursesTaken.add(tempCourse);

                // prompt user needs to add more courses
                System.out.print("\nDo you have more courses to ADD? (y/n) ");
                String addMoreCourse = keybd.nextLine();

                if (!addMoreCourse.equalsIgnoreCase("y")) {
                    hasNextCourse = false;
                }

            }   // end of hasNextCourse while loop

            Student students = new Student(firstName, lastName, studentId, coursesTaken, tempAddress);
            listOfAllStudents.add(students);
            System.out.print("\nDo you have more Students to ADD? (y/n) ");

            String addMoreStudnet = keybd.nextLine();

            if (!addMoreStudnet.equalsIgnoreCase("y")) {
                hasNextStudent = false;
            }
        }   // end of hasMoreStudent while loop
    }   // end of startup class

    public ArrayList<Student> sendAllStudents() {
        bubleSortCourses();
        return listOfAllStudents;
    }

    public void bubleSortCourses() {
        for (int i = 0; i < listOfAllStudents.size(); i++) {
            int n = listOfAllStudents.get(i).getCourses().size();
            for (int j = 0; j < (n - 1); j++) {
                for (int k = 0; k < n - j - 1; k++) {
                    int a = listOfAllStudents.get(i).getCourses().get(k + 1).getYear();
                    int b = listOfAllStudents.get(i).getCourses().get(k).getYear();
                    if (a < b) {
                        Course temp = listOfAllStudents.get(i).getCourses().get(k + 1);

                        listOfAllStudents.get(i).getCourses().set(k + 1, listOfAllStudents.get(i).getCourses().get(k));
                        listOfAllStudents.get(i).getCourses().set(k, temp);
                    }
                }   // end of for(k) loop inner most
            }   // end of for(j) loop middle

        }   // end of for(i) loop most outer
        bubleSortCoursesBySemester();
    }

    public void bubleSortCoursesBySemester() {
        for (int i = 0; i < listOfAllStudents.size(); i++) {
            int n = listOfAllStudents.get(i).getCourses().size();
            for (int j = 0; j < (n - 1); j++) {
                for (int k = 0; k < n - j - 1; k++) {
                    int tempYear2 = listOfAllStudents.get(i).getCourses().get(k + 1).getYear();
                    int tempYear1 = listOfAllStudents.get(i).getCourses().get(k).getYear();
                    // if the year of two courses is the same we going to sort their semester
                    if (tempYear2 == tempYear1) {

                        String aSeason = listOfAllStudents.get(i).getCourses().get(k + 1).getSemester();
                        int a = whatSeason(aSeason);
                        String bSeason = listOfAllStudents.get(i).getCourses().get(k).getSemester();
                        int b = whatSeason(bSeason);
                        if (a < b) {
                            Course temp = listOfAllStudents.get(i).getCourses().get(k + 1);

                            listOfAllStudents.get(i).getCourses().set(k + 1, listOfAllStudents.get(i).getCourses().get(k));
                            listOfAllStudents.get(i).getCourses().set(k, temp);
                        }
                    }
                }   // end of for(k) loop inner most
            }   // end of for(j) loop middle
        }   // end of for(i) loop most outer
    }

    public static int whatSeason(String seasonName) {
        int semesterNumber = 0;
        if (seasonName.equalsIgnoreCase("summer")) {
            semesterNumber = 1;
        } else if (seasonName.equalsIgnoreCase("fall")) {
            semesterNumber = 2;
        } else if (seasonName.equalsIgnoreCase("winter")) {
            semesterNumber = 3;
        } else if (seasonName.equalsIgnoreCase("spring")) {
            semesterNumber = 4;
        }

        return semesterNumber;
    }

    public static double studentGpa(int index) {

        double studentGpa = 0;
        for (int i = index; i < index + 1; i++) {
            studentGpa = listOfAllStudents.get(i).getGpa();
        }
        return studentGpa;
    }

    public static double studentCredits(int index) {

        double studentCredits = 0;
        for (int i = index; i < index + 1; i++) {
            studentCredits = listOfAllStudents.get(i).getTotalCredits();
        }
        return studentCredits;
    }
}