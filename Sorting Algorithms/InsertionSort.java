public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = { 5, 2, 9, 1, 5, 6 };

        System.out.println("Before Sorting:");
        for (int num : arr)
            System.out.print(num + " ");
        System.out.println();

        // Insertion sort logic
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }

            arr[j + 1] = key;
        }

        System.out.println("After Sorting:");
        for (int num : arr)
            System.out.print(num + " ");
    }
}
