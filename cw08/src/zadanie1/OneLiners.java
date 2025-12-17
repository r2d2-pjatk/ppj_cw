package zadanie1;

public class OneLiners {
    
    static void main(String[] args) {
        double a = 2, b = 3, c = 1;
        System.out.println("(a, b, c,)=(" + a + ", " +
                b + ", " + c + "): hasTwoRoots? " +
                hasTwoRoots(a,b,c));
        
        a = 0; b = 2; c = 1;
        System.out.println("(a, b, c,)=(" + a + ", " +
                b + ", " + c + "): hasTwoRoots? " +
                hasTwoRoots(a,b,c));
        
        a = 2; b = 1; c = -1;
        System.out.println("(a, b, c,)=(" + a + ", " +
                b + ", " + c + "): monot? " +
                monot(a,b,c));
        
        a = 2; b = 1; c = 2;
        System.out.println("(a, b, c,)=(" + a + ", " +
                b + ", " + c + "): monot? " +
                monot(a,b,c));
        
        a = 2; b = 1; c = 2;
        System.out.println("(a, b, c,)=(" + a + ", " +
                b + ", " + c + "): maxEl = " +
                maxEl(a,b,c));
        
        a = 2; b = 2; c = 4;
        System.out.println("(a, b, c,)=(" + a + ", " +
                b + ", " + c + "): maxEl = " +
                maxEl(a,b,c));
        
        a = -2; b = 1; c = -3;
        System.out.println("(a, b, c,)=(" + a + ", " +
                b + ", " + c + "): numPos = " +
                numPos(a,b,c));
        
        a = -2; b = 1; c = 3;
        System.out.println("(a, b, c,)=(" + a + ", " +
                b + ", " + c + "): numPos = " +
                numPos(a,b,c));
    }
    
    public static boolean hasTwoRoots(double a, double b, double c) {
        // warunki: a != 0, delta > 0
        return (a != 0) && ((b * b - 4 * a * c) > 0);
    }
    
    public static boolean monot(double a, double b, double c) {
        return (b > a && c > b) || (a > b & b > c);
    }
    
    public static double maxEl(double a, double b, double c) {
        return (a > b && a > c) ? a : ((b > a && b > c) ? b : c);
    }
    
    public static int numPos(double a, double b, double c) {
        return (a > 0 ? 1 : 0) + (b > 0 ? 1 : 0) + (c > 0 ? 1 : 0);
    }
    
}
