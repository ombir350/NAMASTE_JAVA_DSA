/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */

 //this function find the index of the peak value. and return it.
public class findInMountainArray{
    public static int mountainarr(int arr[]){
    int start =0;
    int end=arr.length-1;
    while(start<end){
      int mid=start+(end-start)/2;
      if (arr[mid]>arr[mid+1]){
          end=mid;
        }else{
            start=mid+1;
        }  
    }
    return start;
 }

    public static int agnostic_bs(int arr[],int target, int start, int end,boolean isAsse ){
        while(start<=end){
          int mid=start+(end-start)/2; //find mid of the array.
          if (arr[mid]==target){
            return mid;
          }
          // if aaray is asscending than perform this part.
          if (isAsse){
              if (target<arr[mid]){
                 end=mid-1;
                }else{
                   start=mid+1;
                }
             // if aaray is descending than perform this part.
            }else{
               if (target>arr[mid]){
                  end=mid-1;
                }else{
                  start=mid+1;
                }
            }
        }
        return -1;
    }

    public static int ans(int arr[],int target) {
        int peak=mountainarr(arr);
        int first_try=agnostic_bs(arr, target, 0,peak,true);
        int sec_try=agnostic_bs(arr, target, peak+1,arr.length-1,false);
        if (first_try!=-1){
            return first_try;
        }
       return sec_try;
    }

    public static void main (String[]args){
     int arr[] = {1,2,3,4,5,3,1};
     int target = 5;
     System.out.print(ans(arr,target));
    }
 }
 