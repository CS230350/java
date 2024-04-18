public class PerfectNumbers {
    public static void main(String[] args) {
        findPerfectNumbers(1, 1000);
    }

    public static void findPerfectNumbers(int start, int end) {
        for (int num = start; num <= end; num++) {
            if (isPerfect(num)) {
                System.out.println(num + " is a perfect number.");

            }
        }
    }

    public static boolean isPerfect(int num) {
        int sum = 0;
        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }
        return sum == num;
    }
}
