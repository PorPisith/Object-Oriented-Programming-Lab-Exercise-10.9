/* Written by PorPisith on 4 Feb 2020 */

public class Faculty {
    private String facultyName; // Store faculty name
    private Course[] courseList = new Course[10]; // Store list of course in this faculty
    private int numberOfCourse; // Store number of course in this faculty
    
    // Default Constructor
    public Faculty() {
        
    }
    
    // Constructor with argument
    public Faculty(String facultyName) {
        this.facultyName = facultyName;
    }
    
    // Add course to the faculty
    public void addCourse(Course course) {
        this.courseList[numberOfCourse] = course;
        numberOfCourse++;
    }

    // Getter for facultyName
    public String getFacultyName() {
        return facultyName;
    }

    // Setter for facultyName
    public void setFacultyName(String facultyName) {
        this.facultyName = facultyName;
    }
    
    // Get all courses in this faculty
    public String getCourses() {
        String s = this.facultyName + " : ";
        for(int i = 0; i < numberOfCourse; i++) {
            // The last course, display without comma
            if(i == numberOfCourse - 1) {
                s += this.courseList[i].getCourseName();
            }
            // Display course seperate by comma
            else {
                s += this.courseList[i].getCourseName() + ", ";
            }
        }
        return s;
    }
}
