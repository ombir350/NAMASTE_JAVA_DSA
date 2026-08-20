public class floor_number{
    public static int floor(int arr[],int target){
        int start=0; 
        int end=arr.length-1;
        int mid;
        while (start<=end){
          mid =start + (end-start)/2;
          if (target>arr[mid]){
            start=mid+1;
          }
          else if(target<arr[mid]){
            end=mid-1;
          }else{
            return mid;
          }
        }
      return end;
    }
    public static void main (String[] args){
      int arr[]={2,4,5,12,34,45,54,66,67};
      int target=69;
      System.out.print(floor(arr,target));
    }
}