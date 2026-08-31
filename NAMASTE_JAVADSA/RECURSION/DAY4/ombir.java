package DAY4;
import java.util.*;
public class ombir {
    public static void selection_sort(int arr[],int row,int col,int max){
        if (row==0){
            return;
        }
        if (row>col){
            if (arr[col]>arr[max]){
              selection_sort(arr,row,col+1,col);
            }else{
                selection_sort(arr,row,col+1,max);
            }
        }else{
           int temp=arr[max];
           arr[max]=arr[row-1];
           arr[row-1]=temp;
           selection_sort(arr,row-1,0,0);
        }
    }
    public static void main(String[]args){
        int arr[]={3,10,6,5,8};
        selection_sort(arr,arr.length,0,0);
        System.out.print(Arrays.toString(arr));
    }
}
