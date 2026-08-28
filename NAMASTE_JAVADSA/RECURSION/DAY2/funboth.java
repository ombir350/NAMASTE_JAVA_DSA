// package DAY2;

public class funboth {
    public static void fun_both(int n){
        if (n==0){
            return ;
        }
        System.out.print(" "+ n);
        fun_both(n-1);
        System.out.print(" "+ n);
    }
    public static void main (String []args){
        fun_both(5);
    }
}
