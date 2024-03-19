import java.util.Scanner;

public class pow_of_2 {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        if(N <= 0) {
            System.out.println(false);
        }

        else {
            while(N % 2 == 0)
            N /= 2;

            if(N == 1)
                System.out.println(true);
            else
                System.out.println(false);
        }
    }
}
