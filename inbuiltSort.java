import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Integer arr[] = new Integer[n];

        for(int i = 0; i < n; ++i) {
            arr[i] = sc.nextInt();
        }

        Comparator<Integer> cmp = new Comparator<>() {
            public int compare(Integer e1, Integer e2) {
                if(e1.intValue() > e2.intValue())
                    return -1;
                if(e1.equals(e2))
                    return 0;
                return 1;
                // negative if e1 to come before e2 in sorting
                // zero if acc. to the comparator, both are equal.
                // positive if e1 to come after e2 in sorting
            }
        };

        Arrays.sort(arr, cmp);

        // Collections.sort(ArrayList);

        for(int x : arr) {
            System.out.print(x + " ");
        }

    }
}