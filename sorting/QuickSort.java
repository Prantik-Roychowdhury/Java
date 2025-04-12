package sorting;

public class QuickSort {
    // Partition function
    static int partition(int[] arr, int low, int high)
    {
        int pivot = arr[high]; // Choosing last element as pivot
        int i = (low - 1); // Pointer for smaller elements

        for (int j = low; j < high; j++)
        {
            // Swap if current element is smaller than pivot
            if (arr[j] < pivot)
            {
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i + 1, high); // Place pivot in correct position
        return i + 1; // Return pivot index
    }
    // Quick Sort function
    static void quickSort(int arr[], int low, int high)
    {
        if (low < high)
        {
            int pivotIndex = partition(arr, low, high);
            quickSort(arr, low, pivotIndex - 1);  // Sort left part
            quickSort(arr, pivotIndex + 1, high); // Sort right part
        }
    }

    // Swap function
    static void swap(int[] arr, int i, int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    // Main function to test Quick Sort
    public static void main(String[] args)
    {
        int arr[] = {10, 7, 8, 9, 1, 5};
        int n = arr.length;

        quickSort(arr, 0, n - 1);

        System.out.println("Sorted array:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
