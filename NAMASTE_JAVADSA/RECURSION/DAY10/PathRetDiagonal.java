public class PathRetDiagonal{
    public static void pathRet_Diagonal(String p,int row,int col){
        if (row==1 && col==1){
         System.out.println(p);
          return;
        }
      if (row>1&&col>1){
         pathRet_Diagonal(p+'D',row-1,col-1);
      }
        
      if (row>1){
         pathRet_Diagonal(p+'V',row-1,col);
      }
      if (col>1){
        pathRet_Diagonal(p+'H',row,col-1);
      }
    }
    public static void main (String[]args){
       pathRet_Diagonal("",3,3); 
    }
}