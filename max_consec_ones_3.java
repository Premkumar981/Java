import java.util.*;

class Main {
    public static void main(String[] args) {
        // Note: Don't change class name
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int arr[] = new int[N];

        for(int i = 0; i < arr.length; ++i)
            arr[i] = sc.nextInt();

        Solution sol = new Solution();

        System.out.println(sol.longestOnes(arr, K));
    }
}

// Sliding window with variable size
// Time: O(N)
// Space: O(1)

class Solution {
    public int longestOnes(int[] nums, int k) {
        int zeroCount = 0, start = 0, ans = 0;

        for(int end = 0; end < nums.length; ++end) {
            if(nums[end] == 0)
                zeroCount++;
            while(zeroCount > k) {
                if(nums[start] == 0)
                    zeroCount--;
                start++;
            }
            ans = Math.max(ans, end - start + 1);
        }
        return ans;
    }
}