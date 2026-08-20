import java.util.*;
public class insertionSearch {
    public static int insertionsearch (int arr[], int key ){
        for (int i=0; i<arr.length; i++){
          if (arr[i]==key){
            return i;
          }
        }
        return -1;
    }
    public static void main (String []args){
        int arr[]={23,43,54,10,75,68,35};
        int key=10;
        int index=insertionsearch(arr,key);
          if (index==-1){
              System.out.print("not faund");
          }else{
            System.out.print("found at index "+index);
          }
    }
}
