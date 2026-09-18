import java.util.ArrayList;

public class ombir {
    public static int CountPath_Diagonal(int row,int col){
        if (row==1 || col==1){
          return 1;
        }
         int diagonal=pathRet_Diagonal(row-1,col-1);
        int vartical= pathRet_Diagonal(row-1,col);
        int horigental=pathRet_Diagonal(row,col-1);
      return diagonal+vartical+horigental;
    }
    public static void main (String[]args){
       System.out.print(pathRet_Diagonal(3,3)); 
       
    }
}