import java.util.*;

public class QuickSort {
    public static void Quick_Sort(int arr[],int low,int hi){
       if (low>=hi){
        return;
       }
       int s=low;
       int e=hi;
       int mid=s+(e-s)/2;
       int pivot=arr[mid];
       while(s<=e){
        //this is axecute until arr is sorted.
         while(arr[s]<pivot){
             s++;
            }
         while(arr[e]>pivot){
             e--;
            }
            //if not sorted thana swap it.
         if(s<=e){
              int temp=arr[s];
              arr[s]=arr[e];
              arr[e]=temp;
              s++;
              e--;
            }
       }
       //it determine the array of recursively devide into further two parts from (low to, end) than (start to, high). 
       Quick_Sort(arr,low,e);
       Quick_Sort(arr,s,hi); 
    }
    public static void main(String args[]){
       int arr[]={2,8,3,4,9,10,1,5};
       Quick_Sort(arr,0,arr.length-1);
       System.out.print(Arrays.toString(arr));
    }
}
