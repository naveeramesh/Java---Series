package Sort;

import java.util.Arrays;

public class Insertion {
    public static void main(String[] args) {
        int[] arr={5,4,3,1,2};
        InsertinSort(arr);
        System.out.println(Arrays.toString(arr));

    }
    static void InsertinSort(int[] array){
        for (int i = 0; i <= array.length - 2 ; i++) { //can also write it as i < array.length-1
            for (int j = i + 1; j > 0; j--) {
                if (array[j]<array[j-1]){
                    int temp=array[j];
                    array[j]=array[j-1];
                    array[j-1]=temp;
                }
                else {
                    break;
                }
            }

        }
    }
}
