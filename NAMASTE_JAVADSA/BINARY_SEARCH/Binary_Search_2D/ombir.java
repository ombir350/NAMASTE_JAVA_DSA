import java.util.*;
public class ombir{
    public static int[] search_matrix(int arr[][],int target){
    int row=0;
    int col=arr.length;
    while(row<arr.length && col>=0){
         if(arr[row][col]==target){
            return new int[]{row,col};
         }
         if (target>arr[row][col]){
            row++;
         }else{
            col--;
         }
    }
    return new int[]{-1};
    }
    public static void main (String[]args){
     int arr[][]={{1,3,5,6,10},
                  {11,13,14,16,20},
                  {21,24,25,27,28},
                  {30,32,36,37,40}
                };
    int target=25;
    System.out.print(Arrays.toString(search_matrix(arr,target)));
    }
}