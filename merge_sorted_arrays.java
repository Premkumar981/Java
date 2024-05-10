class Main {
    public static void main(String[] args) {
        // Note: Don't change class name
        // your code goes here
    }
}

// Link: https://leetcode.com/problems/merge-sorted-array/

// Time: O(N + M)
// Space: O(N + M)

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        ArrayList<Integer> aux = new ArrayList<>();
        int i = 0, j = 0;

        // until both the arrays have some unresolved elements
        while(i < m && j < n) {
            if(nums1[i] < nums2[j]) {
                aux.add(nums1[i]);
                i++;
            }
            else { // nums2[j] <= nums1[i]
                aux.add(nums2[j]);
                j++;
            }
        }

        // exactly 1 out of the 2 arrays
        // will have some remaining elements.
        while(i < m) {
            aux.add(nums1[i]);
            i++;
        }

        while(j < n) {
            aux.add(nums2[j]);
            j++;
        }

        // Copy the elements from aux to nums1
        for(int id = 0; id < n + m; ++id)
            nums1[id] = aux.get(id);

    }
}