import java.util.*;
public class ArrayListSort{
    public static void main(String args[]){
        ArrayList<Integer> age = new ArrayList<>();
        age.add(22);
        age.add(14);
        age.add(64);
        age.add(48);
        Collections.sort(age);
        System.out.println(age);
    }
}
