public class PPExample {
    public static int getWage(int baseSalary, int overtime, int unit_rate) {
        return baseSalary + overtime*unit_rate;
    }
    public static void main(String[] args) {
        int baseSalary = 30000;
        int overtime = 20;
        int unit_rate = 250;

        System.out.println(getWage(baseSalary, overtime, unit_rate));
    }
}
