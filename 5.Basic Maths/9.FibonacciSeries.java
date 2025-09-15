import java.util.*;

public class Main{
    public static void main(String args[]){
        int n = 10;
        int a = 0;
        int b = 1;
        
        System.out.println("Fibonacci series are: ");
        
        for( int i = 0; i <= n; i++){
            System.out.print(i + ", ");
            int next = a + b;
            a = b;
            b = next;
        }
    }
}
