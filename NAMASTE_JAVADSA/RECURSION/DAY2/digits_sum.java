public class digits_sum {
    public static int sum_of_digit(int number){
        if (number==0){
            return 0;
        }
        if (number==1){
            return 1;
        }
        if (number<0){
           number=number*(-1);
        }
        return sum_of_digit(number/10)+number%10;
    }
    public static void main (String[]args){
       int number=-26345;
       System.out.print(sum_of_digit(number));
    }
}
