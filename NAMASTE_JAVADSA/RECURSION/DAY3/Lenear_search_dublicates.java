import java.util.*;
public class Lenear_search_dublicates{
    public static ArrayList<Integer> list= new ArrayList<>();
    public static void search(int arr[],int index,int target){
        if (index==arr.length-1 && arr[index] != target){
            return ;
        }
        if (arr[index]==target){
            list.add(index);
        }
        search(arr,index+1,target);
        
    }
    public static void main (String[]args){
    
      int arr[]={13,24,35,65,35,7};
      search(arr,0,35);
      System.out.print(list);
    }
}

