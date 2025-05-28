public class Main{
    public static void main(String args[]){
        String s1 = "apple";
        String s2 = "Banana";
        
        System.out.println(s1.compareTo(s2));
        //just to ignore the upper and lower case
        System.out.println("apple".compareToIgnoreCase("Banana")); // Output: -1

    }
    
}
