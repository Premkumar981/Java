import java.util.Scanner;
public class Armstrong_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int num = sc.nextInt();
        int temp = num;
        int r,sum=0;
        
        while(num>0){
            r=num%10;
            num=num/10;
            sum=sum+r*r*r;
        }
        if(temp==sum){
            System.out.println("Armstrong Number");
        }else{
            System.out.println("Not a Armstrong number");
        }
        sc.close();
    }
}