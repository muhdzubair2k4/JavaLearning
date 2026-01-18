package DSA.Searching;

public class BinarySearchAlgorithm {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int n = arr.length-1;
        int data = 6;
        int Result1 = IterativeSearch(arr, data);
        int Result2 = RecursiveSearch(arr, 0, n, data);
        if (Result1 != -1) System.out.println("Element found at " + Result1);
        if (Result2 != -1) System.out.println("Element found at " + Result2);
        else System.out.println("Element not found");


    }

    public static int IterativeSearch(int[] arr, int data) {
        int LB = 0;
        int UB = arr.length-1;

        while (LB <= UB){
            int mid = (UB+LB)/2;
            if (arr[mid] == data) return mid;
            else if (data > arr[mid]) LB = mid+1;
            else UB = mid - 1;
        }
        return -1;
    }

    public static int RecursiveSearch(int[] arr, int LB, int UB, int data) {
        if (LB > UB) return -1;
        int mid = (UB + LB) /2;
        if (arr[mid] == data) return mid;
        else if (data > arr[mid]) return RecursiveSearch(arr, mid +1, UB, data);
        else return RecursiveSearch(arr, LB, mid -1, data);

    }
}
