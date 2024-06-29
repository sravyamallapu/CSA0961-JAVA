import java.util.Scanner;
public class SumOfDigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = input.nextInt();
        int sum = 0;
        int org= n;
        int digit;
        while (n > 0) {
            digit = n % 10;
            sum += digit;
            n/= 10;
        }
        System.out.println("The sum of digits of " + org + " is: " + sum);
    }
}
