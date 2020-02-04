/* Written by PorPisith on 4 Feb 2020 */

public class Main {
    public static void main(String[] args) {
        Faculty f1 = new Faculty("Computer Engineering"); // Create Faculty
        Course c1 = new Course("Object Oriented Programming"); // Create course
        Course c2 = new Course("Computer Programming"); // Create course
        Student s1 = new Student("Daniel"); // Create Student
        Student s2 = new Student("James"); // Create Student
        
        c1.setFaculty(f1); // Set faculty for course c1
        c2.setFaculty(f1); // Set faculty for course c2
        
        c1.addStudent(s1); // Add student s1 to the course c1
        c1.addStudent(s2); // Add student s2 to the course c1
        
        System.out.println(c1.getStudents()); // Name of student in course c1
        System.out.println(c2.getStudents()); // Name of student in course c2
        
        c1.dropStudent(s1);
        System.out.println(c1.getStudents()); // Name of student in course c1
        
        System.out.println(c1.getFaculty()); // Get faculty of course c1
        System.out.println(c2.getFaculty()); // Get faculty of course c2
        
        System.out.println(f1.getCourses()); // Get course in faculty f1

        c2.addStudent(s2); // Add student s2 to the course c2
        
        System.out.println(s1.getCourses()); // Get all courses of student s1
        System.out.println(s2.getCourses()); // Get all courses of student s2
    }
}
