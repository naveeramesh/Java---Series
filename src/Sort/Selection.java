package Sort;

import java.util.Arrays;

public class Selection {
    public static void main(String[] args) {
        int[] arr={5,4,3,2};
        SelectionSort(arr);
        System.out.println(Arrays.toString(arr));

    }
    static void SelectionSort(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            //finding the last element eg array={5,4,3,2,1},last index=5-0-1=4 so the last element is in 4th index.
            int lastindex=arr.length - i - 1;
            //find the largest element in an array
            int maxindex= getMax(arr,0,lastindex);
            //swapping the largest element to respective position
            swap(arr,maxindex,lastindex);
        }
    }

     static void swap(int[] array,int first,int last) {
        int temp=array[first];
        array[first]=array[last];
        array[last]=temp;

    }

    static int getMax(int[] arr, int start, int end) {
        int max = start;
         for (int i = start; i <=end; i++) {
             if (arr[max]<arr[end]){
                 max=i;
             }

         }
        return max;
    }

}
