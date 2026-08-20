public class search_rotated_sorted_arr{
    // it not work for dublicated value.
    public static int findpivot(int arr[]){
        int start=0;
        int end=arr.length-1;
        while(start<=end){
         int mid=start+(end-start)/2;
         if (arr[mid]>arr[mid+1] && mid<end){
            return mid;
         }
         if (arr[mid]<arr[mid-1] && mid>start){
            return mid-1;
         }
         if (arr[start]>=arr[mid]){
            end=mid-1;
         }else{
            start=mid+1;
         }
        }
        return -1;
    }
     // apply simple binary search. 
    public static int binarysearch(int arr[],int target, int start,int end){
        while (start<=end){
            int mid=start+(end-start)/2;
            if (target==arr[mid]){
                return mid;
            }
            if (target>arr[mid]){
                start=mid+1;
            }
            else if (target<arr[mid]){
                end=mid-1;
            }
        }
        return -1;
    }
    
    public static int search(int arr[], int target){
      int pivot=findpivot(arr);
      if (pivot== -1 ){
        return binarysearch(arr,target,0, arr.length-1);
      }
      if (target==arr[pivot]){
        return pivot;
      }
      if (target>=arr[0]){
        return binarysearch(arr,target,0,pivot-1);
      }
        return binarysearch(arr,target,pivot+1,arr.length-1);
    }
    public static void main (String [] args){
        int arr[]={5,6,7,8,9,1,2,3,4,};
        int target=9;
        System.out.print(search(arr,target));

    }
}