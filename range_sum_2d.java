import java.util.*;

class Main {
    public static void main(String[] args) {
        // Note: Don't change class name
        Scanner sc = new Scanner(System.in);

        // Input for N and K
        int R = sc.nextInt();
        int C = sc.nextInt();
        int Q = sc.nextInt();

        // Input for the array
        int arr[][] = new int[R][C];
        for(int i = 0; i < R; ++i)
            for(int j = 0; j < C; ++j)
                arr[i][j] = sc.nextInt();

        NumMatrix sol = new NumMatrix(arr);

        for(int q = 0; q < Q; ++q) {
            int r1 = sc.nextInt();
            int c1 = sc.nextInt();
            int r2 = sc.nextInt();
            int c2 = sc.nextInt();
            System.out.println(sol.sumRegion(r1, c1, r2, c2));
        }

    }
}

class NumMatrix {
    private int pre[][];

    public NumMatrix(int[][] matrix) {
        pre = new int[matrix.length][matrix[0].length];
        for (int r = 0; r < matrix.length; r++) {
            for (int c = 0; c < matrix[0].length; c++) {
                if(r == 0 && c == 0)
                    pre[r][c] = matrix[r][c];
                else if(r == 0)
                    pre[r][c] = pre[r][c-1] + matrix[r][c];
                else if(c == 0)
                    pre[r][c] = pre[r-1][c] + matrix[r][c];
                else
                    pre[r][c] = pre[r-1][c] + pre[r][c-1] - pre[r-1][c-1] + matrix[r][c];
            }
        }
    }

    public int sumRegion(int row1, int col1, int row2, int col2) {
        int ans = pre[row2][col2];

        if(row1 > 0)
            ans -= pre[row1 - 1][col2];
        if(col1 > 0)
            ans -= pre[row2][col1-1];
        if(row1 > 0 && col1 > 0)
            ans += pre[row1-1][col1-1];

        return ans;
    }
}