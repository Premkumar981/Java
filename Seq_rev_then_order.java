public class Seq_rev_then_order {
    public static void main(String[] args){
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        for (int i = 0; i < 5; i++){
            System.out.println(array[i]);
        }

        for (int i = array.length - 1; i >= array.length - 5; i--){
            System.out.println(array[i]);
        }
    }
}
