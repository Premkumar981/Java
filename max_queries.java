import java.util.*;

// Time: O(N + M)

class Main {
    public static void answerQueries(int arr[], int queries[]) {
        int N = arr.length, M = queries.length;
        int pre[] = new int[N];
        int suf[] = new int[N];

        // Fill up the pre array
        for(int i = 0; i < N; ++i)
            pre[i] = i == 0? arr[i] : Math.max(pre[i-1], arr[i]);
        
        // Fill up the suf array
        for(int i = N - 1; i >= 0; --i)
            suf[i] = i == N - 1? arr[i] : Math.max(suf[i+1], arr[i]);

        // Answer the queries
        for(int id : queries) {
            int ans;

            if(id == 0)
                ans = suf[id+1];
            else if(id == N - 1)
                ans = pre[id-1];
            else
                ans = Math.max(pre[id-1], suf[id+1]);

            System.out.println(ans);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(), M = sc.nextInt();

        int arr[] = new int[N];
        int queries[] = new int[M];

        for(int i = 0; i < N; ++i)
            arr[i] = sc.nextInt();

        for(int i = 0; i < M; ++i)
            queries[i] = sc.nextInt();

        answerQueries(arr, queries);
    }
}