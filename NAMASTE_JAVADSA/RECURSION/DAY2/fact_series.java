public class fact_series{
    public static int fact(int n){ 
        if (n<=1){
            return 1;
        }
        return n*fact(n-1);
    }
    public static void main (String[]args){
         int n=5;
         for (int i=1; i<=n; i++){
          System.out.print(" "+fact(i));
         }
    }
}