public class sumofn{
    public static int sum_of_number(int n){ 
        if (n<=1){
            return 1;
        }
        return n+sum_of_number(n-1);
    }
    public static void main (String[]args){
         int n=5;
         int ans=sum_of_number(n);
         System.out.print(ans);
    }
}

