package zadanie01;

public class Square {
    
    private double side;
    
    public Square(double side) {
        this.side = side;
    }
    
    public Square() {
        this(1);
    }
    
    public static double getTotalArea(Square[] sqs) {
        double sumOfSqsAreas = 0;
        for (Square s : sqs) {
            sumOfSqsAreas += s.getArea();
        }
        return sumOfSqsAreas;
    }
    
    public static Square getMax(Square[] sqs) {
        int maxSquareIndex = 0;
        for (int i = 1; i < sqs.length; i++) {
            if (sqs[i].getSide() > sqs[maxSquareIndex].getSide())
                maxSquareIndex = i;
        }
        return sqs[maxSquareIndex];
    }
    
    public double getSide() {
        return side;
    }
    
    public double getArea() {
        return Math.pow(side, 2);
    }
    
    public double getDiagonal() {
        return side * Math.sqrt(2);
    }
    
    public double getPerimeter() {
        return side * 4;
    }
    
    public Square getDoubled() {
        return new Square(side * 2);
    }
    
    @Override
    public String toString() {
        return "Square[" + side + "]";
    }
}
