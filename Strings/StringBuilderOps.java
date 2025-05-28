public class StringBuilderOps{
    public static void main(String args[]){
        
        //defining stringbuilder
        StringBuilder sb = new StringBuilder("Tony");
        System.out.println(sb);
        
        //checking character at index position
        System.out.println(sb.charAt(1));
        
        //setCharAt() is used and printed this way
        sb.setCharAt(3, 's');
        System.out.println(sb);
        
        //inserting any character at any index
        sb.insert(1, 'M');
        System.out.println(sb);
        
        //deleting any characters from any index
        sb.delete(4, 's');
        System.out.println(sb);
        
        //appending - adding from last 
        sb.append('k');
        System.out.println(sb);
        
        //length of StringBuilder
        System.out.println(sb.length());
    }
}
