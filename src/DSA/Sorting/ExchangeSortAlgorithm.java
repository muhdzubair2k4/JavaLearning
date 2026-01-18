package DSA.Sorting;

public class ExchangeSortAlgorithm {
    public static void main(String[] args) {
        int[] arr = {64, 34, 26, 12, 22, 11, 90};
        Display(arr);
        ExchangeSort(arr);
        Display(arr);

    }

    public static void ExchangeSort(int[] arr) {
        for (int i = 0; i<arr.length-1; i++) {
            for(int j = i+1; j<arr.length;j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
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
