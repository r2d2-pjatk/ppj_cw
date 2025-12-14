package zadanie06;

public class Rect {
    
    private final Point ul, br;
    
    public Rect(Point ul, Point br) {
        this.ul = ul;
        this.br = br;
    }
    
    public static Rect getRect(Point ul, int x, int y) {
        return new Rect(ul, new Point(x, y));
    }
    
    public static Rect getContainingRect(Point[] pts) {
        Point firstPoint = pts[0];
        int minX = firstPoint.x;
        int maxX = firstPoint.x;
        int minY = firstPoint.y;
        int maxY = firstPoint.y;
        
        for (Point pt : pts) {
            if (pt.x < minX) {
                minX = pt.x;
            }
            
            if (pt.y < minY) {
                minY = pt.y;
            }
            
            if (pt.x > maxX) {
                maxX = pt.x;
            }
            
            if (pt.y > maxY) {
                maxY = pt.y;
            }
        }
        
        return Rect.getRect(Point.getPoint(minX, maxY), maxX, minY);
    }
    
    public void showInfo() {
        System.out.print("UL=(" + ul.x + ", " + ul.y + ") ");
        System.out.print("BR=(" + br.x + ", " + br.y + ")\n");
    }
    
}
