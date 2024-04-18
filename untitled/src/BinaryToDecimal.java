import java.util.Scanner;

public class BinaryToDecimal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a binary number:");
        String binaryStr = scanner.nextLine();

        int decimal = binaryToDecimal(binaryStr);
        System.out.println("Decimal equivalent: " + decimal);
    }

    public static int binaryToDecimal(String binaryStr) {
        int decimal = 0;
        for (int i = binaryStr.length() - 1, power = 0; i >= 0; i--, power++) {
            int digit = binaryStr.charAt(i) - '0'; // Convert char to int
            decimal += digit * Math.pow(2, power);
        }
        return decimal;
    }
}
