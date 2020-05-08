import java.util.ArrayList;

public class Student {
    private String firstName;
    private String lastName;
    private String student_ID;
    private double gpa;
    private int totalCredits;
    private ArrayList<Course> courses;
    private Address address;

    public Student(String firstName, String lastName, String student_ID, ArrayList<Course> courses, Address address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.student_ID = student_ID;
        this.courses = courses;
        this.address = address;
        setTotalCredits(this.courses);
        setGpa(this.courses);

    }   // end of constructor

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getStudent_ID() {
        return student_ID;
    }

    public void setStudent_ID(String student_ID) {
        this.student_ID = student_ID;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(ArrayList<Course> coursesTaken) {
        int tempCourseCreditHour;
        int tempSumCreditHours = 0;
        double tempGpa = 0;
        double tempQualityPt;

        for(int i = 0; i < coursesTaken.size(); i++){
            tempSumCreditHours += coursesTaken.get(i).getCreditHour();
            tempCourseCreditHour = coursesTaken.get(i).getCreditHour();
            tempQualityPt = coursesTaken.get(i).getQualityPoint();

            tempGpa += (tempCourseCreditHour * tempQualityPt);

        }
        double gpa1 = (tempGpa / tempSumCreditHours);

        this.gpa = gpa1;
    }

    public int getTotalCredits() {
        return totalCredits;
    }

    public void setTotalCredits(ArrayList<Course> coursesTaken) {
        int temp = 0;
        for(int i = 0; i < coursesTaken.size(); i++){
            temp += coursesTaken.get(i).getCreditHour();

        }
        this.totalCredits = temp;
    }

    public ArrayList<Course> getCourses() {
        return courses;
    }

    public void setCourses(ArrayList<Course> courses) {
        this.courses = courses;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}   // end of Student class
