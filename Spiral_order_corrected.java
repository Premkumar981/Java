import java.util.Scanner;

public class Spiral_order_corrected {
    public static void main(String[] args) {
        // you code goes here
        Scanner sc = new Scanner(System.in);

        int R = sc.nextInt();
        int C = sc.nextInt();

        int arr[][] = new int[R][C];

        // Take input
        for(int i = 0; i < R; ++i)
            for(int j = 0; j < C; ++j)
                arr[i][j] = sc.nextInt();

        // Print in spiral order
        int top = 0, bot = R - 1, left = 0, right = C - 1;


        while(top <= bot && left <= right) {

            // Step 1: Top Row
            // left to right
            for(int col = left; col < right; ++col)
                System.out.print(arr[top][col] + " ");

            if(top == bot) { // 1 row only
                System.out.print(arr[top][right] + " ");
                break;
            }

            // Step 2: Right col
            // Top to bottom
            for(int row = top; row < bot; ++row)
                System.out.print(arr[row][right] + " ");

            if(left == right) {
                System.out.print(arr[bot][right] + " ");
                break;
            }

            // Step 3: Bot row
            // Right to left
            for(int col = right; col > left; --col)
                System.out.print(arr[bot][col] + " ");

            // Step 4: Left col
            // Bottom to top
            for(int row = bot; row > top; --row)
                System.out.print(arr[row][left] + " ");

            // increment top and left
            top++; left++;

            // decrement bot and right
            bot--; right--;
        }
    }
}
