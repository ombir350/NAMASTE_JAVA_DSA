import java.util.*;
public class LetterCombinations {
    public static void letter_Combinations(String p, String up){
        if (up.isEmpty()){
            System.out.println(p);
            return ;
        }
        int digits=up.charAt(0)-'0';
        int start=((digits-2)*3);
        if (digits>=8){
            start++;
        }
        int end=start+3;
        if (digits==7 || digits==9 ){
            end++;
        }
        for (int i=start; i<end;i++ ){
            char ch=(char)('a'+i);
            letter_Combinations(p+ch,up.substring(1));
        }
    }

 public static void main(String[]args){
    letter_Combinations("","23");
 }
}
