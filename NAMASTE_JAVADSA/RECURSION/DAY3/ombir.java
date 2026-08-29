import java.util.ArrayList;
public class ombir{
    public static ArrayList<Integer> findAllindexs2(int[] arr,int target,int index){
        ArrayList<Integer> list=new ArrayList<>();
        if (index==arr.length){
            return list;
       }
       //thia will contain answer for function call only.
       if (arr[index]==target){
           list.add(index);
        }
    ArrayList<Integer> ansAllindex2=(findAllindexs2(arr,target,index+1));
     list.addAll(ansAllindex2);
     return list;
    }
    
    public static void main (String[]args){
        int arr[]={1,2,4,5,6,3,4,2,1};
        int target=4;
        System.out.print(findAllindexs2(arr,target,0));
    }
}