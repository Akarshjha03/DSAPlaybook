import java.util.*;
public class Ifelse{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your marks:");
        int n = sc.nextInt();
        
        if( n < 0){
            System.out.println("Invalid Input");
        }
        
        else if(n >= 90){
            System.out.println("Grade A");
        }
        
        else if(n >= 70){
            System.out.println("Grade B");
        }
        
        else if(n >= 50){
            System.out.println("Grade C");
        }
        
        else if(n >= 35){
            System.out.println("Grade D");
        }
        
        else{
            System.out.println("Fail");
        }
        
    }
}
