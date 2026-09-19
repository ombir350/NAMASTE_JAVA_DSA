import java.util.ArrayList;

public class AllPath_Arr {
    public static ArrayList<String> All_Path(String p,boolean maze[][],int row,int col){
        if (row==maze.length-1 && col==maze[0].length-1){
          ArrayList<String> list=new ArrayList<>();
          list.add(p);
          return list;
        }
        ArrayList<String> list=new ArrayList<>();
        if(!maze[row][col]){
          return list;
        }
        maze[row][col]=false;
        if (row<maze.length-1){
            list.addAll(Path_Restrictions(p+'D',maze,row+1,col));
        }
        if(col<maze[0].length-1){
          list.addAll(Path_Restrictions(p+'R',maze,row,col+1));
        }
        if (row>0){
          list.addAll(Path_Restrictions(p+'U',maze,row-1,col));
        }
        if (col>0){
          list.addAll(Path_Restrictions(p+'L',maze,row,col-1));
        }
        maze[row][col]=true;
        return list;
    }
    public static void main (String[]args){
      boolean [][] board={
        {true,true,true},
        {true,true,true},
        {true,true,true}
      } ;
       System.out.print(Path_Restrictions("",board,0,0));
    }
}