// Reverse an array without using an extra array:

public class Main {
    public static void main(String args[]) {
        
        int arr[] = {10, 20, 30, 40, 50};
        
        int left = 0;
        int right = arr.length - 1;
        
        while (left < right) {
            // Swap elements
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            // Move pointers INSIDE the loop
            left++;
            right--;
        }
        
        // Print reversed array
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
