// Link: https://www.geeksforgeeks.org/problems/searching-a-number0324/1

import java.io.*;
import java.util.*;

class Main {
    // Driver code
    public static void main(String[] args) throws Exception {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            String[] str = br.readLine().trim().split(" ");
            int n = Integer.parseInt(str[0]);
            int k = Integer.parseInt(str[1]);
            str = br.readLine().trim().split(" ");
            int arr[] = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(str[i]);
            }

            int ans = new Solution().search(arr, n, k);

            System.out.println(ans);
        }
    }
}

// User function Template for Java

// Time: O(N)
// Space: O(LogN)

class Solution {
    int searchHelper(int arr[], int st, int en, int k) {
        if(st > en)
            return -1;
            
        if(st == en)
            return arr[st] == k? st : -1;
        
        int mid = (st + en)/2;    
        int firstHalf = searchHelper(arr, st, mid, k);
        
        if(firstHalf != -1)
            return firstHalf;
            
        int secondHalf = searchHelper(arr, mid + 1, en, k);
        
        return secondHalf;
    }
    
    public int search(int arr[], int n, int k) {
        int ans = searchHelper(arr, 0, n - 1, k);
        return ans == -1? ans : ans + 1; // convert 0-based to 1-based.
    }
}