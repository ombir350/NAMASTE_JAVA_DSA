package DAY4;
import java.util.*;
public class bubbleSort{
    public static void bubble_sort(int arr[],int row,int col){
        if (row==0){
            return;
        }
        if (row>col){
            if (arr[col]>arr[col+1]){
                int temp=arr[col];
                arr[col]=arr[col+1];
                arr[col+1]=temp;
            }
           bubble_sort(arr,row,col+1); 
        }else{
           bubble_sort(arr,row-1,0); 
        }
    }
    public static void main(String[]args){
        int arr[]={3,9,6,5,8};
        bubble_sort(arr,arr.length-1,0);
        System.out.print(Arrays.toString(arr));
    }
}
