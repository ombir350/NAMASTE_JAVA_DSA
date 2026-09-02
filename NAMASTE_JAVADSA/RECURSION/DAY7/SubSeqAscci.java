public class ombir{
    public static void subseq(String p,String up){
         if (up.isEmpty()){
            System.out.println(p);
            return ;
        }
        char ch=up.charAt(0);
        subseq(p+(ch+0),up.substring(1));
        subseq(p,up.substring(1));
    }
    public static void main (String []args){
        String str="abc";
        subseq("",str);
    }
}