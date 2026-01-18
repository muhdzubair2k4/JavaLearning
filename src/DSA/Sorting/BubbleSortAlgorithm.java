package DSA.Sorting;

import java.net.DatagramSocket;

public class BubbleSortAlgorithm {
    public static void main(String[] args) {
        int[] arr = {64, 34, 26, 12, 22, 11, 90};
        Display(arr);
        BubbleSort(arr);
        Display(arr);

    }
    public static int FindSmallest(int[] arr) {
        int min = 0;
        for (int i = 0; i<arr.length; i++) {
            if (arr[i] > min ) min = arr[i];
        }
        return min;
    }


    public static void BubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n ; i++) {
            boolean Swapped = false;
            for (int j = n-1; i < j ; j--) {
                if (arr[j] < arr[j-1]) {
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    Swapped = true;
                }
            }
            if (!Swapped) break;
        }
    }
    public static void Display (int[] arr) {
        for (int i : arr) {
            System.out.print(i + "   ");
        }
        System.out.println();
    }
}
