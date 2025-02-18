/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package implemen_.quick_sort_using_recursion;

import java.util.Arrays;

public class QuickSortExample {

    // Quick Sort Method
    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            // Partition the array and get the pivot index
            int pivotIndex = partition(arr, low, high);

            // Recursively sort the sub-arrays
            quickSort(arr, low, pivotIndex - 1); // Sort the left part
            quickSort(arr, pivotIndex + 1, high); // Sort the right part
        }
    }

    // Partition method that selects a pivot element and partitions the array
    public static int partition(int[] arr, int low, int high) {
        // Choosing the rightmost element as the pivot
        int pivot = arr[high];
        int i = (low - 1); // Index of the smaller element

        // Traverse through the array, and arrange elements smaller than the pivot
        for (int j = low; j < high; j++) {
            if (arr[j] <= pivot) {
                i++;
                // Swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // Swap the pivot element with arr[i + 1] to place the pivot in the correct position
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1; // Return the pivot index
    }



public class Implemen_Quick_sort_using_recursion {

     
    public static void main(String[] args) {
       int[] arr = {64, 34, 25, 12, 22, 11, 90};

        System.out.println("Original Array: " + Arrays.toString(arr));

        // Perform Quick Sort
        quickSort(arr, 0, arr.length - 1);

        System.out.println("Sorted Array (Quick Sort): " + Arrays.toString(arr));
    }
    }
    
}
