public class reverse_number{
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
    public static void main (String[]args){
       int n=-123695;
       rev(n);
    //    int ans=rev(n,0);
       System.out.print(sum);
    }
}