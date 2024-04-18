public class function_basics {
    static int add(int a, int b) {
        int sum = a + b;
        return sum;
    }
    static void pranaam(String name) {
        System.out.println("Hello! " + name);
    }
    public static void main(String[] args) {
        pranaam("Kanishk");
        pranaam("Viral");

        int ans = add(10, 5);
        System.out.println(ans);
    }
}
