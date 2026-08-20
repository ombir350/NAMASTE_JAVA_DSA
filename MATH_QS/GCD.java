/*
GCD(Greatest Common Divisor) of two number.
a=18,b=12
a=1,2,3,6
b=1,2,3,4,6
comon divider=6 so, need to find HCF. 
GCD formula=GCD(a,b)
            GCD(b,a%b);
            (where, HCF=GCD).
 */ 
import java.util.*;
public class GCD{
    public static int GCD(int a, int b){
      
      while(b != 0){
        int orgb=b;
        b=a%b;
        a=orgb;
      }
      
      return a;
    }
    public static void main (String [] args){
      int a=18;
      int b=12;
      int ans=GCD(a,b);
      System.out.print("Greatest Common Divisor = "+ans); 
    } 
}