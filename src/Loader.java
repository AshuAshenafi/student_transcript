import java.util.ArrayList;

/**
 * This class laods all the arraylist for students to hardcode the data user actually can enter every info!
 */
public class Loader {
    public static ArrayList<Student> loadArrayLists(){
        ArrayList<Student> AllStudents = new ArrayList<>();

        ArrayList<Course> coursesTaken1 = new ArrayList<>();
        ArrayList<Course> coursesTaken2 = new ArrayList<>();
        ArrayList<Course> coursesTaken3 = new ArrayList<>();

        Course tempCourse1 = new Course("Java1012", "Introduction to Java", 3, "A", 1999, "Fall");
        Course tempCourse12 = new Course("Seln1012", "Selenium", 2, "C", 2020, "Winter");
        Course tempCourse13 = new Course("DB2562", "Database", 3, "B", 2000, "Summer");
        Course tempCourse14 = new Course("Mavn5632", "Maven", 4, "D", 2011, "Spring");
        Course tempCourse15 = new Course("Pyth5263", "Python", 3, "F", 2010, "Spring");

        Course tempCourse16 = new Course("HTML2252", "HTML", 2, "A", 2008, "Spring");
        Course tempCourse17 = new Course("Java222", "Java Core", 3, "A", 2008, "Spring");
        Course tempCourse18 = new Course("Bstr111", "Boorstrap for JavaScript", 3, "B", 2008, "Summer");
        Course tempCourse19 = new Course("ACAD555", "AutoCad Advanced", 3, "C", 2008, "Spring");
        Course tempCourse111 = new Course("Jenk888", "Jenkins", 2, "A", 2008, "Summer");
        Course tempCourse112 = new Course("Jenk333", "Jenkins2", 2, "B", 2008, "Summer");
        Course tempCourse113 = new Course("Jenk222", "Jenkins4", 2, "C", 2008, "Winter");
        Course tempCourse1131 = new Course("html222", "Advanced Front Web Page", 4, "A", 2008, "Winter");
        Course tempCourse114 = new Course("Jenk111", "Jenkins5", 2, "D", 2008, "Fall");
        Course tempCourse1141 = new Course("Spring111", "Advance Spring boot", 3, "A", 2008, "Fall");
        Course tempCourse1142 = new Course("Dist2222", "Distributed Systems", 3, "B", 2008, "Fall");
        Course tempCourse1143 = new Course("Netw1111", "Networking", 3, "C", 2008, "Fall");


        Address tempAdd1 = new Address("2033 Scenery dr", "Germantown", "MD", 20202);
        coursesTaken1.add(tempCourse1);
        coursesTaken1.add(tempCourse12);
        coursesTaken1.add(tempCourse13);
        coursesTaken1.add(tempCourse14);
        coursesTaken1.add(tempCourse15);
        coursesTaken1.add(tempCourse16);
        coursesTaken1.add(tempCourse17);
        coursesTaken1.add(tempCourse18);
        coursesTaken1.add(tempCourse19);
        coursesTaken1.add(tempCourse111);
        coursesTaken1.add(tempCourse112);
        coursesTaken1.add(tempCourse113);
        coursesTaken1.add(tempCourse1131);
        coursesTaken1.add(tempCourse114);
        coursesTaken1.add(tempCourse1141);
        coursesTaken1.add(tempCourse1142);
        coursesTaken1.add(tempCourse1143);
        Student stud1 = new Student ("Ayele", "Zola", "MC6325", coursesTaken1, tempAdd1);
        AllStudents.add(stud1);


        Course tempCourse2 = new Course("Test325", "Software Testing", 3, "C", 1998, "Summer");
        Course tempCourse21 = new Course("Javs1111", "JavaScript", 3, "A", 2000, "Fall");
        Course tempCourse22 = new Course("CSS2531", "Cascaded sheet", 4, "B", 1990, "Summer");
        Course tempCourse23 = new Course("Test325", "Software Testing", 3, "F", 1997, "Summer");

        Address tempAdd2 = new Address("2033 Fenton St", "Virginia", "VA", 23333);
        coursesTaken2.add(tempCourse2);
        coursesTaken2.add(tempCourse21);
        coursesTaken2.add(tempCourse22);
        coursesTaken2.add(tempCourse23);
        Student stud2 = new Student ("John", "Smith", "MC5552", coursesTaken2, tempAdd2);
        AllStudents.add(stud2);

        Course tempCourse3 = new Course("Web1520", "Web Design 1", 4, "B", 2008, "Winter");
        Course tempCourse31 = new Course("Test2588", "Software Testing", 3, "A", 2004, "Summer");
        Course tempCourse32 = new Course("CSS2531", "Cascaded sheet", 4, "B", 1990, "Summer");
        Course tempCourse33 = new Course("Javs1111", "JavaScript", 3, "A", 2000, "Fall");
        Course tempCourse34 = new Course("Web2220", "Web Design 2", 4, "B", 2008, "Winter");

        Address tempAdd3 = new Address("5263 Sligo Ave", "MD", "VA", 23333);
        coursesTaken3.add(tempCourse3);
        coursesTaken3.add(tempCourse31);
        coursesTaken3.add(tempCourse32);
        coursesTaken3.add(tempCourse33);
        coursesTaken3.add(tempCourse34);

        Student stud3 = new Student ("Adam", "Teferi", "MC5552", coursesTaken3, tempAdd3);
        AllStudents.add(stud3);
        return AllStudents;
    }
}
