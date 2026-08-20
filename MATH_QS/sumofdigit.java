public class sumofdigit{
  public static void sumdigits(int num){
    int sum=0;
  while(num>0){
    int digits=num%10;
    sum=sum+digits;
    num=num/10;
  }
  
  System.out.print(sum);
  }
  public static void main (String[] args){
    int num=1234;
    sumdigits(num);

  }
}
