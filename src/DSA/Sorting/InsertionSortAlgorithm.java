package DSA.Sorting;

public class InsertionSortAlgorithm {
    public static void main(String[] args) {
        int[] arr = {64, 34, 26, 12, 22, 11, 90};
        Display(arr);
        InsertionSort(arr);
        Display(arr);

    }


    public static void InsertionSort(int[] arr) {
        for (int i = 0; i<arr.length; i++) {
            int swap = arr[i];
            int pos = i - 1;
            while (pos >= 0 && swap < arr[pos]) {
                arr[pos+1] = arr[pos];
                pos--;
            }
            arr[pos+1] = swap;
        }
    }
    public static void Display (int[] arr) {
        for (int i : arr) {
            System.out.print(i + "   ");
        }
        System.out.println();
    }

}
