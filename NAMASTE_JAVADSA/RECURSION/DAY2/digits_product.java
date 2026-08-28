public class digits_product {
    public static int product_of_digits(int number){
        if (number%10==number){
            return number;
        }
        if (number<0){
           number=number*(-1);
        }
        return number%10*product_of_digits(number/10);
    }
    public static void main (String[]args){
       int number=2345;
       System.out.print(product_of_digits(number));
    }
}
