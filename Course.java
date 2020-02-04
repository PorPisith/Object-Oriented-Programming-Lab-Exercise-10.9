/* Written by PorPisith on 4 Feb 2020 */

public class Course {
    private String courseName; // Store course name
    private int numberOfStudents; // Store number of student in the course
    private Student[] studentList = new Student[100]; // Store name of student in the course
    private Faculty faculty; // Store faculty of this course
    
    // Default Constructor
    public Course() {
        
    }
    
    // Constructor with argument
    public Course(String courseName) {
        this.courseName = courseName;
    }
    
    // Add student method
    public void addStudent(Student student) {
        this.studentList[numberOfStudents] = student;
        this.numberOfStudents++;
        student.addCourse(this); // send this object (Course) to student class
    }
    
    // Get faculty
    public String getFaculty() {
        return "Faculty of " + this.courseName + " : " + faculty.getFacultyName();
    }
    
    // Set faculty
    public void setFaculty(Faculty faculty) {
        this.faculty = faculty;
        faculty.addCourse(this);
    }

    // Getter for courseName
    public String getCourseName() {
        return courseName;
    }

    // Setter for courseName
    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    // Get all names in this course
    public String getStudents() {
        String s = this.courseName + " : ";
        for(int i = 0; i < numberOfStudents; i++) {
            // The last name, display without comma
            if(i == numberOfStudents - 1) {
                s += this.studentList[i].getName();
            }
            // Display name of student seperate by comma
            else {
                s += this.studentList[i].getName() + ", ";
            }
        }
        return s;
    }
    
    // Drop student method
    public void dropStudent(Student student) {
        for(int i = 0; i < numberOfStudents; i++) {
            if(studentList[i].equals(student)) { // if same object
                studentList[i] = studentList[numberOfStudents-1]; // Swap studentList[i] with value of last index
                studentList[numberOfStudents-1] = null; // Set last index to null
                numberOfStudents--; // Decrease number of student
            }
        }
    }
}
