import java.util.Scanner;

//A shop will give discount of 10% if the cost of purchased quantity is more than 1000.
  //      Ask user for quantity
    //    Suppose, one unit will cost 100.
      //  Judge and print total cost for user.
public class PurchasedQuantity {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        if ((x * 100) > 1000) {
            System.out.println("You will geta discount ");
        }
    }
}
