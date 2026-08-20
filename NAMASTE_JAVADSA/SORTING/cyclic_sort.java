import java.util.*;
public class ombir{
    public static void cyclic__sort(int arr[]){
        int i=0;
        while(i<arr.length){
            int currect=arr[i]-1;
            if(arr[i]!=arr[currect]){
                swap(arr,i,currect);
            }else{
                i++;
            }
        }
    }

    public static void swap(int []arr,int first,int second){
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
    public static void main (String[] args){
       int arr[]={3,2,4,1,5};
       cyclic__sort(arr);
       System.out.print(Arrays.toString(arr));
    }
}            