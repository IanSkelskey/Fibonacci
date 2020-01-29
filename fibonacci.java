package fibonacci;

import java.util.Scanner;

public class Fibonacci {

    public static int fibonacciCalc(int p) {
        if (p <= 2) {
            return 1;
        } else {
            return (fibonacciCalc(p - 2) + fibonacciCalc(p - 1));
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = 1;
        System.out.println("Welcome to the Fibonacci Calculator!");
        do {
            int answer;
            int n;
            System.out.print("Please enter which number of the sequence "
                    + "you would like to know: ");

            n = input.nextInt();
            if (n <= 0) {
                System.out.println("Please enter positive integers only."
                        + "Try Again.");
            } else {
                answer = fibonacciCalc(n);
                System.out.println(answer);
            }
        } while (t == 1);

    }

}
