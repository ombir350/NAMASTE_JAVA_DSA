/*
LeetCode 875 : madium level Q.

Q. Koko loves to eat bananas. There are n piles of bananas, the ith pile has piles[i] bananas. The guards have gone and will come back in h hours.

Koko can decide her bananas-per-hour eating speed of k. Each hour, she chooses some pile of bananas and eats k bananas from that pile.
 If the pile has less than k bananas, she eats all of them instead and will not eat any more bananas during this hour.

Koko likes to eat slowly but still wants to finish eating all the bananas before the guards return.

Return the minimum integer k such that she can eat all the bananas within h hours.

Example 1 :                        Example 2 :               
input : piles[] = {3,6,7,11};      input : piles[] =[30,11,23,4,20],  h=6   
      int h = 8;                   output : 23.
output : 4.
 */

import java.util.*;
public class minEatingSpeed{
    public static int findmaximum(int[] piles){
        int maxi=Integer.MIN_VALUE;
        int n=piles.length;
        for (int i=0; i<n;i++){
          maxi=Math.max(piles[i],maxi);
        }
        return maxi;
    }

    public static int totalhours(int []piles, int hourly){
        int totalH=0;
        for (int i=0;i<piles.length;i++){
            totalH +=(double)(piles[i]+hourly-1)/(double)hourly;
        }
        return totalH;
    }
    public static int minEating_Speed(int[] piles, int h) {
        int start=0; 
        int end=findmaximum(piles);
        while(start<=end){
            int mid=start+(end-start)/2;
            int totalH=totalhours(piles,mid);
            if (totalH<=h){
                end=mid-1;
            }else{
                start=mid+1;
            }
        }
        return start;
    }
   public static void main(String[] args){
      int piles[] = {3,6,7,11};
      int h = 8;
      System.out.print(minEating_Speed(piles,h));
   }
}