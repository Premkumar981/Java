import java.io.*;
import java.util.*;

// Link : https://www.geeksforgeeks.org/problems/minimum-difference-among-k/1
// Time : O(NLogN)

class Solution
{
    long minDiff(long arr[] ,int N,int K)
    {
        Arrays.sort(arr);
        long ans = Long.MAX_VALUE;
        
        for(int st = 0, en = K - 1; en < N; ++st, ++en)
            ans = Math.min(ans, arr[en] - arr[st]);
            
        return ans;
    }
}

class Array {

    // Driver Code
    public static void main (String[] args) throws IOException{
        // Taking input using buffered reader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int testcases = Integer.parseInt(br.readLine());
        // looping through all testcases
        while(testcases-- > 0){
            //int n=Integer.parseInt(br.readLine());
            String line = br.readLine();
            String[] a2 = line.trim().split("\\s+");
            int n =Integer.parseInt(a2[0]);
            int k =Integer.parseInt(a2[1]);
            String line1 = br.readLine();
            String[] a1 = line1.trim().split("\\s+");
            long a[]=new long[n];
            for(int  i=0;i<n;i++)
            {
                a[i]=Long.parseLong(a1[i]);
            }
            Solution ob=new Solution();
            //ArrayList<Long> ans=ob.smallestDifferenceTriplet(a,b,c,n);
            long ans=ob.minDiff(a,n,k);
            System.out.println(ans);
        }
    }
}