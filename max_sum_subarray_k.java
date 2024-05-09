class Main {
    public static void main(String[] args) {
        // Note: Don't change class name
        // your code goes here
    }
}

//User function Template for Java
class Solution {
    static long maximumSumSubarray(int k, ArrayList<Integer> arr,int n){
        long curSum = 0;
        
        // find the sum for the leftmost subarray of size k.
        for(int i = 0; i < k; i++) // [0, k-1]
            curSum += arr.get(i);
            
        long finalAns = curSum;
        
        for(int st = 1, en = k; en < n; st++, en++) { // N - k
            // coming from [0, k-1]
            // [1, k] -> [2, k+1], [3, k+2] .... [n - k, n-1]
            
            // [st, en]
            // curSum stores the sum for the subarray [st-1, en-1];
            curSum -= arr.get(st-1); // remove the involvement of arr[st-1]
            curSum += arr.get(en); // Add the involvement of arr[en]
            
            finalAns = Math.max(finalAns, curSum);
        }
        
        /*
        [3, 9] -> [4, 10]
        st = 4, en = 10;
        st-1 => 3, en-1 => 9;
        */
        return finalAns;
    } // O(N) time.
}