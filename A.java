import java.util.Scanner;

public class A {

    int x;
    String hello;

    public A(String phrase) {
      this.phrase = phrase;
    }

    public static void main(String[] args) {
        A cons = new B("Hello");
        System.out.println(cons.phrase);

        cons.method1();
        cons.method2();
        cons.method3();
    }

    public void task1() {
        Scanner s = new Scanner(System.in);
        System.out.println("X: ");
        x = s.nextInt();
    }

    public void task2() {
        System.out.println("X+12="x+12);
    }

    public void task3() {
        if (x % 2 == 1) {
            System.out.println("X is odd");
        } else {
            System.out.println("X is even");
        }
    }
}
