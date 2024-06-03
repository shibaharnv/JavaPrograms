package JavaQuizPrograms;

class P {
    {
        System.out.println("P Initializer Block");
    }

    P() {
        System.out.println("P Constructor");
    }

    void display() {
        System.out.println("P display");
    }
}

class Q extends P {
    static {
        System.out.println("Q Static Block");
    }

    {
        System.out.println("Q Initializer Block");
    }

    Q() {
        System.out.println("Q Constructor");
    }

    Q(int x) {
        System.out.println("Q Parameterized Constructor");
    }

    @Override
    void display() {
        System.out.println("Q display");
    }
}

class R extends Q {
    static {
        System.out.println("R Static Block");
    }

    {
        System.out.println("R Initializer Block");
    }

    R() {
        System.out.println("R Constructor");
    }

    R(int y) {
        super(y);
        System.out.println("R Parameterized Constructor");
    }

    @Override
    void display() {
        System.out.println("R display");
    }
}

public class MainClass2 {
    public static void main(String[] args) {
        P p = new R();
        p.display();
    }
}
