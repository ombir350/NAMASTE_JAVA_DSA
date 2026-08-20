import java.util.*;
// Facrbook Question
public class searchrange_start_end{
  public static int[] searchrange(int []nums, int target){
    int ans[]={-1,-1};
    ans[0]=search(nums,target, true);
    if (ans[0]!=-1){
      ans[1]=search(nums,target,false);
    }
   

   return ans;
  }
  public static int search(int nums[], int target, boolean findfirstindex){
    int ans=-1;
    int start=0;
    int end=nums.length-1;
    while(start<=end){
     int mid=start+(end-start)/2;
     if (target<nums[mid]){
      end=mid-1;
     }
     else if(target>nums[mid]){
      start=mid+1;
     }else{
      //potancial ans found.
      ans=mid;

      if (findfirstindex){
         end=mid-1;
      }else{
        start=mid+1;
      }
     }
    }
    return ans;
  }
  public static void main (String[]args){
    int nums[]={2,7,7,7,7,8,8,10};
    int target=7;
    System.out.print(Arrays.toString(searchrange(nums,target)));
  }
}