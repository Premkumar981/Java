import java.util.Scanner;
public class smallest_and_sec_smallest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // take input for size of the array
        int N = sc.nextInt();
        int arr[] = new int[N];
        
        // Input for N elements of the array
        for(int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        int min_element = Integer.MAX_VALUE;

        for(int i = 0; i < N; ++i) {
            if(arr[i] < min_element)
                min_element = arr[i];
        }

        int sec_min = Integer.MAX_VALUE;

        for(int i = 0; i < N; ++i) {
            if(arr[i] == min_element)
                continue;
            
            if(arr[i] < sec_min)
                sec_min = arr[i];
        }

        if(sec_min == Integer.MAX_VALUE) {
            min_element = -1;
            sec_min = -1;
        }

        System.out.println(min_element + " " + sec_min);

        sc.close();
    }
}
