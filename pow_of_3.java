import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // Note: Don't change class name
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        Solution sol = new Solution();
        System.out.println(sol.isPowerOfThree(N));
    }
}

class Solution {
    public boolean isPowerOfThree(int n) {
        if(n <= 0)
            return false;
        if(n == 1)
            return true;
        if(n % 3 != 0)
            return false;

        return isPowerOfThree(n/3);
    }
}