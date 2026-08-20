public class subarray{
    public static void subarray(int arr[]){
        int tp=0;
       for (int i=0; i<arr.length;i++){
         int start=i;
         
          for (int j=i; j<arr.length;j++){
             int end=j;
                for (int k=start; k<=end; k++){
                  System.out.print(arr[k]+" ");
                }
             tp++;
             System.out.println();
            }
         System.out.println();
       }
       System.out.print("total numbers of sub arrays : "+tp);
    }
    public static void main (String args[]){
       int arr[]={23,43,65,78,8};
       subarray(arr);
    }
}