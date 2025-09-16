import java.util.*;

public class Main {
    public static void main(String args[]) {
        
        int n = 5;
        
        // Call recursive function and print result
        int result = sum(n);
        System.out.println("Sum of first " + n + " numbers = " + result);
    }
    
    public static int sum(int n) {
        
        // Base case: sum of first 0 numbers = 0
        if (n == 0) return 0;
        
        // Recursive case:
        // Sum of first n = n + sum of first (n-1)
        return n + sum(n - 1);
    }
}
