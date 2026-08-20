import java.util.*; 
public class binarysearch {
  public static int binary_search(int arr[],int key){
    int start=0;
    int end=arr.length-1;
    while(start<=end){
      int mid=(start+end)/2;
      if (arr[mid]==key){
        return mid;
      }
      if (key>arr[mid]){
        start=mid+1;
      }else{
        end=mid-1;
      }
    }
    return -1;
  }
  public static void main (String []args){
    int arr[]={23,54,32,35,13,56,75};
    int key=56;
    int index=binary_search(arr,key);
    System.out.print("key value at index : "+index);
    
  }
}