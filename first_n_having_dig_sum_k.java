import java.util.Scanner;

public class first_n_having_dig_sum_k {
    public static void main(String[] args) {
      
      Scanner sc = new Scanner(System.in);

      int target_count = sc.nextInt();
      int target_sum = sc.nextInt();

      //   start from 1.
        //   keep checking the sum of digits for all 
        //   the natural numbers, one by one.

        //   whenever we find dig_sum == target_sum:
        //   print it
        //   count += 1

        int cur_num = 1, count = 0;

        while(count < target_count) {
            
            // calculate digit sum
            // for the cur_num
            int cur_sum = 0;
            for(int num = cur_num; num > 0; num /= 10)
                cur_sum += (num%10);

            if(cur_sum == target_sum) {
                System.out.println(cur_num);
                count++;
            }

            cur_num++;
        }

        sc.close();
    }
}
