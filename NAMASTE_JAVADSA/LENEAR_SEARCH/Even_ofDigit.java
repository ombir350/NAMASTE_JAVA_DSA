import java.util.*;
// Q. Leetcode 1295:-Find Numbers with Even Number of Digits
public class ombir{
    public static int findNumbers(int[] arr){
        int count=0;
        for (int num : arr){
           if (even(num)){
            count++;
           }
        }
        return count;
    }
    public static void main (String[] args){
        int arr[]= {12,345,2,6,7896,654};
        System.out.print(findNumbers(arr));

    }
    public static boolean even(int num ){
          int numberofdigits=digit(num);
          if (numberofdigits%2==0){
            return true;
          }
          return false;
    }

    public static int digit(int num){
    int count=0;
    if (num<0){
        num=num*-1;
    }
    if (num==0){
        return 1;
    }
    while(num>0){
        count++;
        num=num/10;
    }
    return count;
    // return (int)(Math.log10(num)+1);
     }
    
}