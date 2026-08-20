public class search_rotated_sorted_arr_dublicates{
    // what if the array is contain dublicates value. than find pivot element.
    public static int findpivot(int nums[]){
        int start=0;
        int end=nums.length-1;
        while(start<=end){
         int mid=start+(end-start)/2;
         if (mid<end && nums[mid]>nums[mid+1] ){
            return mid;
         }
         if (mid>start && nums[mid]<nums[mid-1]){
            return mid-1;
         }
         // if element start, mid and end are equal. than just skip the dublicates value. 
         if (nums[start]==nums[mid] && nums[mid]==nums[end]){
              //check wether start is pivot.
              if (nums[start]>nums[start+1]){
                   return start;
                }
                start++;
              //check wether end is pivot.
              if (nums[end]<nums[end-1]){
                  return end-1;
                }
               end--;
            }
         //left side is sorted than pivot sould be right.
         if (nums[mid]>nums[start] || nums[mid]==nums[start] && nums[mid]>nums[end]){
            start=mid+1;
         }else{
            end=mid-1;
         }
        }
        return -1;
    }

    public static int binarysearch(int nums[],int target, int start,int end){
        int answer=-1;
        while (start<=end){
            int mid=start+(end-start)/2;
            if (target==nums[mid]){
                answer= mid;
                end=mid-1;
            }
            if (target>nums[mid]){
                start=mid+1;
            }
            else if (target<nums[mid]){
                end=mid-1;
            }
        }
        return answer;
    }

    public static int search(int nums[], int target){
      int pivot=findpivot(nums);
      if (pivot== -1 ){
        return binarysearch(nums,target,0, nums.length-1);
      }
      if (target==nums[pivot]){
        return pivot;
      }
      if (target>=nums[0]){
        return binarysearch(nums,target,0,pivot-1);
      }
        return binarysearch(nums,target,pivot+1,nums.length-1);
    }
    public static void main (String [] args){
        int nums[]={5,5,5,6,7,7,7,8,9,1,1,2,2,3,4};
        int target=7;
        System.out.print(search(nums,target));

    }
}