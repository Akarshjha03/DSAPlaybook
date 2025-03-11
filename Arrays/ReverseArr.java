// Reverse an array using an extra array:

public class Main {
    public static void main(String args[]) {

        // Define an array with given values
        int arr[] = {10, 20, 30, 40, 50};

        // Get the length of the array
        int n = arr.length;

        // Create a new array of the same size to store the reversed elements
        int revarr[] = new int[n];

        // Loop to copy elements in reverse order
        for (int i = 0; i < n; i++) {
            revarr[i] = arr[n - i - 1];  // Copy last element of arr to first position of revarr, and so on
        }

        // Loop to print the reversed array
        for (int i = 0; i < revarr.length; i++) {
            System.out.println(revarr[i] + " ");  // Print each element of reversed array
        }
    }
}
