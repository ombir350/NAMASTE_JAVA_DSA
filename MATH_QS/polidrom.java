public class polidrom{
     public static void polidrom(int num){
      int x=num;
      int rev=0;
    while(num>0){
      int lastdigit=num%10;
      rev=rev*10+lastdigit;
      num=num/10;
    }
    if (x==rev){
      System.out.print("given number is polidrom!");
    }else{
      System.out.print("given number is not polidrom!");
    }
    }
    public static void main (String [] args){
        int num=2112;
        polidrom(num);
    }
}