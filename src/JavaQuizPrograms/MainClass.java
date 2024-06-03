package JavaQuizPrograms;

public class MainClass {
    public static void main(String[] args) {
    A a = new C();
    a.show();
}
}
    class A {
        A() {
            System.out.println("A1");
        }

        A(int i) {
            System.out.println("A2");
        }

        void show() {
            System.out.println("A show");
        }
    }

    class B extends A {
        B() {
            System.out.println("B1");
        }

        B(String s) {
            System.out.println("B2");
        }

        @Override
        void show() {
            System.out.println("B show");
        }
    }

    class C extends B {
        C() {
            super("init");
            System.out.println("C1");
        }

        C(int j) {
            System.out.println("C2");
        }

        @Override
        void show() {
            System.out.println("C show");
        }
    }






