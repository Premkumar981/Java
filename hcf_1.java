//import java.util.Scanner;
import java.lang.Math;

public class hcf_1 {
    public static void main(String[] args) {
        //Scanner sc = new Scanner(System.in);

       int A = 5;//sc.nextInt();
       int B = 7;//sc.nextInt();

       int ans = 1;
       for(int num = 1; num <= Math.min(A, B); num++) {
           if(A%num == 0 && B%num == 0)
               ans = num;
       }
       System.out.println(ans);
   }    
}
