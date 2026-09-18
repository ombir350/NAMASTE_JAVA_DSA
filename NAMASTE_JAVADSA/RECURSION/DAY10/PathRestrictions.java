import java.util.ArrayList;

public class PathRestrictions {
    public static void Path_Restrictions(String p,boolean maze[][],int row,int col){
        if (row==maze.length-1 && col==maze[0].length-1){
          System.out.println(p);
          return ;
        }
        if(!maze[row][col]){
          return;
        }
        if (row<maze.length-1){
            Path_Restrictions(p+'D',maze,row+1,col);
        }
        if(col<maze[0].length-1){
          Path_Restrictions(p+'R',maze,row,col+1);
        }
    }
    public static void main (String[]args){
      boolean [][] board={
        {true,true,true},
        {true,false,true},
        {true,true,true}
      } ;
       Path_Restrictions("",board,0,0);
    }
}