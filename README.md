#Student Transcript
* This project accepts any number of students, any number of courses information and prints 
a student transcript.
* The application separates each student, sorts courses taken by year and by semester.
* The application also calculates and prints students total credits and gpa of a student.

The Application is constructed from six different classes:
    1. TranscriptApp Class
    2. Student Class
    3. Loader Class
    4. Validator Class
    5. Course Class
    6. Address Class
    
##1. TranscriptApp
TranscriptApp Class is the one that has the main() method. This is where the application really 
begins executing. To leave this page logically clean the Valdator class is used to interact and 
store student informations but this main app class does the facilitation and the final out put print.
##2. Student Class
This class is used to create the object
##3. Loader class
This class as its name describes loads hardcoded students info or arraylists to the service process.
##4. Validator class
This class being behind the application main class does the service work
##5. Course class
This class helps to create course object
##6. Address class
The address class helps to create address object to each student.

    * The application uses bubble sort method to sort the arraylist according to year of course taken and season
    * The Four seasons are taken as school semester system ("summer", "fall", "winter", "spring")
    * User is forced to enter either of the four seasons. validation is done before setting the semester
    * That ensures sorting courses by year and semester is possible and easy.


I love this exercise. I really enjoyed it.

##PSEUDOCODE
declare an arraylist to hold all the students info
start
instantiate validator class to begin loading hardcoded sample students into our arraylist
start the application from validator class
call print all method()
// print all method does the following
declare validator object
copy all students information or arraylist from validator (loading)
declare and intialize two variables for year // after the first run one variable takes current value and the other takes the previous
declare and intialize two variables for semester // after the first run one variable takes current value and the other takes the previous
    FOR(index from zero to arraylist size)
        print name and student id from teh arraylist using current index (method call)
        put year of current index course in a variable
        put semester of current index course in a vairable
            IF(the two year variables are not same){
                print academic year and semester
                print table head for the course information (method call used)
            ELSE IF( the two year variable are equal)
                IF(the two semester variables are not equal) // that means the next course's semester changes
                    print current semester
                END IF
            ELSE
                print new line
            END IF
            assign the current year variable to the previous
            assign the current semester variable to the previous
            print current index course information in line
    END FOR LOOP
end

////////////////////////////////////////////TEST DATA - 1////////////////////////////
Welcome to the Transcript Application.

--------------Student Infor--------------
Enter Student First Name: James
Enter Student Last Name: Ronaldo
Enter Student ID: MC2525

--------------Student Address--------------
Enter Student Address, 
First Enter Street Name: 2050 Frederick
Address, Enter City: Gaithersburg
Address, Enter State: MD
Address, Enter Zip Code: 20205

--------------Course Information--------------
Enter Courses taken: Enter Course Number: Java1051
Enter Course Name: Introduction to Java
Enter Course Credit Hour: 4
Enter Course Grade: A
Enter Academic Year: 2015
Enter Semester: semmer
-----------

please type either of this?
(summer, fall, winter, spring
-----------
Enter Semester: wint
-----------

please type either of this?
(summer, fall, winter, spring
-----------
Enter Semester: fall

Do you have more courses to ADD? (y/n) n

Do you have more Students to ADD? (y/n) n

Student Name: Ayele Zola
Student ID: MC6325


-----------------------------------------------------------------------------------------------------------------------------
Academic Year: 1999,		Semester: Fall
-----------------------------------------------------------------------------------------------------------------------------
Course Number                        Course Name                            Credit hours           Grade       Quality Points
-----------                          -----------                            ------------           -----       --------------

Java1012                       Introduction to Java                               3                  A                4.0                        

-----------------------------------------------------------------------------------------------------------------------------
Academic Year: 2000,		Semester: Summer
-----------------------------------------------------------------------------------------------------------------------------
Course Number                        Course Name                            Credit hours           Grade       Quality Points
-----------                          -----------                            ------------           -----       --------------

DB2562                         Database                                           3                  B                3.0                        

-----------------------------------------------------------------------------------------------------------------------------
Academic Year: 2008,		Semester: Summer
-----------------------------------------------------------------------------------------------------------------------------
Course Number                        Course Name                            Credit hours           Grade       Quality Points
-----------                          -----------                            ------------           -----       --------------

Bstr111                        Boorstrap for JavaScript                           3                  B                3.0                        
Jenk888                        Jenkins                                            2                  A                4.0                        
Jenk333                        Jenkins2                                           2                  B                3.0                        

                         -------------------------------------Semester: Fall-------------------------------------

Jenk111                        Jenkins5                                           2                  D                1.0                        
Spring111                      Advance Spring boot                                3                  A                4.0                        
Dist2222                       Distributed Systems                                3                  B                3.0                        
Netw1111                       Networking                                         3                  C                2.0                        

                         -------------------------------------Semester: Winter-------------------------------------

Jenk222                        Jenkins4                                           2                  C                2.0                        
html222                        Advanced Front Web Page                            4                  A                4.0                        

                         -------------------------------------Semester: Spring-------------------------------------

HTML2252                       HTML                                               2                  A                4.0                        
Java222                        Java Core                                          3                  A                4.0                        
ACAD555                        AutoCad Advanced                                   3                  C                2.0                        

-----------------------------------------------------------------------------------------------------------------------------
Academic Year: 2010,		Semester: Spring
-----------------------------------------------------------------------------------------------------------------------------
Course Number                        Course Name                            Credit hours           Grade       Quality Points
-----------                          -----------                            ------------           -----       --------------

Pyth5263                       Python                                             3                  F                0.0                        

-----------------------------------------------------------------------------------------------------------------------------
Academic Year: 2011,		Semester: Spring
-----------------------------------------------------------------------------------------------------------------------------
Course Number                        Course Name                            Credit hours           Grade       Quality Points
-----------                          -----------                            ------------           -----       --------------

Mavn5632                       Maven                                              4                  D                1.0                        

-----------------------------------------------------------------------------------------------------------------------------
Academic Year: 2020,		Semester: Winter
-----------------------------------------------------------------------------------------------------------------------------
Course Number                        Course Name                            Credit hours           Grade       Quality Points
-----------                          -----------                            ------------           -----       --------------

Seln1012                       Selenium                                           2                  C                2.0                        

                                                         Student Total Credits: 47.0         CGPA:  2.70
*****************************************************************************************************************************

Student Name: John Smith
Student ID: MC5552


-----------------------------------------------------------------------------------------------------------------------------
Academic Year: 1990,		Semester: Summer
-----------------------------------------------------------------------------------------------------------------------------
Course Number                        Course Name                            Credit hours           Grade       Quality Points
-----------                          -----------                            ------------           -----       --------------

CSS2531                        Cascaded sheet                                     4                  B                3.0                        

-----------------------------------------------------------------------------------------------------------------------------
Academic Year: 1997,		Semester: Summer
-----------------------------------------------------------------------------------------------------------------------------
Course Number                        Course Name                            Credit hours           Grade       Quality Points
-----------                          -----------                            ------------           -----       --------------

Test325                        Software Testing                                   3                  F                0.0                        

-----------------------------------------------------------------------------------------------------------------------------
Academic Year: 1998,		Semester: Summer
-----------------------------------------------------------------------------------------------------------------------------
Course Number                        Course Name                            Credit hours           Grade       Quality Points
-----------                          -----------                            ------------           -----       --------------

Test325                        Software Testing                                   3                  C                2.0                        

-----------------------------------------------------------------------------------------------------------------------------
Academic Year: 2000,		Semester: Fall
-----------------------------------------------------------------------------------------------------------------------------
Course Number                        Course Name                            Credit hours           Grade       Quality Points
-----------                          -----------                            ------------           -----       --------------

Javs1111                       JavaScript                                         3                  A                4.0                        

                                                         Student Total Credits: 13.0         CGPA:  2.31
*****************************************************************************************************************************

Student Name: Adam Teferi
Student ID: MC5552


-----------------------------------------------------------------------------------------------------------------------------
Academic Year: 1990,		Semester: Summer
-----------------------------------------------------------------------------------------------------------------------------
Course Number                        Course Name                            Credit hours           Grade       Quality Points
-----------                          -----------                            ------------           -----       --------------

CSS2531                        Cascaded sheet                                     4                  B                3.0                        

-----------------------------------------------------------------------------------------------------------------------------
Academic Year: 2000,		Semester: Fall
-----------------------------------------------------------------------------------------------------------------------------
Course Number                        Course Name                            Credit hours           Grade       Quality Points
-----------                          -----------                            ------------           -----       --------------

Javs1111                       JavaScript                                         3                  A                4.0                        

-----------------------------------------------------------------------------------------------------------------------------
Academic Year: 2004,		Semester: Summer
-----------------------------------------------------------------------------------------------------------------------------
Course Number                        Course Name                            Credit hours           Grade       Quality Points
-----------                          -----------                            ------------           -----       --------------

Test2588                       Software Testing                                   3                  A                4.0                        

-----------------------------------------------------------------------------------------------------------------------------
Academic Year: 2008,		Semester: Winter
-----------------------------------------------------------------------------------------------------------------------------
Course Number                        Course Name                            Credit hours           Grade       Quality Points
-----------                          -----------                            ------------           -----       --------------

Web1520                        Web Design 1                                       4                  B                3.0                        
Web2220                        Web Design 2                                       4                  B                3.0                        

                                                         Student Total Credits: 18.0         CGPA:  3.33
*****************************************************************************************************************************

Student Name: James Ronaldo
Student ID: MC2525


-----------------------------------------------------------------------------------------------------------------------------
Academic Year: 2015,		Semester: fall
-----------------------------------------------------------------------------------------------------------------------------
Course Number                        Course Name                            Credit hours           Grade       Quality Points
-----------                          -----------                            ------------           -----       --------------

Java1051                       Introduction to Java                               4                  A                4.0                        

                                                         Student Total Credits: 4.0          CGPA:  4.00
*****************************************************************************************************************************
