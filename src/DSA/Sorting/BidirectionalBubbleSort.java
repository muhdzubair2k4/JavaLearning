package DSA.Sorting;

public class BidirectionalBubbleSort {
    public static void main(String[] args) {
        int[] arr = {64, 34, 26, 12, 22, 11, 90};
        Display(arr);
        BDBubbleSort(arr);
        Display(arr);

    }

    public static void BDBubbleSort(int[] arr) {
       int start = 0;
       int end = arr.length -1;
       boolean swapped;
       do{
           swapped = false;
           for(int i = start ; i < end ; i++) {
               if (arr[i] > arr[i+1]) {
                   int temp = arr[i];
                   arr[i] = arr[i+1];
                   arr[i+1] = temp;
                   swapped = true;
               }
           }
           if (!swapped) break;
           end--;
           swapped = false;

           for(int i = end -1; i >=start; i--){
               if (arr[i] > arr[i+1]) {
                    int temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                    swapped = true;
               }
           }
           start++;
       }
       while (swapped);
    }

    public static void Display (int[] arr) {
        for (int i : arr) {
            System.out.print(i + "   ");
        }
        System.out.println();
    }
}
