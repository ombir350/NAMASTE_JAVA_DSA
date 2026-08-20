public class ombir{
  public static void sumdigits(int num){
    int sum=0;
    int i=0;
  while(num>0){
    int digits=num%10;
    sum=sum+digits;
    num=num/10;
    i++;
  }
  
  System.out.print(sum);
  }
  public static void main (String[] args){
    int num=1234;
    sumdigits(num);

  }
}
// public class ombir{
//   public static void main(String[] args) {
//     int sum=0;
//    for (int i=1; i<=5; i++){
//     sum=sum+i;
//    }
//    System.out.print("sum of the digits : "+sum);
//   }
// }