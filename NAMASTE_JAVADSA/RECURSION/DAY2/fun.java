// package DAY2;

public class fun {
    public static void Fun(int n){
        if (n==0){
            return ;
        }
        System.out.print(" "+ n);
        Fun(n-1);
    }
    public static void main (String []args){
        Fun(5);
    }
}
