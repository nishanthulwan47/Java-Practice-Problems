import java.util.Scanner;

public class SumOfnNumbers {
    public static void main(String args[]) {
        int sum = 0;
        int a;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numbers that need to be calculated");
        int n = sc.nextInt();
        for (int i = 0 ; i <=n; i++) {
            System.out.println("Enter the number");
            a= sc.nextInt();
            sum = sum + a;
        }
        System.out.print("Sum of numbers is: "+sum);
    }
}
