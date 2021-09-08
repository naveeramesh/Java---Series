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
            //finding the last element
            int lastnumber=arr.length - i - 1;
            //find the largest element in an array
            int maxindex= getMax(arr,0,lastnumber);
            //swapping the largest element to respective position
            swap(arr,maxindex,lastnumber);
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
