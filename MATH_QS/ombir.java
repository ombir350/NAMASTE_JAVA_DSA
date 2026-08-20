// import java.util.*; 
public class ombir{
  public static boolean prime_series(int num){
    for (int i=2; i<=Math.sqrt(num);i++){
      if (num%i==0){
       return false;
      } 
    }
    return true;
  }
  public static void main (String [] args){
   int num=25;
   for (int i=2; i<=num;i++){
    if (prime_series(i)==true){
       System.out.print(i+" ");
    }
   }
  }
}