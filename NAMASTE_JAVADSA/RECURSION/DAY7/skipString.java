import java.util.*;
public class skipString {
    //pass the ans string in argument.
    public static void skip(String p,String up){
        if (up.isEmpty()){
            System.out.print(p);
            return;
        }
        char ch=up.charAt(0);
        if (ch=='a'){
            skip(p,up.substring(1));
        }else{
           skip(p+ch,up.substring(1));
        }
    }
    public static void main (String []args){
        String str="baccadh";
         skip("",str);
    }
}