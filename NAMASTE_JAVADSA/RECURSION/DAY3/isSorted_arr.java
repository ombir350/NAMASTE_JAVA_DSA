 package DAY3;

public class isSorted_arr {

    public static boolean isSorted(int arr[],int index){
        if (index==arr.length-1){
            return true;
        }
        return (arr[index]<=arr[index+1] && sorted(arr,index+1));
    }
    public static void main (String[]args){
      int arr[]={12,32,33,54,65,67};
      System.out.print(isSorted(arr,0));
    }
}

