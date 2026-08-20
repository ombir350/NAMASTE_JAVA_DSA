public class Count_Rotation{
  // it not work for dublicated value.
    public static int findpivot(int nums[]){
        int start=0;
        int end=nums.length-1;
        while(start<=end){
         int mid=start+(end-start)/2;
         if (nums[mid]>nums[mid+1] && mid<end){
            return mid;
         }
         if (nums[mid]<nums[mid-1] && mid>start){
            return mid-1;
         }
         if (nums[start]>=nums[mid]){
            end=mid-1;
         }else{
            start=mid+1;
         }
        }
        return -1;
    }

    // what if the array is contain dublicates value. than find pivot element.
    public static int findpivot_Dublicates(int nums[]){
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


    public static int search(int nums[]){
      int pivot=findpivot(nums);
      int pivot1=findpivot_Dublicates(nums);
      return pivot+1;
    //   return pivot1+1;
    }
    public static void main (String [] args){
        int nums[]={5,6,7,8,2,3,4};
        System.out.print(search(nums));

    }
}