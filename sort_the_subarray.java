import java.util.*;

class Main {
    public static void main(String[] args) {
        // Note: Don't change class name
        Scanner sc = new Scanner(System.in);

        // Input for N and K
        int N = sc.nextInt();

        // Input for the array
        int arr[] = new int[N];
        for(int i = 0; i < arr.length; ++i)
            arr[i] = sc.nextInt();

        Solution sol = new Solution();

        System.out.println(sol.findUnsortedSubarray(arr));

    }
}

// Time: O(N^2)
// Space: O(1)

class Solution {
    public int findUnsortedSubarray(int[] nums) {

        int n = nums.length;

        boolean pre[] = new boolean[n];
        boolean suf[] = new boolean[n];

        pre[0] = true;
        for(int i = 1; i < n; ++i)
            pre[i] = pre[i-1] && (nums[i] >= nums[i-1]);

        suf[n - 1] = true;
        for(int i = n - 2; i >= 0; --i)
            suf[i] = suf[i+1] && (nums[i] <= nums[i+1]);

            // Check for different subarrays now
        int ans = n;
        for(int i = 0; i < n; ++i) {
            int max_val = Integer.MIN_VALUE;
            int min_val = Integer.MAX_VALUE;
            for(int j = i; j < n; ++j) {
                max_val = Math.max(max_val, nums[j]);
                min_val = Math.min(min_val, nums[j]);

                boolean canSort = true;

                if(i > 0 && (pre[i-1] == false || min_val < nums[i-1]))
                    canSort = false;
                
                if(j < n - 1 && (suf[j+1] == false || max_val > nums[j+1]))
                    canSort = false;

                if(canSort) 
                    ans = Math.min(ans, j - i + 1);
            }
        }

        return ans == 1? 0 : ans;
    }
}