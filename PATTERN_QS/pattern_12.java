/*
QUESTION=12
      * 
    * * * 
  * * * * * 
* * * * * * * 
  * * * * * 
    * * * 
      * 
 */

public class pattern_12{
    public static void main(String[]args){
    int n=4;
    for (int row=1; row<=n;row++){
        for (int col=1; col<=n-row; col++){
            System.out.print("  ");
        }
        for (int col=1; col<=2*row-1;col++){
            System.out.print("* ");
        }
      System.out.println();
    }
    for (int row=1; row<=n;row++){
        if (row==1){
            continue;
        }
        for (int col=1; col<=row-1; col++){
            System.out.print("  ");
        }
        for (int col=1; col<=2*n-2*row+1;col++){
            System.out.print("* ");
        }
      System.out.println();
    }
   
    }
}