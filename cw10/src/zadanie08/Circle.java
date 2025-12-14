package zadanie08;

public class Circle {
    
    private double radius;
    
    public Circle(double radius) {
        this.radius = radius;
    }
    
    public Circle(Square square) {
        this.radius = Math.sqrt(square.getArea() / Math.PI);
    }
    
    public static Square[] getSquares(Circle[] arr) {
        Square[] squareArr = new Square[arr.length];
        for (int i = 0; i < arr.length; i++) {
            squareArr[i] = new Square(arr[i]);
        }
        return squareArr;
    }
    
    public double getRadius() {
        return radius;
    }
    
    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }
    
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }
    
    public Square getInscribedSquare() {
        return new Square(this.getRadius() * 2 / Math.sqrt(2));
    }
    
    public Square getCircumscribedSquare() {
        return new Square(this.getRadius() * 2);
    }
    
    @Override
    public String toString() {
        return "Circle[" + String.format("%.2f", this.getRadius()) + "]";
    }
    
}
