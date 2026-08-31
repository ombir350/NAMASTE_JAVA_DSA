package DAY4;
/*
*
**
***
****
*****
 */
public class trangle1 {
    public static void trangle(int row,int col){
        if (row==0){
            return;
        }
        if (row>col){
            trangle(row,col+1);
            System.out.print("*");
        }else{
            trangle(row-1,0);
            System.out.println();
        }
    }
    public static void main(String[]args){
      trangle(5,0);
    }
}
