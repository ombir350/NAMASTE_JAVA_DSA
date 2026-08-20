/* Amazon
LeetCode 268. Missing Number.
Given an array nums containing n distinct numbers in the range [0, n],
return the only number in the range that is missing from the array.

example 1.                                   example 2.                                          example 3.
Input: nums = [3,0,1], output : 2.           Input: nums = [9,6,4,2,3,5,7,0,1], output : 8.      Input: nums = [0,1],  output : 2.
 */
public class Missing_Number{
   public static void swap(int nums[], int first,int second){
        int temp=nums[first]; 
        nums[first]=nums[second];
        nums[second]=temp;
    }
    //apply the cyclic sort.
    public static int Missing__Number(int arr[]){
        int n=arr.length;
        int i=0;
        while(i<n){
           int  currectindex=arr[i]; //becouse mt arr start from 0, as well as index.(index and value are same).
           if (arr[i]<n && arr[i]!=arr[currectindex]){
             swap(arr,i,currectindex);
           }else{
            i++;
           }
        }
        //find missing value, (that means value is not same as well as index than return index(value)).
        for(int ind=0;ind<n;ind++){
            if (ind!=arr[ind]){
                return ind;
            }
        }
        return n;
    }
    public static void main(String[] args){
        int arr[] = {9,6,4,2,3,5,7,0,1};
        int ans=Missing__Number(arr);
        System.out.print("Missing Number : "+ans);   
    }
}