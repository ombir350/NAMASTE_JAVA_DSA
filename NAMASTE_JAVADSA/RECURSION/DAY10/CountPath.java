
public class CountPath {
    public static int count_path(int row,int col){
        if (row==1 || col==1){
            return 1;
        }
        int left=count_path(row-1,col);
        int right=count_path(row,col-1);
        return left+right;
    }
    public static void main (String[]args){
       System.out.print(count_path(3,3)); 
    }
}
