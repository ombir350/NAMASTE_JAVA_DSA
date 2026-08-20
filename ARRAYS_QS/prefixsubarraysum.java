import java.util.*;
public class prefixsubarraysum{
   public static void maxprefixsum(int arr[]){
      int currsum=0;
      int prefix[]=new int[arr.length];
      int maxsum=Integer.MIN_VALUE;
      prefix[0]=arr[0];
      for (int i=1;i<arr.length;i++){
         prefix[i]=prefix[i-1]+arr[i];
      }
      for (int i=0; i<arr.length;i++){
         int start=i;
         for (int j=i; j<arr.length;j++){
            int end=j;
            if (start==0){
             currsum=prefix[end];
            }else{
              currsum=prefix[end]-prefix[start-1];
            }
            if(maxsum<currsum){
               maxsum=currsum;
            }
         }  
      }
      System.out.print("maximum sub-array sum  sum : "+maxsum); 
   }
    public static void main (String args[]){
      int arr[]={1,-2,6,-1,3};
      maxprefixsum(arr);
    }
}