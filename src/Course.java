public class Course {
    private String courseNumber;
    private String courseName;
    private int creditHour;
    private String grade;
    private int year;
    private String semester;
    private double qualityPoint;
    private double gpa;

    public Course() {
    }

    public Course(String courseNumber, String courseName, int creditHour, String grade, int year, String semester) {
        this.courseNumber = courseNumber;
        this.courseName = courseName;
        this.creditHour = creditHour;
        this.grade = grade;
        this.year = year;
        this.semester = semester;

        setQualityPoint(this.grade);
        setGpa(this.creditHour, getQualityPoint());
        setSemester(this.semester);


    }

    public String getCourseNumber() {
        return courseNumber;
    }

    public void setCourseNumber(String courseNumber) {
        this.courseNumber = courseNumber;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public int getCreditHour() {
        return creditHour;
    }

    public void setCreditHour(int creditHour) {
        this.creditHour = creditHour;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getSemester() {
        return semester;
    }

    public void setSemester(String semester) {
        int count = 0;
        String [] seasons = {"summer", "fall", "winter", "spring"};
        for(int i = 0; i < seasons.length; i++){
            if(semester.equalsIgnoreCase(seasons[i])){
                count++;
                break;
            }
        }
        if(count == 0){
            System.out.println("Wrong word for Semester! Please Enter correctly? ");
        } else{
        this.semester = semester;

        }
    }

    public double getQualityPoint() {
        return qualityPoint;
    }

    public void setQualityPoint(String grade) {
        if (grade.equalsIgnoreCase("A")){
            this.qualityPoint = 4.0;
        }
        else if(grade.equalsIgnoreCase("B")){
            this.qualityPoint = 3.0;
        }
        else if(grade.equalsIgnoreCase("C")){
            this.qualityPoint = 2.0;
        }
        else if(grade.equalsIgnoreCase("D")){
            this.qualityPoint = 1.0;
        }
        else{
            this.qualityPoint = 0.0;
        }

    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(int creHr, double gpa) {
        this.gpa = creHr * gpa;
    }

    public String toString() {


        String retval = "Course Number: " + getCourseNumber() + "\t\tCourse Name: " + getCourseName() + "\t\tCredit Hour: " + getCreditHour() + "\t\tGrade: " + getGrade() + "\n";

        return retval;
    }
}
