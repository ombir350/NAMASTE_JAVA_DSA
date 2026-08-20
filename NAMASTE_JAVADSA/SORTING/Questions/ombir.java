/*     Hard.
LeetCode 41. First Missing Positive.
Given an unsorted integer array nums. Return the smallest positive integer that is not present in nums.

You must implement an algorithm that runs in O(n) time and uses O(1) auxiliary space.

example 1.                                      example 2.                      
Input: nums = [1,2,0],  Output: 3           Input: nums = [3,4,-1,1].   Output: 2.
 */
import java.util.*;
public class ombir{
   public static void swap(int nums[], int first,int second){
        int temp=nums[first]; 
        nums[first]=nums[second];
        nums[second]=temp;
    }
    //apply the cyclic sort.
    public static int first_missing_positive(int arr[]){
        int n=arr.length;
        int i=0;
        while(i<n){
           int  currectindex=arr[i]-1; //becouse mt arr start from 0, as well as index.(index and value are same).
           if ( arr[i]>0 && arr[i]<n && arr[i]!=arr[currectindex]){
             swap(arr,i,currectindex);
           }else{
            i++;
           }
        }
        for(int ind=0;ind<n;ind++){
            if (arr[ind]!=ind+1){
               return ind+1;
            }
        }
        return n+1;
    }
    public static void main(String[] args){
        int arr[] = {3,4,-1,1};
        int ans=first_missing_positive(arr);
        System.out.print(ans);   
    }
}