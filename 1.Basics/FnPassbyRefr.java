public class FnPassbyRefr{
    public static void main(String args[]){
        System.out.println("The square is: " + square(9));
        
    }
    
    public static int square(int a){
        int b = a*a;
        return b;
    }
}
