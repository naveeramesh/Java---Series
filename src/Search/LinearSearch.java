package Search;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9};
        int target=9;
        System.out.println(linearSearch2( arr, target));

    }
    //find element at range
   static int linearSearch(int[] arr, int target,int start,int end){
        if (arr.length==0){
            return -1;
        }
        for (int i=start;i<=end;i++){
            if (arr[i]==target){
                return i;
            }
        }
        return  -1;
    }
    //find element at whole array
    static int linearSearch2(int[] arr, int target){
        if (arr.length==0){
            return -1;
        }
        for (int i=0;i<=arr.length;i++){
            if (arr[i]==target){
                return i;
            }
        }
        return  -1;
    }
}
