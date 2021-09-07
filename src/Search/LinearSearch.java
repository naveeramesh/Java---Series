package Search;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9};
        int target=6;
        System.out.println(linearSearch2( arr, target));

    }
    //find element at range
   static int linearSearch(int[] arr, int target,int start,int end){
        if (arr.length==0){
            return -1;
        }
        for (int index=start;index<=end;index++){
            int element = arr[index];
            if (element==target){
                return index;
            }
        }
        return  -1;
    }
    //find element at whole array
    static int linearSearch2(int[] arr, int target){
        if (arr.length==0){
            return -1;
        }
        for (int index=0;index<=arr.length;index++){
            int element = arr[index];
            if (element==target){
                return index;
            }
        }
        return  -1;
    }
}
