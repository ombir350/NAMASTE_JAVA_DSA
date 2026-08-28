public class polindrome_number{
    static int sum=0;
         public static void rev(int n){
        if (n==0){
            return;
        }
        if (n<0){
            n=n*-1;
        }
        if (n>0){
            int rem=n%10;
            sum = sum*10+rem;
            rev(n/10);
        }
        // return -1;
    }
    public static boolean palindrom(int n){
        if (n<0){
        n=n*-1;
       }
        rev(n);
        return n==sum;
    }
    public static void main (String[]args){
       int n=-1221;
    //    rev(n);
       System.out.print(palindrom(n));
    }
}