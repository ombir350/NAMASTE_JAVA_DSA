// Amazon Question.
public class hello{
    public static int binary_search(int arr[],int target, int start, int end){
        while(start<=end){
          int mid=start+(end-start)/2;
          if (target<arr[mid]){
            end=mid-1;
          }else if (target>arr[mid]){
            start=mid+1;
          }else{
            return mid;
          }
        }
        return -1;
    }
    public static void main (String[]args){
        int arr[]={2,4,5,7,9,12,23,43,45,76,87,89,91,96};
        int target=43;
        // System.out.print(ans(arr,target));
    }
}