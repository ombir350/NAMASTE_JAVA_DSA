public class avgArray{
    public static void main (String [] args){
        int arr[]={23,12,43,45,21,43};
        int sum=0;
        int avg;
        for (int i=0; i<arr.length; i++){
            sum += arr[i];
        }
        avg =  sum / arr.length;
        System.out.print("avg of an array : "+avg);
       
    }
}