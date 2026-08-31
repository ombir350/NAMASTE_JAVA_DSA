package DAY4;
/*
*****
****
***
**
*
 */
public class trangle2 {
    public static void trangle(int row,int col){
        if (row==0){
            return;
        }
        if (row>col){
            System.out.print("*");
            trangle(row,col+1);
            
        }else{
            System.out.println();
            trangle(row-1,0);
           
        }
    }
    public static void main(String[]args){
      trangle(5,0);
    }
}
