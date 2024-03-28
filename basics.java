import java.util.*;

public class basics {
    public static void main(String[] args) {

        // Declaring and instantiating
        // in different lines 
        // int arr[];
        // arr = new int[5];

        int arr[] = new int[5];

        arr[0] = 10; arr[1] = 5; arr[2] = 12; arr[3] = 40;

        // Length of the array
        // System.out.println(arr.length);

        // [0, arr.length)
        for(int i = 0; i < arr.length; ++i)
            System.out.print(arr[i] + " ");

        int arr2[] = {5, 1, -5, 7, 10, 1};

        System.out.println(""); // just an enter character

        // [0, arr2.length)
        for(int value : arr2) {
            System.out.print(value + " ");
        }

        System.out.print("\n"); // just an enter character
        
        // toString()
        System.out.println(Arrays.toString(arr2));

        // sort()
        Arrays.sort(arr2);
        System.out.println(Arrays.toString(arr2));

        // fill()
        // for(int i = 0; i < arr.length; ++i) 
        //     arr[i] = 10; Don't want to do this.
        Arrays.fill(arr2, -1);
        System.out.println(Arrays.toString(arr2));
    }
}
