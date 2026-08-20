import java.util.*;
public class selection_sort{
    public static void selection__sort(int arr[]){
       for (int i=0; i<arr.length-1;i++){
        int last=arr.length-i-1;
        int maxindex=getmaxindex(arr,0,last);
        swap(arr,maxindex,last);
       }
    }
    
    public static void swap(int arr[],int first,int second){
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }

    public static int getmaxindex(int arr[],int start,int end){
     int max=start;
     for (int i=start;i<=end;i++){
         if (arr[i]>arr[max]){
              max=i;
            }
        }
     return max;
    }

    public static void main(String[]args){
        int arr[]={-12,3,-65,0,87};
        selection__sort(arr);
        System.out.print(Arrays.toString(arr));
    }
}