import java.util.*;

public class Main{
    public static void main(String args[]){
        
        PrintName(3, "Akarsh");
    }
    
    public static void PrintName(int n, String name){
        
        if(n == 0) return ;
        
        System.out.println(name);
        
        PrintName(n - 1 , name);
    }
}
