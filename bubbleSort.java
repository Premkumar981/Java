import java.util.*;

class Main {
    /*
        Just to be clear, there is scope
        of further optimisation. Put on
        thinking hats and figure it out.
    */
    public static void swap(int arr[], int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    
    public static void bubbleSort(int arr[]) {
        int n = arr.length;
        // N - 1 steps
        for(int it = 1; it <= n - 1; ++it) {
            /*
                In each step, swap arr[i] &
                arr[i + 1] if required.
            */
            for(int i = 0; i + 1 < n; ++i)
                if(arr[i] > arr[i + 1])
                    swap(arr, i, i+1);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int arr[] = new int[N];

        for(int i = 0; i < N; ++i)
            arr[i] = sc.nextInt();

         bubbleSort(arr);

        for(int num : arr)
            System.out.print(num + " ");
    }
}