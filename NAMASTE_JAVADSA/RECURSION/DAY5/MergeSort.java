import java.util.*;
public class MergeSort{
    public static int[] merge_sort(int arr[]){
        if (arr.length==1){
           return arr;
        }
        int mid =arr.length/2;
        int left[]=merge_sort(Arrays.copyOfRange(arr,0,mid)); 
        int []right=merge_sort(Arrays.copyOfRange(arr,mid,arr.length));
        return merge(left,right);
    }

    public static int[] merge(int[]first, int[] second){
        int mix[]=new int[first.length + second.length];
        int i=0;
        int j=0;
        int k=0;
        while(i<first.length && j<second.length){
            if (first[i]<second[j]){
                mix[k]=first[i];
                i++;
            }else{
               mix[k]=second[j];
               j++;
            }
            k++;
        }
        while(first.length>i){
            mix[k]=first[i];
            i++;
            k++;
        }
        while(second.length>j){
            mix[k]=second[j];
            j++;
            k++;
        }
        return mix;
    }
    
    public static void main (String[]args){
        int arr[]={5,2,6,9,10,1,7,3,8};
        arr=merge_sort(arr);
        System.out.print(Arrays.toString(arr));
    }
}
