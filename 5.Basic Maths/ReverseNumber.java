import java.util.*;

public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Enter the elements: ");
        
        int rev = 0; // this will store the reversed number
        
        while( n != 0){
            int digit = n % 10; // extract the last digit of n
            rev = rev * 10 + digit; // shift rev left by one place and add the digit
            n /= 10; // remove the last digit from n
        }
        System.out.println("Reversed Numbers are: " + rev);
    }
}

//------------------------------------------------------------WORKING--------------------------------------------------------------------

/*🔹 Step 1: int digit = n % 10;

% 10 gives the remainder when dividing by 10, which is always the last digit of the number.

Example:

If n = 1234,
digit = 1234 % 10 = 4.

So, we’ve extracted the last digit.

🔹 Step 2: rev = rev * 10 + digit;

We take the current reversed number and shift it left by one place (rev * 10) and then add the extracted digit.

This builds the reversed number step by step.

Example run:

Start with rev = 0.

First digit (4): rev = 0 * 10 + 4 = 4.

Next digit (3): rev = 4 * 10 + 3 = 43.

Next digit (2): rev = 43 * 10 + 2 = 432.

Next digit (1): rev = 432 * 10 + 1 = 4321.

Now rev holds the reversed number.

🔹 Step 3: n /= 10;

/= 10 means integer division by 10, which removes the last digit.

Example:

If n = 1234,
after n /= 10 → n = 123.

So, we discard the digit we just processed and move on.

🔁 Looping Process

This repeats until n becomes 0. By then, rev will contain the reversed number.

✅ Example Walkthrough for n = 1234:

rev = 0
n = 1234 → digit = 4 → rev = 0*10+4 = 4 → n = 123
n = 123  → digit = 3 → rev = 4*10+3 = 43 → n = 12
n = 12   → digit = 2 → rev = 43*10+2 = 432 → n = 1
n = 1    → digit = 1 → rev = 432*10+1 = 4321 → n = 0


Final reversed number = 4321 ✅ */
