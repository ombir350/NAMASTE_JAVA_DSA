// package DAY2;

public class funrev {
    public static void fun_rev(int n){
        if (n==0){
            return ;
        }
        fun_rev(n-1);
        System.out.print(" "+ n);
        
    }
    public static void main (String []args){
        fun_rev(5);
    }
}
