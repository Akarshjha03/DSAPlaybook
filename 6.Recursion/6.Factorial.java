import java.util.*;

public class Main {
    public static void main(String args[]) {
        int n = 23;  
        
        // Call the recursive function
        int result = Factorial(n);
        
        // Print the result
        System.out.println("Factorial of " + n + " is: " + result);
    }
    
    public static int Factorial(int n) {
        
        // Base case: factorial(0) = 1
        if (n == 0) return 1;
        
        // Recursive case (⚠️ wrong for factorial, this adds instead of multiplies)
        // Currently: returns n + Factorial(n - 1) → this computes SUM
        // Correct: should be n * Factorial(n - 1)
        return n + Factorial(n - 1);
    }
}
