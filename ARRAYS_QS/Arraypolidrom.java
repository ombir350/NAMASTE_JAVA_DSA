import java.util.*;
public class Arraypolidrom{
  public static void main (String[]args){
    int arr[]={23,24,24,23};
    int arr1[]=arr.clone();
    int start=0;
    int end =arr.length-1;
    while(start<end){
      int temp=arr[start];
      arr[start]=arr[end];
      arr[end]=temp;
      start++;
      end--;
    }
    if (Arrays.equals(arr,arr1)){
      System.out.print("polidrome");
    }else{
      System.out.print("not polidrom!");
    }
  }
}