// Question : Take an array as input from the user. search for a given number x and print the index at which it occurs (array linear search) :

//Solution:


import java.util.*;

public class Main {
    public static void main(String args[]) {
        // Creating a Scanner object for user input
        Scanner sc = new Scanner(System.in);
        
        // Prompting the user to enter the size of the array
        System.out.println("Enter the size of an array:");
        int size = sc.nextInt();
        
        // Declaring an array of the given size
        int arr[] = new int[size];

        // Taking array elements as input from the user
        System.out.println("Enter the elements:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        // Asking the user for the number they want to search
        System.out.println("Please enter the element you want to find:");
        int match = sc.nextInt();

        // Variable to track whether the element is found
        boolean found = false; 
        
        // Iterating through the array to search for the element
        for (int i = 0; i < size; i++) {
            if (arr[i] == match) {  // Checking if the current element matches the search element
                System.out.println("The index of the element is: " + i);
                found = true; // Mark that we found the element
                break; // Exit the loop after finding the first occurrence
            }
        }

        // If the element was not found in the array
        if (!found) {
            System.out.println("Element is not in array");
        }

        // Closing the scanner to prevent resource leaks
        sc.close(); 
    }
}
