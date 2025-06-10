//This to be done in specific type(Generic) to avoid confusion of mutltiple input types
import java.util.*;

public class UserInputAL{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> ar = new ArrayList<>();
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int val = sc.nextInt();
            ar.add(val); // ✅ Correct way to add
        }

        System.out.println(ar); // Print entire list
    }
}
