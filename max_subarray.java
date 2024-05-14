import java.util.*;

class Main {
    public static void main(String[] args) {
        // Note: Don't change class name
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int arr[] = new int[N];

        for(int i = 0; i < arr.length; ++i)
            arr[i] = sc.nextInt();

        Solution sol = new Solution();

        System.out.println(sol.maxSubArray(arr));
    }
}

// The technique is called Kadane's Algorithm
// Time: O(N)
// Space: O(1)

class Solution {
    public int maxSubArray(int[] nums) {
        int cur_sum = 0, final_ans = Integer.MIN_VALUE;

        // Try to find the maximum subarray sum
        // out of all the subarrays ending at index i
        for(int i = 0; i < nums.length; ++i) {
            cur_sum += nums[i];
            final_ans = Math.max(final_ans, cur_sum);

            // If less than 0, the current window
            // can be discarded because it's not
            // going to help the future windows.
            if(cur_sum < 0)
                cur_sum = 0;
        }

        return final_ans;
    }
}