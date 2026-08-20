public class  nextGreatestLetter{
  public static char next_Greatest_Letter(char[] letters, char target) {
        int start=0;
        int end=letters.length-1;
        while(start<=end){
           int mid=start+(end-start)/2;
           if (target<letters[mid]){
            end=mid-1;
           }else{
            start=mid+1;      
           }
        }
      return letters[start%letters.length];
    }
  public static void main (String[]args){
    char letters[]={'c','f','j'}; 
    char target = 'h';
    // char letters[]={'x','x','y','y'}; 
    // char target = 'z';   // output = x
    System.out.print(next_Greatest_Letter(letters,target));
  }
   
}