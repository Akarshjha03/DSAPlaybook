// Find the greatest number inside an array:

public class GreatestElement {
    public static void main(String[] args) {
        int[] arr = {10, 25, 47, 5, 89, 34};  // Example array
        int max = arr[0];  // Assume first element is maximum
        
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {  // Compare with current max
                max = arr[i];
            }
        }
        
        System.out.println("Greatest element: " + " " + max);
    }
}
