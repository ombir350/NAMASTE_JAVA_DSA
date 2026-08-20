import java.util.*;
public class lenear_search_onString{
    // return boolean type like (true false) of the given array.
    public static boolean lenear_search_TF(String name ,char target){
       if(name.length()==0){
          return false;
       }
       for (int i=0;i<name.length(); i++){
        if (name.charAt(i)==target){
            return true;
        }
       }
       return false;
    }

    public static void main(String[] args){
        String name="ombir kumar";
        char target='i';
        System.out.println(lenear_search_TF(name,target));
        System.out.println(lenear_search_index(name,target));
        System.out.println(lenear_search_element(name,target));
        
    }
//return the index of the element from the given aaray where target element is meet in this aaray.
     public static int lenear_search_index(String name ,char target){
       if(name.length()==0){
          return -1;
       }
       for (int i=0;i<name.length(); i++){
        if (name.charAt(i)==target){
            return i;
        }
       }
       return -1;
    }
// for return element of the array by lenear search.
    public static char lenear_search_element(String name ,char target){
       if(name.length()==0){
          return 'o';
       }
       for (int i=0;i<name.length(); i++){
        char str= name.charAt(i);
        if (str==target){
            return str;
        }
       }
       return 'o';
    }
    
}