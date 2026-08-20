
import java.util.*;
public class isprime{
    public static void main (String[] args){
     
     Scanner sc=new Scanner(System.in);
     System.out.print("enter the number to check prime or not : ");
     int number=sc.nextInt();
     boolean isprime=true;
     if (number==1){
      isprime=false;
     }
     if (number==2){
       isprime=true;
     }else{
      for (int i=2; i<=Math.sqrt(number);i++){
        if (number%i==0){
          isprime =false;
          break;
        }
        else{
          isprime=true;
        }
      }
      
     }
      if (isprime==true){
          System.out.print("entered your number is prime! ");
      }else{
        System.out.print("entered your number is not  prime! ");
      }
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              
    }
}