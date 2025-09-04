import java.util.*;

public class Main{
    public static void main(String args[]){
        int n = 345;
        int temp = n;
        int rev = 0;
        
        while (n != 0){
            int digit = n % 10;
            rev = rev * 10 + digit;
            n /= 10;
        }
        
        if(temp == rev){
            System.out.println("True, this is a palindrome number.");
        }
        else{
            System.out.println("Flase, this isn't a palindrome number.");
        }
    }
}
