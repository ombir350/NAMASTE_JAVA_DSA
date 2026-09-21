import java.util.*;
public class N_Queens{
    public static void queens(boolean[][] board,int row){
        if (row==board.length){
            display(board);
            System.out.println();
            return;
        }
        for (int col=0;col<board.length;col++){
            if (isSafe(board,row,col)){
                //put the queen.
               board[row][col]=true;
               //solve next row.   
               queens(board, row + 1);
               //remove the queen.
               board[row][col]=false;
            }
        }
    }
    private static void display(boolean[][] board){
        for (boolean[] row:board){
            for (boolean element : row){
                if (element){
                    System.out.print("Q ");
                }else{
                    System.out.print("X ");
                }
            }
            System.out.println();
        }
    }
    //ye check krega board safe hai ya nhi.
    private static boolean isSafe(boolean[][] board,int row,int col){
        // check vertical.
        for (int i=0; i<row;i++){
            if (board[i][col]){
                return false;
            }
        }
        // check left Diagonal.
        int maxleft=Math.min(row,col);
        for (int i=1;i<=maxleft;i++){
            if (board[row-i][col-i]){
                return false;
            }
        }
        //check Right Diagonal.
        int maxright=Math.min(row,board.length-col-1);
        for (int i=1;i<=maxright;i++){
            if (board[row-i][col+i]){
                return false;
            }
        }
        return true;
    }
    public static void main(String[]args){
       int n=4;
       boolean[][] board=new boolean[n][n]; 
       queens(board,0);
    }
}