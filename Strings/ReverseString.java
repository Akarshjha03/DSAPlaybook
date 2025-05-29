public class ReverseString{
    public static void main(String args[]){
        String original = "AKARSH";
        StringBuilder reverse = new StringBuilder();
        
        for(int i = original.length() -1 ; i >= 0 ;i--){
            reverse.append(original.charAt(i));
        }
        
        //toString() : is used to convert stringbuilder to normal string
        System.out.println("Reversed string is:"+ reverse.toString());
        
    }
}
