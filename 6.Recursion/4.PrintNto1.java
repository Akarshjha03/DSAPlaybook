import java.util.*;

public class Main {
    public static void main(String args[]) {
        
        // Call the recursive function with n = 5
        // This will print numbers from 5 → 1
        Nums(5);
    }
    
    public static void Nums(int n) {
        
        // Base case: stop recursion when n reaches 0
        if (n == 0) return;
        
        // Print the current number first
        // (this makes the output descending)
        System.out.println(n);
        
        // Recursive call with smaller value (n - 1)
        // Keeps going until it hits the base case
        Nums(n - 1);
    }
}
