/*     easy.
LeetCode 645 : Set Mismatch
You have a set of integers s, which originally contains all the numbers from 1 to n. Unfortunately, due to some error,
one of the numbers in s got duplicated to another number in the set, which results in repetition of one number and loss of another number.

example 1.                                      example 2.                      
Input: nums = [1,2,2,4],  Output: [2,3]           Input: nums = [1,1].   Output: [1,2]
 */
import java.util.*;
public class Set_Mismatch{
   public static void swap(int nums[], int first,int second){
        int temp=nums[first]; 
        nums[first]=nums[second];
        nums[second]=temp;
    }
    //apply the cyclic sort.
    public static int[] set_mismatch(int arr[]){
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
               return new int[]{arr[ind],ind+1};
            }
        }
        return new int[]{-1,-1};
    }
    public static void main(String[] args){
        int arr[] = {1,2,2,4};
        int[] ans=set_mismatch(arr);
        System.out.print(Arrays.toString(ans));   
    }
}