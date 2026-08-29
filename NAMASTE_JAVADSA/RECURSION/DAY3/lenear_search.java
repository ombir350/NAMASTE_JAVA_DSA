public class lenear_search {
    public static int search(int arr[],int index,int target){
        if (index==arr.length-1 && arr[index] != target){
            return -1;
        }
        if (arr[index]==target){
            return index;
        }
        return search(arr,index+1,target);  
    }
    public static void main (String[]args){
      int arr[]={13,24,435,65,7};
      System.out.print(search(arr,0,65));
    }
}