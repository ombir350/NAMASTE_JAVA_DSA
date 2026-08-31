public class binary_search{
    public static int search (int arr[],int target, int start,int end){
        if (start>end){
            return -1;
        }
        int mid =start+(end-start)/2;
        if (arr[mid]==target){
            return mid;
        }
        if (arr[start]<=arr[mid]){
            if (arr[start]<=target && target<=arr[mid]){
                return search(arr,target,0,mid-1);
            }else{
                 return search(arr,target,mid+1,end);
            }
        }
     return -1;
    }
    public static void main (String []args){
        int arr[]={3,5,7,8,9,10};
        int target=9;
        System.out.print(search(arr,target,0,arr.length-1)); 
    } 
}

//time complexity = 0(logn).
//space complexity = 0(logn).