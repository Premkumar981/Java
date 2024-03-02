//import java.util.Scanner;
public class Week_switch_case {
    public static void main(String[] args) {
        
        //Scanner sc = new Scanner(System.in);
        //int day_num = sc.nextInt();
        int day_num = 3;
        switch(day_num){
            case 1:
            System.out.println("Monday");
            break;
            case 2:
            System.out.println("Tuesday");
            break;
            case 3:
            System.out.println("Wednesday");
            break;
            case 4:
            System.out.println("Thursday");
            break;
            case 5:
            System.out.println("Friday");
            break;
            case 6:
            System.out.println("It's weekend!");
            break;
            default :
            System.out.println("Invalid number");
            
        }
    }
}
