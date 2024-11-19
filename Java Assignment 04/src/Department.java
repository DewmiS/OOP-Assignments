import java.util.ArrayList;

public class Department {
    private String name;
    Lecturer departmentHead;
    private ArrayList<Course>  coursesOffering = new ArrayList<>();
    private ArrayList<Lecturer> lecturersBelongsTo = new ArrayList<>();

    public Department(String name, Lecturer departmentHead, ArrayList coursesOffering, ArrayList lecturersBelongsTo){
        this.name = name;
        this.departmentHead = departmentHead;
        this.coursesOffering = coursesOffering;
        this.lecturersBelongsTo = lecturersBelongsTo;
    }

    public void displayInfo(){
        System.out.println("Department name: " + name);
        System.out.println("Department head: " + departmentHead.getName());
        listOfCourses();
        listOfLecturers();
    }

    public void listOfCourses(){
        System.out.print("Courses Offering: ");
        for (Course course : coursesOffering){
            System.out.print(course.getName() + ", ");
        }
        System.out.println("\b\b");
    }

    public void listOfLecturers(){
        System.out.print("Lecturers belongs to: ");
        for (Lecturer lecturer : lecturersBelongsTo){
            System.out.print(lecturer.getName() + ", ");
        }
        System.out.println("\b\b");
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void appointDepartmentHead(Lecturer head){
        this.departmentHead = head;
    }

    public void displayDepartmentHeadInfo(Lecturer departmentHead){
        departmentHead.displayInfo();
    }

    public void offerCourse(Course course){
        coursesOffering.add(course);
    }

    public void withdrawCourse(Course course){
        coursesOffering.remove(course);
    }

    public void addLecturer(Lecturer lecturer){
        lecturersBelongsTo.add(lecturer);
    }

    public void removeLecturer(Lecturer lecturer){
        lecturersBelongsTo.remove(lecturer);
    }
}
