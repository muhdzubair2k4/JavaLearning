package DSA.Searching;

import java.util.Scanner;

public class LinearSearch {

    public int LS (int arr[], int data) {
        for (int i = 0; i < arr.length ; i++) {
            if (arr[i] == data) {
                return i;
            }
        }
        return -1;

    }

    public int RecurLS(int arr[], int data, int i) {

        if (i > arr.length) return -1;
        else if (arr[i] == data) return i;
        return RecurLS(arr, data, i+1);
    }
    public static void main(String[] args) {
        LinearSearch linearSearch = new LinearSearch();
        Scanner sc = new Scanner(System.in);
        System.out.println("LINEAR SEARCH ALGORITHM");
//        System.out.print("\nEnter Array Size : ");
//        int n = sc.nextInt();
        int[] arr = {1, 4, 8, 2, 9};

//        System.out.print("\nEnter Your Array : ");
//
//        for (int i = 0; i<arr.length; i++) {
//            arr[i] = sc.nextInt();
//        }

//        System.out.println("Entered Array is : ");
//        for (int i = 0; i<arr.length; i++) {
//            System.out.print(arr[i] + "   ");
//        }

        System.out.print("\nEnter Data to find : ");
        int data = sc.nextInt();
        int Result_1 = linearSearch.LS(arr, data);
        int Result_2 = linearSearch.RecurLS(arr, data, 0);
        if (Result_2 != -1) System.out.println("Element found at " + Result_2);
        if (Result_1 != -1) System.out.println("Element found at " + Result_1);
        else System.out.println("Element not found");



    }
}
