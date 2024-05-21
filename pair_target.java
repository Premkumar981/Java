import java.util.*;

class Main {
    public static void main(String[] args) {
        // Note: Don't change class name
        Scanner sc = new Scanner(System.in);

        // Input for N and K
        int N = sc.nextInt();
        int target = sc.nextInt();

        // Input for the array
        int arr[] = new int[N];
        for(int i = 0; i < arr.length; ++i)
            arr[i] = sc.nextInt();

        Solution sol = new Solution();

        System.out.println(sol.hasArrayTwoCandidates(arr, N, target));

    }
}

class Solution {
    boolean hasArrayTwoCandidates(int arr[], int n, int x) {
        // code here
        boolean found[] = new boolean[100001];
        
        for(int i = 0; i < n; ++i) {
            int req_num = x - arr[i];
            if(req_num >= 1 && req_num <= 100000 && found[req_num])
                return true;
            found[arr[i]] = true;
        }
        return false;
    }
}