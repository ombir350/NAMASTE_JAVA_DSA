public class fibonacci_series{
    public static int fabo(int n){
        if (n<2){
            return n;
        }
        return fabo(n-1)+fabo(n-2);
    }
    public static void main (String[]args){
        int n=7;
     for (int i=0; i<=n;i++){
        System.out.print(" "+fabo(i)); //output 13.
     }
    }
}