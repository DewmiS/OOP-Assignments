import javax.swing.*;
import java.util.ArrayList;

public class Degree {
    private String name;
    private int numberOfStudents;
    private ArrayList<Course> coursesOffering = new ArrayList<>();

    public Degree (String name, int numberOfStudents, ArrayList coursesOffering){
        this.name = name;
        this.numberOfStudents = numberOfStudents;
        this.coursesOffering = coursesOffering;
    }

    public void displayInfo(){
        System.out.println("Degree name: " + name);
        System.out.println("Number of students enrolled: " + numberOfStudents);
        listCoursesOffering();
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setNumberOfStudents(int numberOfStudents) {
        this.numberOfStudents = numberOfStudents;
    }

    public int getNumberOfStudents() {
        return numberOfStudents;
    }

    public void offerCourse(Course course){
        coursesOffering.add(course);
    }

    public void withdrawCourse(Course course){
        coursesOffering.remove(course);
    }

    public void listCoursesOffering(){
        System.out.print("Courses offering: ");
        for(Course course : coursesOffering){
            System.out.print(course.getName() + ", ");
        }
        System.out.println("\b\b");
    }
}
