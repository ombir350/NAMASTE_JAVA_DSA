import java.util.ArrayList;

public class PathRetDiagonal_Arr {
    public static ArrayList<String> pathRet_Diagonal(String p,int row,int col){
        if (row==1 && col==1){
          ArrayList<String> list=new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> list=new ArrayList<>();
      if (row>1&&col>1){
         list.addAll(pathRet_Diagonal(p+'D',row-1,col-1));
      }
        
      if (row>1){
         list.addAll(pathRet_Diagonal(p+'V',row-1,col));
      }
      if (col>1){
        list.addAll(pathRet_Diagonal(p+'H',row,col-1));
      }
       return list;
    }
    public static void main (String[]args){
       System.out.print(pathRet_Diagonal("",3,3)); 
    }
}
