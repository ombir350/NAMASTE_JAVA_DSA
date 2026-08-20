public class ombir{
  public static void arrayPair(int arr[]){
    int tp=0;
      for (int i=0; i<arr.length;i++){
        int curr=arr[i];
        for (int j=i+1; j<arr.length;j++){
          System.out.print("("+curr+","+arr[j]+")");
          tp++;
        }
        System.out.println();
      }
     System.out.print("total no of pairs : "+tp);
  }
  public static void main(String [] args){
    int arr[]={33,43,65,32,56};
      arrayPair(arr);
  }
}