//Design a Course class.
//• Instance variables: courseName, enrolledStudents.
//• Static variable: maxCapacity, the maximum number of students for any
//course.
//• Instance methods: enrollStudent(String studentName),
//unenrollStudent(String studentName).
//• Static method: setMaxCapacity(int capacity), to set the maximum
//capacity for courses.
package course;

import java.util.Objects;

public class CourseDetails {
    static int maxCapacity = 100;
    String courseName;
    String[] enrolledStudents = new String[maxCapacity];
    int enrollments;

    public CourseDetails(String courseName) {
        this.courseName = courseName;
        this.enrollments = 0;
    }

    void setMaxCapacity(int maxCapacity){
        CourseDetails.maxCapacity = maxCapacity;
    }
    void enrollStudent(String studentName){
        enrolledStudents[enrollments] = studentName;
        enrollments++;
        System.out.println("The student is enrolled.");
    }
    void unenrollStudent( String studentName){
        String[] enrolledStudents1 = new String[enrolledStudents.length - 1];
        int i = 0 , j = 0;
        while(i < enrollments){
            if(!Objects.equals(enrolledStudents[i], studentName)){
                enrolledStudents1[j] = enrolledStudents[i];
            }
            i++;
            j++;
        }
        enrolledStudents = enrolledStudents1;
        enrollments--;
        System.out.println("student removed.");
    }

    public static void main(String[] args) {
        CourseDetails Btech = new CourseDetails("B.Tech");
        CourseDetails MBA = new CourseDetails("MBA");
        Btech.setMaxCapacity(60);
        MBA.setMaxCapacity(50);
        Btech.enrollStudent("Amit Kumar");
        Btech.enrollStudent("Rishi Raj");
        MBA.enrollStudent("Sonu Ji");
        MBA.enrollStudent("Harsh");
        MBA.unenrollStudent("Sonu Ji");
        MBA.unenrollStudent("Harsh");
    }
}
