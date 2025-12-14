package zadanie06;

public class Point {
    
    final int x, y;
    
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
    
    public static Point getPoint(int x, int y) {
        return new Point(x, y);
    }
    
}
