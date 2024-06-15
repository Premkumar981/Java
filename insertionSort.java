import java.util.*;

class Main {
    public static void insertionSort(int arr[]) {
        for(int i = 1; i < arr.length; ++i) {
            /*
            Target is to accommodate
            arr[i] to arr[0....i-1]
            s.t. it remains sorted.
            */
            int curNum = arr[i], j = i - 1;

            // Find the right place
            // and keep shifting as well
            while(j >= 0 && arr[j] > curNum) {
                arr[j + 1] = arr[j];
                j--;
            }

            arr[j + 1] = curNum;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int arr[] = new int[N];

        for(int i = 0; i < N; ++i)
            arr[i] = sc.nextInt();

        insertionSort(arr);

        for(int num : arr)
            System.out.print(num + " ");
    }
}