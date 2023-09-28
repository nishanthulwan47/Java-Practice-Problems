import java.util.Scanner;
public class LengthAndBreadth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length");
        int x = sc.nextInt();
        System.out.println("Enter breadth");
        int y = sc.nextInt();
        if (x == y) {
            System.out.println("Square");
        } else {
            System.out.println("Rectangle");
        }

    }
}
