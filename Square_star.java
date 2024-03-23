import java.util.*;;

public class Square_star {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        
        // 5 rows
        for(int row = 1; row <= N; ++row) {

            // print N stars
            for(int st = 1; st <= N; ++st)
                System.out.print("*");

            // go to the next line
            System.out.println("");
        }
    }
}
