/*     medium level.
LeetCode 442. Find All Duplicates in an Array
Given an integer array nums of length n where all the integers of nums are in the range [1, n],
 and each integer appears at most twice, return an array of all the integers that appears twice.

You must write an algorithm that runs in O(n) time and uses only constant auxiliary space,
excluding the space needed to store the output

example 1.                                      example 2.                      
Input: nums = [4,3,2,7,8,2,3,1],  Output: [2,3]           Input: nums = [1,1,2].   Output: [1]

 */
import java.util.*;
public class All_dublicates_num{
   public static void swap(int nums[], int first,int second){
        int temp=nums[first]; 
        nums[first]=nums[second];
        nums[second]=temp;
    }
    //apply the cyclic sort.
    public static ArrayList<Integer> All_Dublicates_Number(int arr[]){
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
                ans.add(arr[ind]);
            }
        }
        return ans;
    }
    public static void main(String[] args){
        int arr[] = {4,3,2,7,8,2,3,1};
        ArrayList<Integer> ans2=All_Dublicates_Number(arr);
        System.out.print(ans2);   
    }
}