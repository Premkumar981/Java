import java.util.*;

public class Rhombus_pattern {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        
        // N rows
        for(int row = 1; row <= N; ++row) {
            
            // print (row - 1) spaces also
            for(int sp = 1; sp <= (row - 1); ++sp)
                System.out.print(" ");

            // print N stars
            for(int st = 1; st <= N; ++st)
                System.out.print("*");

            // go to the next line
            System.out.println("");
        
        }

        sc.close();
    }
}
