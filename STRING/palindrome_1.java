//check String palindrome or not using swapping method.
import java.util.*;
public class palindrome_1{
    public static boolean palindrome(String str){
        String x=str;
        char[] arr=str.toCharArray();
        int start=0;
        int end=arr.length-1;
        for (int i=0;i<str.length()/2;i++){
            char temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start ++;
            end--;
        }
        str=new String(arr);
        if (x.equals(str)){
            return true;
        }
        return false;
    }
    public static void main(String[]args){
      String str="acca";
      System.out.print(palindrome(str));
    }
}