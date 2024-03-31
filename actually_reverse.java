import java.util.Scanner;

public class actually_reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // take input for size of the array
        int N = sc.nextInt();
        int arr[] = new int[N];

        // Input for N elements of the array
        for(int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        // Write the code to reverse the array
        int i = 0; // start i from the beginning.
        int j = N - 1; // start j from the end.

        while(i < j) {
            // swap arr[i] & arr[j]
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            
            // update the values of i and j
            i++;
            j--;
        }

        for(int val : arr)
            System.out.print(val + " ");

        sc.close();
    }
}
