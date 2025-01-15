package Leetcode75;
/*
Link: https://leetcode.com/problems/can-place-flowers/description/
605. Can Place Flowers
Topics: Array, Greedy
 */
public class L04_Easy605_Can_Place_Flowers {
    public static boolean canPlaceFlowers(int[] flowerbed, int n) {
        if(n==0) return true;
        int len = flowerbed.length;
        int count = 0;
        for(int i=0; i<len; i++) {
            if(flowerbed[i]==0) {
                if((i==0 || flowerbed[i-1]==0) && (i==len-1 || flowerbed[i+1]==0)) {
                    count++;
                    if(count==n){
                        return true;
                    }
                    i++;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] flowerbed = {1,0,0,0,1};
        int n = 1;
        System.out.println(canPlaceFlowers(flowerbed, n)); // true
        System.out.println(canPlaceFlowers(new int[]{1,0,0,0,1}, 2)); // false
    }
}
