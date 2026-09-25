public class SudocuSolver{
      public static boolean isSafe(char[][]board,int row, int col, int num){
        // to chaeck horogental (row is constant and column is change to every cell check).
        for (int j=0;j<9;j++){
            if (board[row][j]==num){
                return false;
            }
        }
        // to chaeck vertical (column is constant and row is change to every cell check).
        for (int i=0;i<9;i++){
            if (board[i][col]==num){
                return false;
            }
        }
        // check to 3*3 wale all boxes
        int Sqrt=(int)Math.sqrt(board.length);
        int startRow=row-row%Sqrt;
        int startColumn=col-col%Sqrt;
        for (int i=startRow;i<startRow+Sqrt;i++){
           for(int j=startColumn;j<startColumn+Sqrt;j++){
               if (board[i][j]==num){
                  return false;
                }
            }
        }
        return true;
    }
    
    public static boolean isEmptycell(char[][]board, int[] EmptyCell){
        for (int i=0;i<9;i++){
            for (int j=0;j<9;j++){
                if(board[i][j]== '.'){
                    // 0 at index pe row ki value put kr diya
                    EmptyCell[0]=i;
                    // 0 at index pe row ki value put kr diya 
                    EmptyCell[1]=j;
                   return true;
                }
            }
        }
        //kahi pe bhi emptycell nhi mila.
        return false;
    }

    public static boolean solveSudokuHelper(char[][]board){
        int[] EmptyCell=new int[2];
        if (!isEmptycell(board,EmptyCell)){
            return true;
        }

        int row=EmptyCell[0];
        int col=EmptyCell[1];

        for (int value=1; value<=9;value++){
            char charvalue=(char)(value+'0');
            //check the index safe or not.
            if (isSafe(board,row,col,charvalue)){
                // is safe than push value at perticuler row and col.
                board[row][col]=charvalue;
                //baki recursion sambhalega.
                if(solveSudokuHelper(board)==true){
                    return true;
                }
                //agr recursion nhi kr paya, wapas aa gya than 
                //current value ko undo kr do aur backtracking wala step kro 
                board[row][col]='.';
            }
        }
        // agr nhi solve hua question.
        return false;
    }

    public static void display(char[][] board){
        for (char[] row : board){
            for (char num : row){
                System.out.print(num+" ");
            }
            System.out.println();
        }
    }
    public static void main (String[]args){
       char[][] board = {
          {'5','3','.','.','7','.','.','.','.'},
          {'6','.','.','1','9','5','.','.','.'},
          {'.','9','8','.','.','.','.','6','.'},
          {'8','.','.','.','6','.','.','.','3'},
          {'4','.','.','8','.','3','.','.','1'},
          {'7','.','.','.','2','.','.','.','6'},
          {'.','6','.','.','.','.','2','8','.'},
          {'.','.','.','4','1','9','.','.','5'},
          {'.','.','.','.','8','.','.','7','9'}
        };
        if (solveSudokuHelper(board)){
            display(board);
        }else{
            System.out.println("can not display");
        }

    }
}