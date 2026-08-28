public class Count_Zeroes{
    public static int count_zeroes(int n){
          return count_zeroes(n,0);
    }
    public static int count_zeroes(int n,int count){
        if (n==0){
            return count;
        }
        if (n>0){
          int rem=n%10;
          if (rem==0){    
              return count_zeroes(n/10,count+1);
            }
          }
        return count_zeroes(n/10,count);
    }
    public static void main (String[]args){
     int n=20340304;
     System.out.print(count_zeroes(n));
    }
}        