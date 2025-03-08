import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of array:");
        int size = sc.nextInt();

        int arr[] = new int[size];

        System.out.println("Enter the elements of array:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        // Print array in a single line
        System.out.println("Array Output:");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " "); // Print in the same line with a space
        }

        sc.close(); // Close scanner
    }
}
