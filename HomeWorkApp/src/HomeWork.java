public class HomeWork {

    public static void printThreeWords() {
        System.out.println("Orange\nBanana\nApple");
    }

    public static void checkSumSign() {
        int a = 5;
        int b = 10;
        if (a + b >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }

    }

    public static void printColor() {
        int value = 101;
        if (value <= 0) {
            System.out.println("Red");
        } else if (value > 0 && value <= 100) {
            System.out.println("Yellow");
        } else {
            System.out.println("Green");
        }

    }

    public static void compareNumbers() {
        int a = 10;
        int b = 10;
        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }

    }

    public static boolean compareNumbers2(int a, int b) {
        int c = a + b;
        return c >= 10 && c <= 20;
    }

    public static void isPositive(int number) {
        if (number >= 0) {
            System.out.println("number is Positive");
        } else {
            System.out.println("number is Negative");
        }

    }

    public static boolean isNegative(int number) {
        return number < 0;
    }

    public static void printStr(int number, String str) {
        while(number != 0) {
            System.out.println(str);
            --number;
        }

    }

    public static void main(String[] args) {
        printStr(5, "Privet mir");
    }
}
