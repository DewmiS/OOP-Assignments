public class MathOperations {
    private static double pi = 3.14159;

    public double getPi() {
        return pi;
    }

    public static double calculateCircleArea(double radius){
        return pi * radius * radius;
    }

    public static double calculateSquareArea(double sideLength){
        return sideLength * sideLength;
    }
}
