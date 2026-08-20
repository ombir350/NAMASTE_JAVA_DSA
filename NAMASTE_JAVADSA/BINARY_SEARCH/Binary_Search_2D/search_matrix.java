import java.util.*;
public class search_matrix{
    public static int[] search__matrix(int arr[][],int target){
    int row=0;
    int col=arr.length-1;
    while(row<arr.length-1 && col>=0){
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
     int arr[][]={{1,3,5,6,8,10},
                  {11,13,14,16,20},
                  {21,24,25,27,28},
                  {30,32,36,37,40}
                };
    int target=25;
    System.out.print(Arrays.toString(search__matrix(arr,target)));
    }
}