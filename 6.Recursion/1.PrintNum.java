import java.util.*;

public class Main {
    public static void main(String args[]) {
        
        // Call the recursive function to print '7' five times
        PrintNum(5, 7);
    }
    
    // Recursive function to print a given number 'n' times
    public static void PrintNum(int n, int num) {
        
        // Base Case: if n becomes 0, stop recursion
        if (n == 0) return;
        
        // Work: print the number once
        System.out.println(num);
        
        // Recursive Case: call the same function 
        // but with a smaller problem (n-1)
        PrintNum(n - 1, num);
    }
}
