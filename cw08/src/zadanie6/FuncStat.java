package zadanie6;

import java.util.Arrays;

public class FuncStat {
    
    public static void main (String[] args) {
        System.out.println("Wait...");
        System.out.println(FuncStat.fiboR(45));
        System.out.println(FuncStat.fiboI(45));
        
        System.out.println(FuncStat.factR(12));
        System.out.println(FuncStat.factI(12));
        
        System.out.println(FuncStat.gcdR(12125,40643));
        System.out.println(FuncStat.gcdI(12125,40643));
        
        int[] a = {3, 8, 2, 9, 7, 4};
        
        System.out.println("Max     : " + FuncStat.maxElem(a,0));
        
        System.out.println("Num even: " + FuncStat.numEven(a,0));
        
        System.out.println("Before:   " + Arrays.toString(a));
        FuncStat.reverse(a,0);
        System.out.println("After :   " + Arrays.toString(a));
        
        System.out.println("Is 'radar' a palindrom? " +
                FuncStat.isPalindrom("radar"));
        System.out.println("Is 'abba' a palindrom?  " +
                FuncStat.isPalindrom("abba"));
        System.out.println("Is 'rover' a palindrom? " +
                FuncStat.isPalindrom("rover"));
    }
    
    public static int fiboR(int n) {
        if (n == 0 || n == 1) {
            return n;
        } else {
            return fiboR(n - 1) + fiboR(n - 2);
        }
    }
    
    public static int fiboI(int n) {
        int[] fibArr = new int[n + 1];
        
        for (int i = 0; i <= n; i++) {
            if (i == 0 || i == 1)
                fibArr[i] = i;
            else
                fibArr[i] = fibArr[i - 1] + fibArr[i - 2];
        }
        
        return fibArr[n];
    }
    
    public static int factR(int n) {
        if (n == 1 || n == 0)
            return 1;
        else
            return n * factR(n - 1);
    }
    
    public static int factI(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        
        return result;
    }
    
    public static int gcdR(int a, int b) {
        if (a % b == 0) {
            return b;
        } else {
            return gcdR(b, a % b);
        }
    }
    
    public static int gcdI(int a, int b) {
        while (a % b != 0) {
            int r = a % b;
            
            a = b;
            b = r;
        }
        
        return b;
    }
    
    public static int maxElem(int[] arr, int from) {
        if (from >= arr.length) {
            return 0;
        } else {
            return Math.max(arr[from], maxElem(arr, from + 1));
            // alternatywna instrukcja return (bez metody Math.max)
            // return arr[from] > maxElem(arr, from + 1) ? arr[from] : maxElem(arr, from + 1);
        }
    }
    
    public static int numEven(int[] arr, int from) {
        if (from >= arr.length)
            return 0;
        else
            return (arr[from] % 2 == 0 ? 1 : 0) + numEven(arr, from + 1);
    }
    
    public static void reverse(int[] arr, int from) {
        if (from < 0 || from > (arr.length - 1 - from)) {
            return;
        } else {
            reverse(arr, from + 1);
            int temp = arr[from];
            arr[from] = arr[arr.length - 1 - from];
            arr[arr.length - 1 - from] = temp;
        }
    }
    
    public static boolean isPalindrom(String s) {
        if (s.length() <= 1)
            return true;
        
        if (s.charAt(0) != s.charAt(s.length() - 1))
            return false;
        
        s = s.substring(1, s.length() - 1);
        
        return isPalindrom(s);
    }
    
}
