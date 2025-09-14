import java.util.*;

public class Main{
    public static void main(String args[]){
        int a = 64;
        int b = 56;
        System.out.println("The HCF of " + a + " & " + b + " is: " + HCF(64, 56));
    }
    
    public static int HCF(int a, int b){
        while(b != 0){
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}

/*
Theorem: gcd(a, b) = gcd(b, a % b)

🔹 Step by Step Flow

Suppose a = 56, b = 98.

Before loop:
a = 56, b = 98

Iteration 1:

temp = b = 98 (store previous b)

b = a % b = 56 % 98 = 56

a = temp = 98

Now → a = 98, b = 56

Iteration 2:

temp = 56

b = 98 % 56 = 42

a = 56

Now → a = 56, b = 42

Iteration 3:

temp = 42

b = 56 % 42 = 14

a = 42

Now → a = 42, b = 14

Iteration 4:

temp = 14

b = 42 % 14 = 0

a = 14

Now → a = 14, b = 0

🔹 Exit Condition

When b = 0, the loop stops, and the current a is the HCF (here 14).

✅ So to answer your question:

a takes the previous value of b (temp).

b takes the new remainder (a % b).

That’s why we need temp — to preserve the old b before it gets overwritten.
*/
