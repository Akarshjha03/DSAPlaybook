public class CountDigits{
    public static void main(String args[]){
        int n = 12345;
      // Convert number to string and then to char array
        char digits[] = String.valueOf(n).toCharArray(); //first the value is converted to string by "12345" then character by character to array
        
        System.out.println("Number of digits are:" + digits.length); //printing the length of array
    }
}

//------------------------------------------------------------OR---------------------------------------------------------------------------------------

import java.util.*;

public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the elements: ");
        int n = sc.nextInt();
        
        int count = 0;
        int temp = Math.abs(n); //Handles Negative Values
        
        if(temp == 0){
            count = 1; //if the value is 0, then returns only 1
        }
        else{
            while(temp > 0){
                temp /= 10; //Just chop digits off
                count++;
            }
        }
        System.out.println("Count is: " + count);
    }
}
