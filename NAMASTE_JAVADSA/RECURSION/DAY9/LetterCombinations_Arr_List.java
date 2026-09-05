/*
String[] keypad = {
    "", "", "abc", "def", "ghi",
    "jkl", "mno", "pqrs", "tuv", "wxyz"
};
*/

import java.util.*;
public class LetterCombinations_Arr_List {
    public static ArrayList<String> letter_Combinations(String p, String up){
        if (up.isEmpty()){
            ArrayList<String> list=new ArrayList<>();
            list.add(p);
            return list;
        }
        int digits=up.charAt(0)-'0';
        ArrayList<String> list=new ArrayList<>();
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
             list.addAll(letter_Combinations(p+ch,up.substring(1)));
        }
        return list;
    }

 public static void main(String[]args){
    System.out.print(letter_Combinations("","9"));
 } 
}
