
import java.util.*;
public class calculator{
    public static void main (String[] args){
      Scanner sc= new Scanner(System.in);
      System.out.print("entter the value of a : ");
      int a=sc.nextInt(); 
      System.out.print("entter the value of b : ");
      int b=sc.nextInt();
      System.out.print("entter the value of charactor such as (+,-,*,/,%) : ");
      String charactor=sc.next();
      switch (charactor){
        case "+" : System.out.print(a+b);
        break;
        case "-" : System.out.print(a-b);
        break;
        case "*" : System.out.print(a*b);
              break;
        case "/" : System.out.print(a/b);
        break;
        case "%" : System.out.print(a%b);
        break;
        default : System.out.print("invalid charactor"); 
      }
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              
    }
}