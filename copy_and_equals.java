import java.util.*;

public class copy_and_equals {
    public static void main(String[] args) {
        int arr1[] = {1, 2, 3};
        int arr1_same[] = {1, 2, 3};

        System.out.println(arr1 == arr1_same);
        System.out.println(Arrays.equals(arr1, arr1_same));

        // Demonstrating Copy
        int arr2[] = arr1;

        // Print arr2
        System.out.println(Arrays.toString(arr2));
        arr1[1] = 5;
        System.out.println(Arrays.toString(arr2));

        // Print arr1
        System.out.println(Arrays.toString(arr1));
        arr2[2] = 10;
        System.out.println(Arrays.toString(arr1));

        // How to actually make a copy?
        arr2 = Arrays.copyOf(arr1, arr1.length);

        arr1[2] = 0;
        System.out.println("Final: " + Arrays.toString(arr2));
    }
}
