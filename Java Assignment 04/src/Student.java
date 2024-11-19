import java.util.ArrayList;

public class Student extends Person {
    private String studentID;
    private String year;
    private Degree degree;
    private ArrayList<Course> coursesEnrolled = new ArrayList<>();

    public Student(String name, String studentID, String year, Degree degree, ArrayList coursesEnrolled){
        super(name);
        this.studentID = studentID;
        this.degree = degree;
        this.year = year;
        this.coursesEnrolled = coursesEnrolled;
    }

    @Override
    public String getName() {
        return super.getName();
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getYear(){
        return year;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public String getStudentID() {
        return studentID;
    }

    @Override
    public void displayInfo() {
        System.out.println("Student name: " + getName());
        System.out.println("Student ID: " + studentID);
        System.out.println("Year: " + year);
        System.out.println("Degree: " + degree.getName());
        listCoursesEnrolled();
    }

    public void registerDegree(Degree degree){
        this.degree = degree;
    }

    public void displayDegreeInfo(){
        degree.displayInfo();
    }

    public void enrollCourse(Course course) {
        coursesEnrolled.add(course);
    }

    public void unenrollCourse(Course course) {
        coursesEnrolled.remove(course);
    }

    public void listCoursesEnrolled(){
        System.out.print("Courses enrolled: ");
        for (Course course : this.coursesEnrolled){
            System.out.print(course.getName() + ", ");
        }
        System.out.println("\b\b");
    }
}
