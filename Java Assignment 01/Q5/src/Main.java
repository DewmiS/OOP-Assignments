import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the radius of outer circle (cm): ");
        double ro = scanner.nextDouble();
        System.out.print("Enter the radius of inner circle (cm): ");
        double ri = scanner.nextDouble();

        Circle innerCircle = new Circle(ri);
        Circle outerCircle = new Circle(ro);

        System.out.println("The area of the circular region is: " + (outerCircle.ComputeArea() - innerCircle.ComputeArea()) + "cm²");
        System.out.println("The circumference of the circular region is: " + (outerCircle.ComputeCircumference() + innerCircle.ComputeCircumference()) + "cm");
    }
}

class Circle {
    private double radius;
    public Circle(double radius) {
        this.radius = radius;
    }

    public double ComputeArea(){
        return Math.PI * Math.pow(radius,2);
    }

    public double ComputeCircumference(){
        return 2 * Math.PI * radius;
    }
}

