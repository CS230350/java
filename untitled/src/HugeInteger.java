import java.util.Arrays;
public class HugeInteger {
    private int[] digits;

    public HugeInteger() {
        digits = new int[40];
    }

    public void parse(String number) {

        for (int i = 0; i < number.length(); i++) {
            digits[i] = Character.getNumericValue(number.charAt(i));
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int digit : digits) {
            sb.append(digit);
        }
        return sb.toString();
    }

    public void add(HugeInteger other) {
        int carry = 0;
        for (int i = digits.length - 1; i >= 0; i--) {
            int sum = digits[i] + other.digits[i] + carry;
            digits[i] = sum % 10;
            carry = sum / 10;
        }
    }

    public void subtract(HugeInteger other) {
        int borrow = 0;
        for (int i = digits.length - 1; i >= 0; i--) {
            int diff = digits[i] - other.digits[i] - borrow;
            if (diff < 0) {
                diff += 10;
                borrow = 1;
            } else {
                borrow = 0;
            }
            digits[i] = diff;
        }
    }

    public boolean isEqualTo(HugeInteger other) {
        return Arrays.equals(digits, other.digits);
    }

    public boolean isNotEqualTo(HugeInteger other) {
        return !isEqualTo(other);
    }

    public boolean isGreaterThan(HugeInteger other) {
        for (int i = 0; i < digits.length; i++) {
            if (digits[i] > other.digits[i]) {
                return true;
            } else if (digits[i] < other.digits[i]) {
                return false;
            }
        }
        return false;
    }

    public boolean isLessThan(HugeInteger other) {
        return !isEqualTo(other) && !isGreaterThan(other);
    }

    public boolean isGreaterThanOrEqualTo(HugeInteger other) {
        return isEqualTo(other) || isGreaterThan(other);
    }

    public boolean isLessThanOrEqualTo(HugeInteger other) {
        return isEqualTo(other) || isLessThan(other);
    }

    public boolean isZero() {
        for (int digit : digits) {
            if (digit != 0) {
                return false;
            }
        }
        return true;
    }



    public void multiply(HugeInteger other) {

    }

    public void divide(HugeInteger divisor) {

    }

    public void remainder(HugeInteger divisor) {

    }

    public static void main(String[] args) {
        HugeInteger num1 = new HugeInteger();
        HugeInteger num2 = new HugeInteger();
        num1.parse("1234567890123456789012345678901234567890");
        num2.parse("9876543210987654321098765432109876543210");


        num1.add(num2);
        System.out.println("Addition Result: " + num1.toString());


        num1.subtract(num2);
        System.out.println("Subtraction Result: " + num1.toString());


        HugeInteger num3 = new HugeInteger();
        num3.parse("1234567890123456789012345678901234567890");

        System.out.println("IsEqualTo: " + num1.isEqualTo(num3));
        System.out.println("IsNotEqualTo: " + num1.isNotEqualTo(num3));
        System.out.println("IsGreaterThan: " + num1.isGreaterThan(num3));
        System.out.println("IsLessThan: " + num1.isLessThan(num3));
        System.out.println("IsGreaterThanOrEqualTo: " + num1.isGreaterThanOrEqualTo(num3));
        System.out.println("IsLessThanOrEqualTo: " + num1.isLessThanOrEqualTo(num3));
        System.out.println("IsZero: " + num1.isZero());
    }
}
