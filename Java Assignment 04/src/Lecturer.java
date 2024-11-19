import java.util.ArrayList;

public class Lecturer extends Person{
    private String position;
    Department department;
    private ArrayList<Course> coursesTeaching = new ArrayList<>();

    Lecturer(String position, String name, Department department, ArrayList coursesTeaching){
        super(name);
        this.position = position;
        this.department = department;
        this.coursesTeaching = coursesTeaching;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public void displayDepartmentInfo(){
        System.out.println("Department: " + department.getName());
    }

    public void addCourse(Course course){
        coursesTeaching.add(course);
    }

    public void removeCourse(Course course){
        coursesTeaching.remove(course);
    }
    
    public void listCoursesTeaching(){
        for (Course course : coursesTeaching) {
            System.out.print(course.getName() + ", ");
        }
        System.out.println("\b\b");
    }

    @Override
    public void displayInfo() {
        System.out.println("Name: " + getName());
        System.out.println("Position: " + getPosition());
        displayDepartmentInfo();
        System.out.print("Courses Teaching: ");
        listCoursesTeaching();
    }

}
