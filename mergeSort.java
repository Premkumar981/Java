import java.util.*;

class Main {
    public static void main(String[] args) {
        // Note: Don't change class name
        // your code goes here
    }
}

class Solution {
    public int[] merge2SortedArrays(int left[], int right[]) {
        int i = 0, j = 0, k = 0;
        int ans[] = new int[left.length + right.length];

        while(i < left.length && j < right.length) {
            if(left[i] <= right[j]) {
                ans[k] = left[i];
                i++;
            }
            else {
                ans[k] = right[j];
                j++;
            }
            k++;
        }

        // remaining elements to be pushed from left
        while(i < left.length) {
            ans[k] = left[i];
            i++;
            k++;
        }

        // remaining elements to be pushed from right
        while(j < right.length) {
            ans[k] = right[j];
            j++;
            k++;
        }

        return ans;
    }

    public int[] sortArray(int[] nums) {
        int n = nums.length;
        // base case
        if(n == 1)
            return nums;

        int left[] = Arrays.copyOfRange(nums, 0, n/2); // [0, n/2)
        int right[] = Arrays.copyOfRange(nums, n/2, n); // [n/2, n)

        left = sortArray(left); // recursive call to sort left half
        right = sortArray(right); // recursive call to sort right half

        return merge2SortedArrays(left, right);
    }
}