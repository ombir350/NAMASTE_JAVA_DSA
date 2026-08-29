import java.util.ArrayList;
public class Search_inList1{
    // One list → shared by all recursive calls.
    public static ArrayList<Integer> search(int[] arr,int target,int index, ArrayList<Integer> list){
        if (index==arr.length){
        return list;
    }
    if (arr[index]==target){
        list.add(index);
    }
    return search(arr,target,index+1,list);
    }
    
    public static void main (String[]args){
        int arr[]={1,2,4,5,6,3,4,2,1};
        int target=4;
        ArrayList<Integer> ans=search(arr,target,0,new ArrayList<>());
        System.out.print(ans);
    }
}
//time complexity=0(n);
//space complexity=0(n)+0(k)=0(n);