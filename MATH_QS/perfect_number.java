// import java.util.*; 
public class perfect_number{
  public static boolean perfectnumber(int num){
  int sum=0;
  int org=num;
  for (int i=1;i<=num/2;i++){
    if (num%i==0){
      sum=sum+i;
    }
  }
  if (sum==org){
    return true;
  }
  return false;
  }
  public static void main (String [] args){
    int num=8128;
    // int ans=armstrong(num);
    if (perfectnumber(num)){
      System.out.print("given number is perfect number!");
    }else {
      System.out.print("given number is not a perfect number!");
    }
  }
}