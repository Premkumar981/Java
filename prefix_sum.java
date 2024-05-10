class Main {
    public static void main(String[] args) {
        // Note: Don't change class name
        // your code goes here
    }
}

// Link: https://leetcode.com/problems/running-sum-of-1d-array/
// Time: O(N)

class Solution {
    public:
        vector<int> runningSum(vector<int>& nums) {
            vector<int> ans(nums.size());
    
            for(int i = 0; i < nums.size(); ++i) {
                // nums[0] + nums[1] ... nums[i-1] + nums[i]
                // ans[i] = ans[i-1] + nums[i]
    
                ans[i] = i == 0? nums[i] : ans[i-1] + nums[i];
    
                // if(i == 0)
                //     ans[i] = nums[i];
                // else
                //     ans[i] = ans[i-1] + nums[i];
            }
    
            return ans;
        }
    };