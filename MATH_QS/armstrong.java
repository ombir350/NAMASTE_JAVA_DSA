public class armstrong{
  public static boolean armstrong(int num){
    int sum=0;
    int org=num;
    while(num>0){
      int digit=num%10;
      int cubeofdigit=(int)Math.pow(digit,3); //or, cubeofdigit=digit*digit*digit.
      sum=sum+cubeofdigit;
      num=num/10;
    }
    if (sum==org){
      return true;
    }
    return false;
  }
  public static void main (String [] args){
    int num=153;
    // int ans=armstrong(num);
    if (armstrong(num)){
      System.out.print("given number is armstrong!");
    }else {
      System.out.print("given number is not a armstrong!");
    }
  }
}