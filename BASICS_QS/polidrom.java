
import java.util.*;
public class polidrom{
    public static void main (String[] args){
     int n=1121;
     int x=n;
     int rev=0;
     while(n>0){
      int lastdigit=n%10;
      rev=rev*10+lastdigit;
      n=n/10;
     }
     if (rev==x){
      System.out.print("polidrom");
     }else{
       System.out.println("not polidrom!");
     }
     System.out.println("reverse number is : "+rev);
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              
    }
}