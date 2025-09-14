import java.util.*;

public class Main{
    public static void main(String args[]){
        System.out.println("Enter the number: ");
        Scanner sc = new Scanner (System.in);
        
        int original = n;
        int sum = 0;
        
        int digits = String.valueOf(n).length(); //Count the digits
        
        while (n != 0){
            int digit = n % 10;                 // extract last digit
            sum += Math.pow(digit, digits);    // raise digit to power of total digits
            n /= 10;                           // remove last digit
        }
        
        if( original == sum){
            System.out.println("This is a Armstrong number");
        }
        else{
            System.out.println("This is not an Armstrong number");
        }
    }
}

/*
Find number of digits
Example: for 153, digits = 3.

String.valueOf(num).length()


Loop through each digit

num % 10 extracts the last digit.

num /= 10 removes the last digit.

Example with 153:

First loop: digit = 3

Second loop: digit = 5

Third loop: digit = 1

Raise digit to power of total digits
Each digit is raised to the power of digits using Math.pow(digit, digits).

For 153 → 
1^3, 5^3, 3^3

Sum up the powered digits
Add all these values into sum.

Compare sum with original
If sum == original, then the number is Armstrong.
Otherwise, it is not.

🔹 Example Walkthrough (153)

original = 153, digits = 3

Loop:

digit = 3 → sum = 3^3 = 27

digit = 5 → sum = 27 + 125 = 152

digit = 1 → sum = 152 + 1 = 153
152+1=153

Now sum == original → Armstrong ✅

👉 So the essence is:
We decompose the number digit by digit, raise each digit to the power of the total number of digits, add them up, and check if we get back the same number.
*/
