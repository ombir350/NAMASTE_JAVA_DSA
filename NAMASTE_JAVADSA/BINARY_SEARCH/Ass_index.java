public class binarysearch_index{
    //found index of the array.
    //return -1 if does not exist.
    public static int binary_search(int arr[], int target){
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if (arr[mid]==target){
                return mid;
            }
            if (target>arr[mid]){
                start=mid+1;
            }
            else if (target<arr[mid]){
                end=mid-1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        int arr[]={-13,-3,0,32,34,43,54,65,73,78,89};
        int target=34;
        System.out.print(binary_search(arr,target));
    }
}