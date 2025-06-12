public class CountDigits{
    public static void main(String args[]){
        int n = 12345;
      // Convert number to string and then to char array
        char digits[] = String.valueOf(n).toCharArray(); //first the value is converted to string by "12345" then character by character to array
        
        System.out.println("Number of digits are:" + digits.length); //printing the length of array
    }
}
