import java.util.ArrayList;

public class UniversityManagementSystem{
    public static void main(String[] args) {

          ArrayList<Course> coursesOfferingSE = new ArrayList<>();
          ArrayList<Course> coursesOfferingIT = new ArrayList<>();
          ArrayList<Lecturer> lecturersBelongsToSE = new ArrayList<>();
          ArrayList<Lecturer> lecturersBelongsToIT = new ArrayList<>();

          Department softwareEngineering = new Department("Software Engineering", null, coursesOfferingSE, lecturersBelongsToSE);
          Department informationTechnology = new Department("Information Technology", null, coursesOfferingIT, lecturersBelongsToIT);


          ArrayList<Course> csCourses = new ArrayList<>();
          ArrayList<Course> ctCourses = new ArrayList<>();
          Degree computerScience = new Degree("Computer Science", 100, csCourses);
          Degree computerTechnology = new Degree("Computer Technology", 75, ctCourses);


          Course oop = new Course("Object Oriented Programming", "Mandatory", 150, null, computerScience);
          Course statistics = new Course("Statistics", "Optional", 100, null, computerScience);
          Course mathematics = new Course("Mathematics for CT", "Optional", 100, null, computerTechnology);

          Lecturer oopLIC = new Lecturer("Lecturer in charge", "MR. Jack", softwareEngineering, new ArrayList<>());
          Lecturer mathLIC = new Lecturer("Lecture in charge", "MR. Smith", informationTechnology, new ArrayList<>());

          ArrayList<Course> enrolledCourses = new ArrayList<>();
          enrolledCourses.add(oop);
          enrolledCourses.add(statistics);
          enrolledCourses.add(mathematics);
          Student s001 = new Student("Anne Sera", "S001", "2021", computerScience, enrolledCourses);
          Student s002 = new Student("Oliver Peter", "S002", "2021", computerScience, enrolledCourses);

          csCourses.add(oop);
          csCourses.add(statistics);
          ctCourses.add(mathematics);

          computerScience.offerCourse(oop);
          computerScience.offerCourse(statistics);
          computerTechnology.offerCourse(mathematics);

          softwareEngineering.offerCourse(mathematics);
          informationTechnology.offerCourse(oop);

          softwareEngineering.appointDepartmentHead(oopLIC);
          informationTechnology.appointDepartmentHead(mathLIC);

          oopLIC.addCourse(oop);
          oopLIC.addCourse(mathematics);
          oopLIC.setPosition("Department Head");
          oopLIC.toString();

          mathLIC.addCourse(mathematics);
          mathLIC.addCourse(statistics);
          mathLIC.setPosition("Lecturer in charge");
          mathLIC.toString();

          System.out.println("=========================================");
          System.out.println("Lecturers Information");
          System.out.println("=========================================");
          oopLIC.displayInfo();
          System.out.println(" ");
          mathLIC.displayInfo();

          System.out.println(" ");System.out.println(" ");
          System.out.println("=========================================");
          System.out.println("Students Information");
          System.out.println("=========================================");
          s001.displayInfo();
          System.out.println(" ");
          s002.displayInfo();

          System.out.println(" ");System.out.println(" ");
          System.out.println("=========================================");
          System.out.println("Departments Information");
          System.out.println("=========================================");
          softwareEngineering.addLecturer(oopLIC);
          softwareEngineering.addLecturer(mathLIC);
          softwareEngineering.displayInfo();
          softwareEngineering.offerCourse(oop);
          System.out.println(" ");
          informationTechnology.addLecturer(oopLIC);
          informationTechnology.addLecturer(mathLIC);
          informationTechnology.offerCourse(statistics);
          informationTechnology.displayInfo();

          System.out.println(" ");System.out.println(" ");
          System.out.println("=========================================");
          System.out.println("Courses Information");
          System.out.println("=========================================");
          oop.addLecturerInCharge(oopLIC);
          oop.displayInfo();System.out.println(" ");
          statistics.addLecturerInCharge(new Lecturer("Lecture In Charge", "Mrs. Rose", softwareEngineering, new ArrayList<>()));
          statistics.displayInfo();System.out.println(" ");
          mathematics.addLecturerInCharge(mathLIC);
          mathematics.displayInfo();System.out.println(" ");

          System.out.println(" ");
          System.out.println("=========================================");
          System.out.println("Degree Information");
          System.out.println("=========================================");
          computerScience.displayInfo();
          System.out.println(" ");
          computerTechnology.displayInfo();
    }
}
