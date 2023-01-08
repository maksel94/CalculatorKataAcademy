import java.util.Scanner;

public class NewCalc {
    public static void main(String[] args) {
        // read
        System.out.print("Enter 'a' : ");
        var a = new Scanner(System.in).nextInt();
        System.out.print("Enter 'b' :");
        var b = new Scanner(System.in).nextInt();

        // processing
        var aPlusB = a + b;
        var aMinusB = a - b;
        var aMulB = a * b;
        var aDivB = a / b;
        var aModB = a % b;

        // result
        System.out.println("a + b = " + aPlusB);
        System.out.println("a - b = " + aMinusB);
        System.out.println("a * b = " + aMulB);
        System.out.println("a / b = " + aDivB);
        System.out.println("a % b = " + aModB);

    }
}
