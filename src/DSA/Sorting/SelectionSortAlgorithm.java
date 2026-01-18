package DSA.Sorting;

import java.net.DatagramSocket;

public class SelectionSortAlgorithm {
    public static void main(String[] args) {
        int[] arr = {64, 34, 26, 12, 22, 11, 90};
        Display(arr);
        SelectionSort(arr);
        Display(arr);

    }



    public static void SelectionSort(int[] arr) {
       for (int i = 0; i< arr.length;i++) {
           int smallest = i;
           for (int j = i+1; j< arr.length;j++) {
               if (arr[j] < arr[smallest]) {
                   smallest = j;
               }
           }
           if (smallest != i) {
               int temp = arr[smallest];
               arr[smallest] = arr[i];
               arr[i] = temp;
           }
       }

    }
    public static void Display (int[] arr) {
        for (int i : arr) {
            System.out.print(i + "   ");
        }
        System.out.println();
    }
}
