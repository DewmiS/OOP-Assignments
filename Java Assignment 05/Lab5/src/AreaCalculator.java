public class AreaCalculator {
    public static double calculateRectangleArea(double length, double width){
        return (length * width);
    }

    public static double calculateSquareArea(double sideLength){
        return (sideLength * sideLength);
    }

    public static void main(String[] args) {
        double rectangleLength = 5;
        double rectangleWidth = 8;
        double squareSideLength = 4;

        System.out.println("Area of the rectangle: " + calculateRectangleArea(rectangleLength, rectangleWidth));
        System.out.println("Area of the square: " + calculateSquareArea(squareSideLength));
    }
}
