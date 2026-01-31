package leetcode;

import javax.swing.*;
import java.lang.reflect.ParameterizedType;
import java.util.*;

public class _735_Asteroid_Collision {
    public static  int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> st = new Stack<>();
        int n = asteroids.length ;
        for( int i = 0 ;i<n ; i++) {
            if (asteroids[i] > 0) {
                st.push(asteroids[i]);
            } else {
                while (!st.isEmpty() && st.peek() > 0 && st.peek() < Math.abs(asteroids[i])) {
                    st.pop();
                }
                if (!st.isEmpty() && st.peek() > 0 && st.peek() == Math.abs(asteroids[i])) {
                    st.pop();
                }
                if (st.isEmpty() || st.peek() < 0) {
                    st.push(asteroids[i]);
                }
            }

        }
        int[] ans = new int[st.size()];
        for (int i = 0; i < ans.length; i++) {
            ans[i] = st.get(i); // No need to pop, just read from bottom to top
        }
        return ans ;

    }
    public static void main(String[] args) {
        int arr [ ] = {5,10,-5};
        int ans[] = asteroidCollision(arr);
         for( int element : ans ){
             System.out.print(element +" ");
         }

    }
}
