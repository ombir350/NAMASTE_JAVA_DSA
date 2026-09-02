import java.util.*;
public class SkipString2 {
    //create the ans variable in function body.
    public static String skip2(String up){
        if (up.isEmpty()){
            return "";
        }
        char ch=up.charAt(0);
        if (ch=='a'){
            return skip2(up.substring(1));
        }else{
           return ch+ skip2(up.substring(1));
        }
    }
    public static void main (String []args){
        String str="baccadh";
        System.out.print(skip2(str));
    }
}