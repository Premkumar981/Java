public class ASCII_codes {
    public static void main(String[] args) {
        // you code goes here
        char ch = 'a';
        // System.out.println((int)ch);

        for(int i = 0; i < 256; ++i) {
            System.out.println(i + "\t->\t" + (char)i);
        }
    }
}
