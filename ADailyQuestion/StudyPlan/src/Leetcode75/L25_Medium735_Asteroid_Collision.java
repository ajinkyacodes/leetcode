package Leetcode75;
/*
Link: https://leetcode.com/problems/asteroid-collision/description/
735. Asteroid Collision
Topic: Stack
 */
import java.util.*;
public class L25_Medium735_Asteroid_Collision {
    public static int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> st = new Stack<Integer>();

        for (int asteroid : asteroids) {
            boolean flag = true;
            while (!st.isEmpty() && (st.peek() > 0 && asteroid < 0)) {
                if (Math.abs(st.peek()) < Math.abs(asteroid)) {
                    st.pop();
                    continue;
                }
                else if (Math.abs(st.peek()) == Math.abs(asteroid)) {
                    st.pop();
                }

                flag = false;
                break;
            }

            if (flag) {
                st.push(asteroid);
            }
        }

        // Add the asteroids from the stack to the vector in the reverse order.
        int[] remainingAsteroids = new int[st.size()];
        for (int i = remainingAsteroids.length - 1; i >= 0; i--) {
            remainingAsteroids[i] = st.peek();
            st.pop();
        }

        return remainingAsteroids;
    }
    // Time = O(n)
    // Space = O(n)

    public static void main(String[] args) {
        int[] result1 = asteroidCollision(new int[]{5,10,-5});
        System.out.println(Arrays.toString(result1)); // [5,10]

        int[] result2 = asteroidCollision(new int[]{8,-8});
        System.out.println(Arrays.toString(result2)); // []

        int[] result3 = asteroidCollision(new int[]{10,2,-5});
        System.out.println(Arrays.toString(result3)); // [10]
    }
}
