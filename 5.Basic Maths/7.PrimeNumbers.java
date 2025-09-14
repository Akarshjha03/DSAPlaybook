import java.util.*;

public class Main{
    public static void main(String args[]){
        System.out.println("Enter the number: ");
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        
        boolean isPrime = true;
        
        if(n <= 1){
            isPrime = false;
        }
        else{
            for(int i = 2; i * i <= n; i++){
                if( n % 1 ==0){
                    isPrime = false;
                    break;
                }
            }
        }
        
        if(isPrime){
            System.out.println("This is a prime number");
        }
        else{
            System.out.println("This is not a prime number");
        }
     
        
    }
}
