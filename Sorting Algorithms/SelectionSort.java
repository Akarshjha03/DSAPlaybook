public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = { 64, 25, 12, 22, 11 };

        System.out.println("Before Sorting:");
        for (int num : arr)
            System.out.print(num + " ");
        System.out.println();

        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;
            
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }

        System.out.println("After Sorting:");
        for (int num : arr)
            System.out.print(num + " ");
    }
}
