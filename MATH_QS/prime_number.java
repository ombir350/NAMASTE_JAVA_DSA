import java.util.*;
public class prime_number{
    public static int prime_number(int num){
     if (num==1){
      return -1;
     }
      else{
        for (int i=2;i<Math.sqrt(num); i++){
          if (num%i==0){
            return -1;
          }
        }
        return 1;
      }
    }
    public static void main (String [] args){
       int num=13;
       int result=prime_number(num);
       if (result==1){
        System.out.print("prime number!");
       }else{
        System.out.print(" not a prime number!");
       }
      
    }
  
}