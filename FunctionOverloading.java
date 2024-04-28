class Couple {
    // properties
    int first;
    int second;

    // Constructors

    // Non-Parameterized constructor
    Couple() {
        this.first = -1;
        this.second = -1;
    }

    // Parameterized constructor
    Couple(int first, int second) {
        this.first = first;
        this.second = second;
    }

    // Copy constructor
    Couple(Couple c) {
        this.first = c.first;
        this.second = c.second;
    }

    // methods
    int multiply() {
        return this.first*this.second;
    }

    Couple multiply(int x) {
        Couple c = new Couple();
        c.first = this.first*x;
        c.second = this.second*x;
        return c;
    }

    Couple multiply(Couple c) { // this->[1, 5] c->[3, 2] => [3, 10]
        Couple ans = new Couple(c.first*this.first, c.second*this.second);
        return ans;
    }

    boolean equals(Couple c) {
        // whether the first & second of this
        // object is equal to the first & second
        // of the object `c` or not?
        return first == c.first && second == c.second;
    }

    String convertToString() {
        return "[" + first + ", " + second + "]";
    } // 1 2 -> "[1, 2]"
}

class Main {
    public static void main(String[] args) {
        // you code goes here
        Couple c1 = new Couple(4, 12);
        System.out.println(c1.multiply());
        Couple ans = c1.multiply(2);
        System.out.println(ans.convertToString());

        Couple c2 = new Couple(4, 1);
        ans = c1.multiply(c2);
        System.out.println(ans.convertToString());
    }
}