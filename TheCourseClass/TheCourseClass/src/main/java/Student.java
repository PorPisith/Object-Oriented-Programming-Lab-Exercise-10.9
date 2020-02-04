/* Written by PorPisith on 4 Feb 2020 */

public class Student {
    private String studenName; // Store name of student
    private Course[] courseList = new Course[3]; // Store course list that student registered
    private int numberOfCourse; // Store number of course of this student
    
    // Default constructor
    public Student() {
        
    }
    
    // Constructor with argument
    public Student(String studenName) {
        this.studenName = studenName;
    }
    
    // Add course method
    public void addCourse(Course course) {
        this.courseList[numberOfCourse] = course;
        numberOfCourse++;
    }

    // Getter for courseName
    public String getName() {
        return studenName;
    }

    // Setter for courseName
    public void setName(String studenName) {
        this.studenName = studenName;
    }
    
    // Get all courses of this student
    public String getCourses() {
        String s = this.studenName + " : ";
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
    
    public void dropCourse(Course course) {
        for(int i = 0; i < numberOfCourse; i++) {
            if(courseList[i].equals(course)) { // if same object
                courseList[i] = courseList[numberOfCourse-1]; // Swap courseList[i] with value of last index
                courseList[numberOfCourse-1] = null; // Set last index to null
                numberOfCourse--; // Decrease number of course
            }
        }
    }
}
