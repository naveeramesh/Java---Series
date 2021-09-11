package Sort;

import java.util.Arrays;

public class Cyclic {
    public static void main(String[] args) {
        int[] arr={3,5,4,1,2};
        CyclicSort(arr);
        System.out.println(Arrays.toString(arr));

    }
   static void CyclicSort(int[] arr){
        int i=0;
        while (i < arr.length){
            int check = arr[i]-1;
            if (arr[i]!=arr[check]){ //checking the 3 is not equal to 4 if true swap else move i
                swap(arr,i,check);
            }else {
                i++;
            }
        }
    }
    static void swap(int[] array,int first,int last) {
        int temp=array[first];
        array[first]=array[last];
        array[last]=temp;

    }
}
