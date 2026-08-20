import java.util.*;

public class Lenear_Search_on2Darray{
    //find the indexes from the given 2D array and than return indexes. 
    public static int[] lenearsearch_index(int [][] arr,int  target){
       for (int row=0; row<arr.length;row++){
           for (int col=0; col<arr[row].length;col++){
            if (arr[row][col]==target){
            return new int[]{row,col} ;
            }
           }
       }
       return new int[]{-1,-1};
    }
    public static void main (String[] args){
        int arr[][]={
            {23,45,54},
            {43,54,65,87},
            {23,45,57,8,97,32},
        };
        int target=8;
        int ans[]=lenearsearch_index(arr,target);
        System.out.println(Arrays.toString(ans));
        System.out.println(lenearsearch_max(arr));

    }

// find the maximum from the given array.
 public static int lenearsearch_max(int [][] arr){
    int max=Integer.MIN_VALUE;
       for (int row=0; row<arr.length;row++){
           for (int col=0; col<arr[row].length;col++){
              if (arr[row][col]>max){
                 max=arr[row][col];
                 
                }
           }
       }
       return max;
    }
}