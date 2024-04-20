import java.util.Arrays;

public class pass_by_value_or_ref {
    static void increment(int num) {
        num++;
        System.out.println(num);
    }
    static void func(int inp[]) {
        inp[2] = 1000;
    }
    public static void main(String[] args) {
        int num = 5;
        increment(num);
        System.out.println(num);

        int arr[] = {1, 2, 3, 4, 5};
        System.out.println(arr);
        System.out.println(Arrays.toString(arr));
        func(arr);
        System.out.println(Arrays.toString(arr));
    }
}
