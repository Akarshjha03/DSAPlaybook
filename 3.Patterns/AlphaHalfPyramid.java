public class AlphaHalfPyramid{
    public static void main(String args[]){
        int n =4;
        for(int i = 0; i <= n ; i++){
            for(char ch = 'a'; ch <= 'a'+i; ch++){
                System.out.print(ch);
            }
            System.out.println();
        }
    }
}
