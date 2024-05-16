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

        System.out.println(sol.maximumDifference(arr));
    }
}

// Traversal keeping the min so far
// Time: O(N)
// Space: O(1)

class Solution {
    public int maximumDifference(int[] nums) {
        int ans = -1, min_till_now = Integer.MAX_VALUE;

        for(int num : nums) {
            if(min_till_now < num)
                ans = Math.max(ans, num - min_till_now);

            min_till_now = Math.min(min_till_now, num);
        }

        return ans;
    }
}