public class ombir{
    //found index of the array.
    //return -1 if does not exist.
    public static int binary_search(int arr[], int target){
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            //find weather the array is sorted in ascending or descending.
            boolean isAsse=(arr[start]<arr[end]);
            int mid=start+(end-start)/2;
            if (arr[mid]==target){
                return mid;
            }
            // if aaray is ascending than execute this part.
            if(isAsse){
              if (target>arr[mid]){
                  start=mid+1;
                }
               else {
                   end=mid-1;
               }
            }
            // if aaray is descending than perform this part.
            else{
                if (target<arr[mid]){
                  start=mid+1;
                }
               else {
                   end=mid-1;
               }
            } 
        }
        return -1;
    }
    public static void main(String[] args){
        int arr[]={-13,-3,0,32,33,43,54,65,73,78,89};
        int arr1[]={89,85,45,33,22,18,12,10,0,12};
        int target=33;
        System.out.println(binary_search(arr,target));
        System.out.println(binary_search(arr1,target));
    }
}