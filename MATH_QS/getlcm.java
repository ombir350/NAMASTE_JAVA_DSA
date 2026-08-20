import java.util.*;
public class getlcm{
    public static int GCD(int a, int b){ 
      while(b != 0){
        int orgb=b;
        b=a%b;
        a=orgb;
      } 
      return a;
    }
    public static int getlcm(int a,int b){
       int prod=a*b;
       int GCD=GCD(a,b);
       int lcm=prod/GCD;// formula of lcm=a*b/gcd(a,b).
       return lcm;
    }
    public static void main (String [] args){
      int a=18;
      int b=12;
      int ans=getlcm(a,b);
      System.out.print("Least Common Multiple(LCM). = "+ans); 
    } 
}