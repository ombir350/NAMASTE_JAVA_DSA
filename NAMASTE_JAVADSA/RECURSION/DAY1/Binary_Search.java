public class Binary_Search{
    public static int binary_search(int arr[],int target, int start, int end){
        if (start>end){
            return -1;
        }
        int mid =start+(end-start)/2;
        if (arr[mid]==target){
            return mid;
        }
        if (target>arr[mid]){
           return  binary_search(arr,target,mid+1,end);
        }
          return binary_search(arr,target,start,mid-1);
    }
    public static void main(String []args){
        int arr[]={12,32,34,45,65,76};
        int target=76;
        System.out.print(binary_search(arr,target,0,arr.length-1));
    }
}