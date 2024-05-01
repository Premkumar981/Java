import java.util.*;

class Main {
    public static void main(String[] args) {
        ArrayList<Integer> arr1 = new ArrayList<>();
        System.out.println(arr1 + " -> " + arr1.size());

        arr1.add(1);
        arr1.add(2);
        arr1.add(3);
        arr1.add(4);

        System.out.println(arr1 + " -> " + arr1.size());

        System.out.println(arr1.get(2));

        arr1.set(2, 100);
        System.out.println(arr1 + " -> " + arr1.size());

        ArrayList<Integer> arr2 = new ArrayList<>(List.of(6, 1, 4, 3, 2));
        System.out.println(arr2 + " -> " + arr2.size());

        arr2.remove(arr2.size() - 1);
        System.out.println(arr2 + " -> " + arr2.size());
    }
}