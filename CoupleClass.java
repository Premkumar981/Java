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
        Couple c1 = new Couple(10, 10);

        System.out.println(c1.convertToString());

        Couple c2 = new Couple(c1);
        System.out.println(c2.convertToString());
        System.out.println(c1.equals(c2));
    }
}