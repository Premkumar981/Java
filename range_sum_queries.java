import java.util.*;

class Main {
    public static void main(String[] args) {
        // Note: Don't change class name
        Scanner sc = new Scanner(System.in);

        // Input for N and Q
        int N = sc.nextInt();
        int Q = sc.nextInt();

        // Input for the array
        int arr[] = new int[N];
        for(int i = 0; i < arr.length; ++i)
            arr[i] = sc.nextInt();

        NumArray sol = new NumArray(arr);

        // Input the queries
        for(int i = 0; i < Q; ++i) {
            int l = sc.nextInt();
            int r = sc.nextInt();

            System.out.println(sol.sumRange(l, r));
        }

    }
}

// Precomputation: O(N)
// Time per query: O(1)
// Overall time: O(N + Q)
// Overall Space: O(N)
class NumArray {
    int preSum[];

    // Make the prefix sum array in the constructor
    public NumArray(int[] nums) {
        preSum = new int[nums.length];
        for(int i = 0; i < preSum.length; ++i)
            preSum[i] = i == 0? nums[0] : preSum[i - 1] + nums[i];
    }
    
    // Now, sum[l....r] is simply equal to preSum[r] - preSum[l-1]
    public int sumRange(int left, int right) {
        if(left == 0)
            return preSum[right];

        return preSum[right] - preSum[left - 1];
    }
}