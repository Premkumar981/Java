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

    public static void selectionSort(int arr[]) {
        int n = arr.length;
        /*
            Will place the (i+1)th
            smallest element to the
            right place in ith iteration
        */
        for(int i = 0; i < n; ++i) {
            int min_id = i;
            for(int j = i + 1; j < n; ++j)
                if(arr[j] < arr[min_id])
                    min_id = j;
            
            // Swap arr[i] and arr[min_id]
            swap(arr, i, min_id);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int arr[] = new int[N];

        for(int i = 0; i < N; ++i)
            arr[i] = sc.nextInt();

         selectionSort(arr);

        for(int num : arr)
            System.out.print(num + " ");
    }
}