import java.util.*;
public class ombir{
   public static int splitarray(int arr[],int k){
      int start=0;
      int end=0;
      for (int i=0;i<arr.length-1;i++){
         start=Math.max(arr[i],start);
         end=end+arr[i];
      }
      while(start<end){
         //calulate pieces.
       int mid=start+(end-start)/2;
       int pieces=1;
       int sum=0;
       for(int num : arr){
           if(num+sum>mid){
             sum=num;
             pieces ++;
            }else{
              sum +=num;
           }
       }
       if (pieces>k){
         start=mid+1;
       }else{
         end=mid;
       }
      }
      return end;
   }
   public static void main(String[] args){
      int arr[] = {7,2,5,10,8};
      int k = 2;
      System.out.print(splitarray(arr,k));
   }
}