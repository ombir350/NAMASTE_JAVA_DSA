import java.util.*;
public class factorial{
  public static void main (String[]args){
   int fact=1;
   Scanner sc=new Scanner (System.in);
   int n=sc.nextInt();
   for (int i=1; i<=n;i++){
     fact=i*fact;   
    }
    System.out.print("factorial number is : "+fact); 
  }
          
}