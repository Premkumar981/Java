import java.util.Scanner;

public class matrix_mul {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        int m1[][] = new int[A][B];
        int m2[][] = new int[B][C];

        // A*B with B*C  ==> A*C
        int ans[][] = new int[A][C];

        // take input for m1
        for(int i = 0; i < A; ++i)
            for(int j = 0; j < B; ++j)
                m1[i][j] = sc.nextInt();

        // take input for m2
        for(int i = 0; i < B; ++i)
            for(int j = 0; j < C; ++j)
                m2[i][j] = sc.nextInt();


        // Find the elements of the ans.
        for(int i = 0; i < A; ++i)
            for(int j = 0; j < C; ++j) {

                // Calculate ans[i][j]
                int cur = 0;
                for(int k = 0; k < B; ++k)
                    cur += m1[i][k]*m2[k][j];
                
                ans[i][j] = cur;
            }

        // Print the answer matrix
        for(int i = 0; i < A; ++i) {
            for(int j = 0; j < C; ++j)
                System.out.print(ans[i][j] + " ");
            System.out.println();
        }

        sc.close();
    }
}
