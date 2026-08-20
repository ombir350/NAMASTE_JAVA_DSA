import java.util.*;
public class ombir{
    public static boolean palidrome(String str){
        if (str==null || str.length()==0){
            return true;
        }
        for (int i=0;i<str.length()/2;i++){
            char start=str.charAt(i);
            char end=str.charAt(str.length()-1-i);
            if(start!=end){
                return false;
            }
        }
        return true;
    }
    public static void main(String[]args){
        float num=6.234243f;
        int num2[]={2,34,23};
        int num1[]={23,243,435,46};
        System.out.println(Arrays.toString(num2));
        System.out.println(num1);
        
        //oprators.
        System.out.println("a"+'a');  // aa
        System.out.println('a'+'a');   // 194 : sky value added of both charactor
        System.out.println("a"+"a");   // aa
        System.out.println('a'+1);  //  98 : sky value+1 : 97+1
        System.out.println("a"+1);  //a1 : same aas after few steps : "a"+"1" 
        System.out.println((char)('a'+3));  // d : a+3 =d

       System.out.println("ombir"+new ArrayList<>()); // ombir[]
       System.out.println("ombir"+new Integer(50)); //ombir50
       System.out.println(new Integer(50)+" "+new ArrayList<>()); //50[]

       String series="";
       for (int i=0;i<26;i++){
         char ans=((char)('a'+i));
         series=series+ans;
         System.out.println(series);
       }
       

       StringBuilder builder=new StringBuilder();
       for (int i=0;i<26;i++){
         char ans=((char)('a'+i));
         builder.append(ans);
         System.out.println(builder.toString());
       }
        

    String str="abccba";
    System.out.print(palidrome(str));

    } 
}