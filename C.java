import java.util.Scanner;

public class C {

    public static void main(String[] args) {

        int a;
        int b;
        int c;

        Scanner scanner = new Scanner(System.in);

        System.out.println("A - ");
        a = scanner.nextInt();
        System.out.println("B - ");
        b = scanner.nextInt();
        System.out.println("C - ");
        c = scanner.nextInt();

        int task2 = a%10;
        System.out.println(task2);

        int task3 = b;
        while (task3 > 9) {
            task3 = task/10;
        }
        System.out.println(task3);


        int x, y, sum = 0;
        x = c;
        if ((x / 10) == 0) {
            sum = c;
        } else {
            while (x > 0) {
                y = x%10;
                sum = sum+y;
                x = x/10;
            }
        }
        System.out.println(sum);

        int task5 = (a*b*c) * task2;
        System.out.println(task5);

        System.out.println(task3 + task5);
    }
}
