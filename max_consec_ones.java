import java.util.*;

class Main {
    public static void main(String[] args) {
        // Note: Don't change class name
        // your code goes here
    }
}

class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int final_ans = 0, cur_ones = 0;

        for(int num : nums) {
            if(num == 0)
                cur_ones = 0;
            else // the value of num will be 1
                cur_ones += 1;
            final_ans = Math.max(final_ans, cur_ones);
        }

        return final_ans;
    }
}