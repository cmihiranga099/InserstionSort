/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package implement_merge_sort_using_recursion;
import java.util.Arrays;


public class MergeSortExample {

    // Merge Sort Method
    public static void mergeSort(int[] arr) {
        if (arr.length <= 1) {
            return;  // Base case: if the array has only one element, it's already sorted.
        }

        // Split the array into two halves
        int mid = arr.length / 2;
        int[] left = Arrays.copyOfRange(arr, 0, mid);
        int[] right = Arrays.copyOfRange(arr, mid, arr.length);

        // Recursively sort each half
        mergeSort(left);
        mergeSort(right);

        // Merge the sorted halves
        merge(arr, left, right);
    }

    // Merge method to combine two sorted sub-arrays into one sorted array
    public static void merge(int[] arr, int[] left, int[] right) {
        int i = 0; // Pointer for left array
        int j = 0; // Pointer for right array
        int k = 0; // Pointer for merged array

        // Merge the two arrays while both have elements
        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                arr[k] = left[i];
                i++;
            } else {
                arr[k] = right[j];
                j++;
            }
            k++;
        }

        // If any elements are left in the left array
        while (i < left.length) {
            arr[k] = left[i];
            i++;
            k++;
        }

        // If any elements are left in the right array
        while (j < right.length) {
            arr[k] = right[j];
            j++;
            k++;
        }
    }
public class Implement_merge_sort_using_recursion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] arr = {64, 34, 25, 12, 22, 11, 90};

        System.out.println("Original Array: " + Arrays.toString(arr));

        mergeSort(arr);

        System.out.println("Sorted Array (Merge Sort): " + Arrays.toString(arr));
    }
    }
    
}
