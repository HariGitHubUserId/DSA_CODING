public class MergeSort1 {
    // Function to merge two halves
    public static void merge(int[] arr, int left, int mid, int right) {
        int n1 = mid - left + 1;  // size of left half
        int n2 = right - mid;     // size of right half

        int[] L = new int[n1];
        int[] R = new int[n2];

        // Copy data to temp arrays
        for (int i = 0; i < n1; i++)
            L[i] = arr[left + i];
        for (int j = 0; j < n2; j++)
            R[j] = arr[mid + 1 + j];

        int i = 0, j = 0, k = left;

        // Merge the two arrays
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        // Copy remaining elements of L[]
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }

        // Copy remaining elements of R[]
        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }

    // Divide function
    public static void mergeSort(int[] arr, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;

            // Sort first and second halves
            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);

            // Merge the sorted halves
            merge(arr, left, mid, right);
        }
    }

    public static void main(String[] args) {
        int[] arr = {5, 2, 9, 1, 6, 3};

        System.out.println("Before sorting:");
        for (int num : arr) System.out.print(num + " ");

        mergeSort(arr, 0, arr.length - 1);

        System.out.println("\nAfter sorting:");
        for (int num : arr) System.out.print(num + " ");
    }
}

