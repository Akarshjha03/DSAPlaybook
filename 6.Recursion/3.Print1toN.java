import java.util.*;

public class Main {
    public static void main(String args[]) {
        
        // Call the recursive function with n = 5
        // This will print numbers from 1 → 5
        Nums(5);
    }
    
    public static void Nums(int n) {
        
        // Base case: when n becomes 0, stop recursion
        if (n == 0) return;
        
        // Recursive call with smaller value (n - 1)
        // This ensures recursion goes down to 1 first
        Nums(n - 1);
        
        // Print the number after the recursive call
        // So numbers are printed in ascending order
        System.out.println(n);
    }
}
