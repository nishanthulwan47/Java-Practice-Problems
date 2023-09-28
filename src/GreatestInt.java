//Take two int values from user and print greatest among them. 4 5

import java.util.Scanner;
public class GreatestInt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number");
        int x = sc.nextInt();
        System.out.println("Enter the second number");
        int y = sc.nextInt();

        if (x > y) {
            System.out.println(x);
        } else {
            System.out.println(y);
        }

    }
}
