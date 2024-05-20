import java.util.*;

class Main {
    public static void main(String[] args) {
        // Note: Don't change class name
        Scanner sc = new Scanner(System.in);

        // Input for N and K
        int N = sc.nextInt();
        int K = sc.nextInt();

        // Input for the array
        int arr[] = new int[N];
        for(int i = 0; i < arr.length; ++i)
            arr[i] = sc.nextInt();

        Solution sol = new Solution();

        sol.rotate(arr, K);

        // Print it now
        for(int num : arr)
            System.out.print(num + " ");

    }
}

// Time: O(N)
// Space: O(K)
class Solution {
    public void rotate(int[] nums, int k) {

        // Bring k value to less than nums.length
        k %= nums.length;
        
        // Save the last K numbers to
        // another temporary array
        ArrayList<Integer> temp = new ArrayList<>();
        for(int i = nums.length - k; i < nums.length; ++i)
            temp.add(nums[i]);

        // Shift each of the other elements
        // k places towards right
        for(int i = nums.length - 1; i >= k; --i)
            nums[i] = nums[i - k];

        // Put back the temporarily stored k elements
        for(int i = 0; i < k; ++i)
            nums[i] = temp.get(i);
    }
}