package zadanie9;

import java.util.Arrays;

public class Main {
    static void main() {
        double[][] a = new double[4][8];
        fillArr(a);
        System.out.println("a: ");
        showArr(a);
        System.out.println("isRectangular: " + isRectangular(a));
        System.out.println("isSquare: " + isSquare(a));
        System.out.println("isSymmetric: " + isSymmetric(a));
        System.out.println();
        
        double[][] b = new double[5][5];
        fillArr(b);
        System.out.println("b: ");
        showArr(b);
        System.out.println("isRectangular: " + isRectangular(b));
        System.out.println("isSquare: " + isSquare(b));
        System.out.println("isSymmetric: " + isSymmetric(b));
        System.out.println();
        
        double[][] c = new double[4][];
        for (int i = 0; i < c.length; i++)
            c[i] = new double[(int) (Math.random() * (6 - 2 + 1) + 2)];
        fillArr(c);
        System.out.println("c: ");
        showArr(c);
        System.out.println("isRectangular: " + isRectangular(c));
        System.out.println("isSquare: " + isSquare(c));
        System.out.println("isSymmetric: " + isSymmetric(c));
        System.out.println();
        
        double[][] d = {
            {3, 1, 1, 3},
            {1, 3, 3, 1},
            {1, 3, 3, 1},
            {3, 1, 1, 3}
        };
        System.out.println("d: ");
        showArr(d);
        System.out.println("isRectangular: " + isRectangular(d));
        System.out.println("isSquare: " + isSquare(d));
        System.out.println("isSymmetric: " + isSymmetric(d));
        
        double[][] e = new double[2][4];
        fillArr(e);
        double[][] f = new double[2][4];
        fillArr(f);
        System.out.println("e: ");
        showArr(e);
        System.out.println("f: ");
        showArr(f);
        System.out.println("isSameShape(e, f): " + isSameShape(e, f));
        System.out.println();
        
        double[][] g = new double[2][4];
        fillArr(g);
        double[][] h = new double[2][];
        for (int i = 0; i < g.length; i++)
            h[i] = Arrays.copyOf(g[i], g[i].length);
        System.out.println("g: ");
        showArr(g);
        System.out.println("h: ");
        showArr(h);
        System.out.println("isSame(g, h): " + isSame(g, h));
    }
    
    public static void fillArr(double[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = Math.random() * 10 + 1;
            }
        }
    }
    
    public static void showArr(double[][] arr) {
        for (double[] row : arr)
            System.out.println(Arrays.toString(row));
    }
    
    public static boolean isRectangular(double[][] arr) {
        int firstRowLength = arr[0].length;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i].length != firstRowLength)
                return false;
        }
        return true;
    }
    
    public static boolean isSquare(double[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length != arr.length)
                return false;
        }
        return true;
    }
    
    public static boolean isSymmetric(double[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] != arr[j][i])
                    return false;
            }
        }
        return true;
    }
    
    public static boolean isSameShape(double[][] arrA, double[][] arrB) {
        if (arrA.length == arrB.length) {
            for (int i = 0; i < arrA.length; i++) {
                if (arrA[i].length != arrB[i].length)
                    return false;
            }
        } else {
            return false;
        }
        return true;
    }
    
    public static boolean isSame(double[][] arrA, double[][] arrB) {
        if (isSameShape(arrA, arrB)) {
            for (int i = 0; i < arrA.length; i++) {
                for (int j = 0; j < arrA[i].length; j++) {
                    if (arrA[i][j] != arrB[i][j])
                        return false;
                }
            }
        } else {
            return false;
        }
        return true;
    }
}
