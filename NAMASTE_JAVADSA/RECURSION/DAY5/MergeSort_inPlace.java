import java.util.*;
// directly work(sort) of original array
public class MergeSort_inPlace{
    public static void merge_sort_inPlace(int arr[],int s,int e){
        if (e-s==1){
           return;
        }
        int mid =s+(e-s)/2;
        merge_sort_inPlace(arr,s,mid); 
        merge_sort_inPlace(arr,mid,e);
        merge_inPlace(arr,s,mid,e);
    }

    public static void merge_inPlace(int[]arr,int s,int m,int e){
        int mix[]=new int[e-s];
        int i=s;
        int j=m;
        int k=0;
        while(i<m && j<e){
            if (arr[i]<arr[j]){
                mix[k]=arr[i];
                i++;
            }else{
               mix[k]=arr[j];
               j++;
            }
            k++;
        }
        while(m>i){
            mix[k]=arr[i];
            i++;
            k++;
        }
        while(e>j){
            mix[k]=arr[j];
            j++;
            k++;
        }
        for (int l=0; l<mix.length;l++){
           arr[s+l]=mix[l];
        }
    }
    
    public static void main (String[]args){
        int arr[]={5,2,6,9,10,1,7,3,8};
        merge_sort_inPlace(arr,0,arr.length);
        System.out.print(Arrays.toString(arr));
    }
}
