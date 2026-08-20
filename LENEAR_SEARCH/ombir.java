// Q. Leetcode 1672:- Richest Customer Wealth
public class ombir{
    public static int maximumWealth(int [][]arr){
        int ans=Integer.MIN_VALUE;
        for (int person=0; person<arr.length; person++){
          int sum=0;
          for(int account=0;account<arr[person].length;account++){
              sum=sum+arr[person][account];
            }
            if (sum>ans){
                ans=sum;
            }
        }
     return ans;
    }
    public static void main (String[]args){
        int arr[][]= {{1,2,3},{3,2,1}};
        System.out.print(maximumWealth(arr));
    }
}