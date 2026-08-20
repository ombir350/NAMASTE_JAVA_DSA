/*     Google
LeetCode 448. Find All Numbers Disappeared in an Array.
Given an array nums of n integers where nums[i] is in the range [1, n],
return an array of all the integers in the range [1, n] that do not appear in nums.

example 1.                                                   
Input: nums = [4,3,2,7,8,2,3,1], output : [5,6].               
 */
import java.util.*;
public class LeetCode_448{
   public static void swap(int nums[], int first,int second){
        int temp=nums[first]; 
        nums[first]=nums[second];
        nums[second]=temp;
    }
    //apply the cyclic sort.
    public static ArrayList<Integer> All_Missing__Number(int arr[]){
        int n=arr.length;
        int i=0;
        while(i<n){
           int  currectindex=arr[i]-1; //becouse mt arr start from 0, as well as index.(index and value are same).
           if ( arr[i]!=arr[currectindex]){
             swap(arr,i,currectindex);
           }else{
            i++;
           }
        }
        ArrayList <Integer> ans=new ArrayList<>();
        for(int ind=0;ind<n;ind++){
            if (arr[ind]!=ind+1){
                ans.add(ind+1);
            }
        }
        return ans;
    }
    public static void main(String[] args){
        int arr[] = {4,3,2,7,8,2,3,1};
        ArrayList<Integer> ans2=All_Missing__Number(arr);
        System.out.print(ans2);   
    }
}