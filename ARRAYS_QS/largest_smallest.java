import java.util.*;
public class largest_smallest {
  public static int[] largest_smallest(int numbers[]){
    int largest=Integer.MIN_VALUE;
    int smallest=Integer.MAX_VALUE;

    for (int i=0; i<numbers.length;i++){
      if (largest<numbers[i]){
        largest=numbers[i];
      }
      if (smallest>numbers[i]){
        smallest=numbers[i];
      }
    }
    return new int[] {largest,smallest};
  }
    public static void main (String []args){
      int numbers[]={23,45,12,32,45,65,35};
      int result[]=largest_smallest(numbers);
        System.out.println("largest number is : "+result[0]);
        System.out.println("smallest number is : "+result[1]);
   
   
    }
}
