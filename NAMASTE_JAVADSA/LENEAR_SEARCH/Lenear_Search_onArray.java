public class Lenear_search_onArray {
    //return the index of the element from the given aaray where target element is meet in this aaray.
    public static int lenear_search_getindex(int arr[], int target ){
        if (arr.length==0){
            return -1;
        }
       for (int i=0; i<arr.length;i++){
        if (arr[i]==target){
            return i;
        }
       }
       return -1;
    }
    // this is main funtion where call the function to exexute code.
    public static void main (String args[]){
        int arr[]={23,34,54,34,56,54,66};
        int target=56;
        System.out.println(lenear_search_getindex(arr,target));
        System.out.println(lenear_search_getTF(arr,target));
        System.out.println(lenear_search_getvalue(arr,target));
    }
// return boolean type like (true false) of the given array.
     public static boolean  lenear_search_getTF(int arr[], int target ){
        if (arr.length==0){
            return false;
        }
       for (int i=0; i<arr.length;i++){
        if (arr[i]==target){
            return true;
        }
       }
       return false;
    }
// for return element of the array by lenear search.
    public static int  lenear_search_getvalue(int arr[], int target ){
        if (arr.length==0){
            return -1;
        }
       for (int i=0; i<arr.length;i++){
        int element=arr[i];
        if (element==target){
            return element;
        }
       }
       return -1;
    }
    
    
}

