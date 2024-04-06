public class intro_to_2d {
    public static void main(String[] args) {

        int arr[][] = new int[6][3];

        // no. of rows
        System.out.println(arr.length + " rows.");
        System.out.println(arr[0].length + " cols.");


        int brr[][] = {
            {1, 2, 3},
            {4, 5},
            {7, 8, 9, 10}
        }; // 2*3 array

        // Row-wise traversal 1
        // for(int i = 0; i < brr.length; ++i) {
        //     // ith row
        //     for(int val : brr[i])
        //         System.out.print(val + " ");
        //     System.out.println();
        // }

        // Row-wise traversal 2
        for(int i = 0; i < brr.length; ++i) {
            // ith row
            for(int j = 0; j < brr[i].length; ++j)
                System.out.print(brr[i][j] + " ");
            System.out.println();
        }

        System.out.println(brr[1][1]);

        // Jagged array using new keyword
        int jag[][] = new int[3][];
        jag[1] = new int[5];
        System.out.println(jag[0]);
        System.out.println(jag[1] + " " + jag[1].length);
        System.out.println(jag[2]);

        // for(int i = 0; i < jag.length; ++i) {
        //     for(int j = 0; j < jag[i].length; ++j)
        //         System.out.print(jag[i][j] + " ");
        //     System.out.println();
        // }

        int crr[][] = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12}
        }; // assuming a rectangular array.

        // Column-wise traversal
        for(int j = 0; j < crr[0].length; ++j) {

            // We need to print jth column
            for(int i = 0; i < crr.length; ++i)
                System.out.print(crr[i][j] + " ");
            System.out.println();
        }
    }
}
