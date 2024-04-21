public class OOPExample {
    int baseSalary;
    int overtime;
    int unitRate;

    OOPExample(int baseSalary, int overtime,int unitRate) {
        this.baseSalary = baseSalary;
        this.overtime = overtime;
        this.unitRate = unitRate;
    }

    int getWage() {
        return this.baseSalary + this.overtime*this.unitRate;
    }
}
class Main {
    public static void main(String[] args) {
        OOPExample raju = new OOPExample(30000, 20, 250);
        System.out.println(raju.getWage());
    }
}
