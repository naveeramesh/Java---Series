package Search;

public class Binary {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,70,10,30,50};
        int target=99;
        System.out.println(BinarySearch(arr,target));

    }
   static int BinarySearch(int[] arr,int target) {
        //using index
      int start=0;
      int end=arr.length-1;


      while (start <= end){

          int mid = start + (end - start) / 2;

          if (target <  arr[mid]){
              end = mid-1;
          }else if (target>arr[mid]){
              start=mid+1;
          }else {
              return mid;
          }
      }

      return -1;
   }

}
