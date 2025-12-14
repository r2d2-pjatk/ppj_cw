package zadanie08;

public class Square {
    
    private double side;
    
    public Square(double side) {
        this.side = side;
    }
    
    public Square(Circle circle) {
        this.side = Math.sqrt(circle.getArea());
    }
    
    public static Circle[] getCircles(Square[] arr) {
        Circle[] circleArr = new Circle[arr.length];
        for (int i = 0; i < arr.length; i++) {
            circleArr[i] = new Circle(arr[i]);
        }
        return circleArr;
    }
    
    public double getSide() {
        return side;
    }
    
    public double getArea() {
        return Math.pow(side, 2);
    }
    
    public double getPerimeter() {
        return side * 4;
    }
    
    public Circle getInscribedCircle() {
        return new Circle(this.getSide() / 2);
    }
    
    public Circle getCircumscribedCircle() {
        return new Circle(this.getSide() * Math.sqrt(2) / 2);
    }
    
    @Override
    public String toString() {
        return "Square[" + String.format("%.2f", this.getSide()) + "]";
    }
}
