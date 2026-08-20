public class maxsubarraysum{
   public static void maxsubarraysum(int arr[]){
        int currsum=0; 
        int maxsum=Integer.MIN_VALUE;

        for (int i=0; i<arr.length;i++){
            int start=i;
            for (int j=i; j<arr.length;j++){
                int end=j;
                currsum=0;
               for (int k=start; k<=end; k++){
                  currsum +=arr[k]; 
               }
               System.out.print(currsum );
               if (maxsum<currsum){
                  maxsum=currsum;
               }
            System.out.println();
            }
         }
      System.out.print("maximum sub array sum : "+maxsum);
   }
    public static void main (String args[]){
       int arr[]={2,4,6,8,10};
       maxsubarraysum(arr);
    }
}