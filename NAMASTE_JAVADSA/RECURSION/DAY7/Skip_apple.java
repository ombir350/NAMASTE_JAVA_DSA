import java.util.*;
public class Skip_apple {
    //create the ans variable in function body.
    public static String skip2(String up){
        if (up.isEmpty()){
            return "";
        }
        if (up.startsWith("apple")){
            return skip2(up.substring(5));
        }else{
           return up.charAt(0)+ skip2(up.substring(1));
        }
    }
    public static void main (String []args){
        String str="bpacappledha";
        System.out.println(skip2(str));
    }
}