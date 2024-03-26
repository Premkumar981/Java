import java.util.Scanner;
import java.util.Arrays;

public class linear_search {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // size of the array
        int N = sc.nextInt();

        int arr[] = new int[N];

        for(int i = 0; i < N; ++i) {
            arr[i] = sc.nextInt();
        }

        int target_num = sc.nextInt();


        // Now, the actual problem starts.
        boolean ans = false;

        for(int val : arr) {
            if(val == target_num) {
                ans = true;
                break;
            }
        }

        System.out.println(ans);

        sc.close();
    }
}
