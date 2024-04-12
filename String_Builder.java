public class String_Builder {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("abcdefghj");
        System.out.println(str);

        str.setCharAt(2, 'z');
        System.out.println(str);

        str.append("wire");
        System.out.println(str);

        // insert
        str.insert(2, "inserted");
        System.out.println(str);


        // delete
        str.delete(2, 5);
        System.out.println(str);
    }
}
