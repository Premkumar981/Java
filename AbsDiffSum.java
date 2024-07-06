import java.util.*;

// Link : https://leetcode.com/problems/sum-of-absolute-differences-in-a-sorted-array/ 
// Time : O(N)

class Solution {
    public int[] getSumAbsoluteDifferences(int[] arr) {
        int leftSum = 0, totalSum = 0, n = arr.length;

        for(int num : arr)
            totalSum += num;

        int ans[] = new int[n];

        for(int i = 0; i < n; ++i) {
            // leftSum will be sum(arr[0] .. arr[i-1])
            int leftTotalAns = i*arr[i] - leftSum;

            // Add arr[i] to leftSum now
            leftSum += arr[i];

            // We can simply get
            // rightSum i.e. sum(arr[i+1] .. arr[n-1])
            int rightSum = totalSum - leftSum;

            int rightTotalAns = rightSum - (n-i-1)*arr[i];

            ans[i] = leftTotalAns + rightTotalAns;
        }

        return ans;
    }
}

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int arr[] = new int[N];

        for(int i = 0; i < N; ++i)
            arr[i] = sc.nextInt();

        Solution obj = new Solution();

        System.out.println(Arrays.toString(obj.getSumAbsoluteDifferences(arr)));
    }
}