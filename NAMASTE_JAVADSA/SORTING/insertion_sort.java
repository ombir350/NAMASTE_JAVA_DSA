import java.util.*;
public class insertion_sort{
    public static void insertion__sort(int arr[]){
        for (int i=0;i<arr.length-1;i++){
            for (int j=i+1;j>0;j--){
                if (arr[j]<arr[j-1]){
                    swap(arr, j,j-1);
                }
            }
        }
    }
    public static void swap(int []arr,int first,int second){
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
    public static void main (String[] args){
       int arr[]={-12,45-12,41,0,-43,53};
       insertion__sort(arr);
       System.out.print(Arrays.toString(arr));
    }
}