/*     medium level.
LeetCode 287 : Find the Duplicate Number
Given an array of integers nums containing n + 1 integers where each integer is in the range [1, n] inclusive.

There is only one repeated number in nums, return this repeated number.

example 1.                                      example 2.                      
Input: nums = [1,3,4,2,2],  Output: 2           Input: nums = [3,1,3,4,2].   Output: 3

 */
import java.util.*;
public class Dublicate_Number{
   public static void swap(int nums[], int first,int second){
        int temp=nums[first]; 
        nums[first]=nums[second];
        nums[second]=temp;
    }
    //apply the cyclic sort.
    public static int find_dublicate(int arr[]){
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
        for(int ind=0;ind<n;ind++){
            if (arr[ind]!=ind+1){
                return arr[ind];
            }
        }
        return -1;
    }
    public static void main(String[] args){
        int arr[] = {1,3,4,2,2};
        int  ans=find_dublicate(arr);
        System.out.print(ans);   
    }
}