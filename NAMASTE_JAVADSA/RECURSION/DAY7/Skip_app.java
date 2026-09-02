import java.util.*;
public class Skip_app{
    public static void main (String []args){
        String str="bpacappledht";
        System.out.println(skip(str));
    }
    public static String skip(String up){
        if (up.isEmpty()){
            return "";
        }
        if (up.startsWith("app")){
            return skip(up.substring(3));
        }else{
           return up.charAt(0)+ skip(up.substring(1));
        }
    }
}