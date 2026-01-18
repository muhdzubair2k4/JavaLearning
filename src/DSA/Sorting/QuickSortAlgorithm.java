package DSA.Sorting;

public class QuickSortAlgorithm {

        public static void main(String[] args) {
            int[] arr = {64, 34, 26, 12, 22, 11, 90};
            Display(arr);
            QuickSort(arr, 0, arr.length-1);
            Display(arr);

        }

        public static void QuickSort(int[] arr, int low, int high) {
            if (low < high) {
                int pivotIndex = partition(arr, low, high);
                QuickSort(arr, low, pivotIndex-1);
                QuickSort(arr, pivotIndex+1, high);
            }
        }

    private static int partition(int[] arr, int low, int high) {
            int pivot = arr[high];
            int i = low-1;

            for(int j = low; j<high; j++){
                if (arr[j] < pivot) {
                    i++;
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
            i++;
            int temp = arr[i];
            arr[i] = arr[high];
            arr[high] = temp;
            return i;
    }



        public static void Display (int[] arr) {
            for (int i : arr) {
                System.out.print(i + "   ");
            }
            System.out.println();
        }

}
