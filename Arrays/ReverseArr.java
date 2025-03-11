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

/*Breaking it Down
Let’s assume we have this array:

int arr[] = {10, 20, 30, 40, 50};

Array index positions:
Index:   0   1   2   3   4
Value:  10  20  30  40  50

The length of the array (n) is 5.
Iteration-wise Explanation of n - i - 1

i (Loop Counter)	n - i - 1 (Reverse Index)	arr[n - i - 1] (Original Array Value)	Stored in revarr[i]
0	5 - 0 - 1 = 4	arr[4] = 50	revarr[0] = 50
1	5 - 1 - 1 = 3	arr[3] = 40	revarr[1] = 40
2	5 - 2 - 1 = 2	arr[2] = 30	revarr[2] = 30
3	5 - 3 - 1 = 1	arr[1] = 20	revarr[3] = 20
4	5 - 4 - 1 = 0	arr[0] = 10	revarr[4] = 10

Final Reversed Array:
revarr = {50, 40, 30, 20, 10};

So, n - i - 1 effectively accesses the elements in reverse order.*/
