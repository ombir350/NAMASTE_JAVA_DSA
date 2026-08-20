public class reverse_num{
     public static int revnum(int num){
      int rev=0;
    while(num>0){
      int lastdigit=num%10;
      rev=rev*10+lastdigit;
      num=num/10;
      }
      return rev;
    }
    public static void main (String [] args){
        int num=1234;
        System.out.print(revnum(num));
    }
}