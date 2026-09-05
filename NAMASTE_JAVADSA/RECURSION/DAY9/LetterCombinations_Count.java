import java.util.*;
public class LetterCombinations_Count {
    public static int letter_Combinations(String p, String up){
        if (up.isEmpty()){
            return 1;
        }
        int count=0;
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
             count=count+(letter_Combinations(p+ch,up.substring(1)));
        }
        return count;
    }

 public static void main(String[]args){
    System.out.print(letter_Combinations("","23"));
 }  
}

