import java.util.Scanner;

public class print_1_to_n {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int ctr = 1; ctr <= n; ctr++) {
            System.out.println(ctr);
        }
    }
}
