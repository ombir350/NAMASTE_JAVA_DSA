import java.util.ArrayList;

public class ombir {
    public static ArrayList<String> Path_Restrictions(String p,boolean maze[][],int row,int col){
        if (row==maze.length-1 && col==maze[0].length-1){
          ArrayList<String> list=new ArrayList<>();
          list.add(p);
          return list;
        }
        ArrayList<String> list=new ArrayList<>();
        if(!maze[row][col]){
          return list;
        }
        if (row<maze.length-1){
            list.addAll(Path_Restrictions(p+'D',maze,row+1,col));
        }
        if(col<maze[0].length-1){
          list.addAll(Path_Restrictions(p+'R',maze,row,col+1));
        }
        return list;
    }
    public static void main (String[]args){
      boolean [][] board={
        {true,true,true},
        {true,false,true},
        {true,true,true}
      } ;
       System.out.print(Path_Restrictions("",board,0,0));
    }
}