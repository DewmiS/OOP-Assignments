public class GeometryCalculator {
    public static void main(String[] args) {
        MathOperations operations = new MathOperations();
        System.out.println("PI = " + operations.getPi());
        System.out.println("Area of the circle: " + operations.calculateCircleArea(5));
        System.out.println("Area of the square: " + operations.calculateSquareArea(4));
    }
}
