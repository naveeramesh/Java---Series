package Sort;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        BubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
     static void BubbleSort(int[] arr){
          boolean isswapped;
        for (int i = 0; i < arr.length; i++) {
                isswapped=false;
            for (int j = 1; j < arr.length - i ; j++) {
                if (arr[j]<arr[j-1]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                    isswapped=true;
                }

            }
            if (!isswapped){
                break;
            }


        }


    }
}
