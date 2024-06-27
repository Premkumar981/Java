import java.util.*;
import java.lang.*;
import java.io.*;

// Link: https://www.codechef.com/SNCKQL19/problems/QUALPREL
// Time : O(NLogN)

class Codechef {
    public static int numTeams(Integer arr[], int k) {
        Arrays.sort(arr, Collections.reverseOrder());

        int ans = 0;
        
        for(int i = 0; i < arr.length; ++i)
            if(arr[i] >= arr[k - 1])
                ans++;

        // id will point to the first team
        // that has score less than arr[k - 1]
        // therefore, qualified team -> [0, id)
        return ans;
    }

    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);

        int tests = sc.nextInt();

        while(tests > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            Integer arr[] = new Integer[n];

            for(int i = 0; i < n; ++i)
                arr[i] = sc.nextInt();

            System.out.println(numTeams(arr, k));

            tests--;
        }
    }
}