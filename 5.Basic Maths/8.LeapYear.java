import java.util.*;

public class Main{
    public static void main(String args[]){
        int year = 2022;
        
        if(year % 400 == 0 || year % 4 == 0 && year % 100 != 0){
            System.out.println(year + " is a leap year.");
        }
        else{
            System.out.println(year + " is not a leap year.");
        }
    }
}

/*
A year is a leap year if it is divisible by 4.
But if it is divisible by 100, then it is not a leap year.
However, if it is divisible by 400, then it is a leap year.
*/
