import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Objects;

public class HomeWork {

    static class Worker {
        private String fullName;
        private String position;
        private String email;
        private String tel;
        private double salary;
        private int age;

        public Worker(String fullName,
                      String position,
                      String email,
                      String tel,
                      double salary,
                      int age) {
            this.fullName = fullName;
            this.position = position;
            this.email = email;
            this.tel = tel;
            this.salary = salary;
            this.age = age;
        }

        public void toConsole() {
            System.out.println("fullName" + '=' + fullName + '\n' +
                                "position" + '=' + position + '\n' +
                                 "email" + '=' + email + '\n' +
                                "tel" + '=' + tel + '\n' +
                                "salary" + '=' + salary + '\n' +
                                "age" + '=' + age + '\n');
        }
    }

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

    public static int[] changeArray() {
        int[] arr = {1,1,1,0,0,1,1,1,1,1,0,1,0,1,1,1,0,1,1,1,0};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                arr[i] = 0;
            } else {
                arr[i] = 1;
            }
        }
        return arr;
    }

    public static int[] fillArray() {
        int[] arr = new int[100];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }
        return arr;
    }

    public  static int[][] twoDimArray() {
        int[][] arr = new int[5][5];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (j == i) {
                    arr[i][j] = 1;
                } else {
                    arr[i][j] = 0;
                }
            }
        }
        return arr;
    }

    public static int[] initArray(int len, int initialValue) {
        int[] arr = new int[len];
        Arrays.fill(arr, initialValue);
        return arr;
    }

    public class Animal {
        private final int length;

        public Animal(int length) {
            this.length = length;
        }
        public void run(int length) {
            System.out.println("pet run" + " " + length + " " + "m");
        }

        public void swim() {
            System.out.println("pet swim" + length + "m");
        }
    }

    public class Cat extends Animal{
        private int len;
        public Cat(int length) {
            super(length);
            len = length;
        }

        public void run() {
            if (len > 200) {
                System.out.println("pet doesn't run(");
            } else {
                super.run(len);
            }
        }

        public void swim() {
            System.out.println("cat doesn't run(");
        }
    }

    public class Dog extends Animal {
        private int len;

        public Dog(int length) {
            super(length);
            len = length;
        }

        public void run() {
            if (len > 500) {
                System.out.println("pet doesn't run on this length(");
            } else {
                super.run(len);
            }
        }

        public void swim() {
            if (len > 50) {
                System.out.println("dog doesn't swim on this length");
            }

        }
    }

    public class Phonebook {

        HashMap <String, String> phoneBook = new HashMap<>();

        public void add(String surname, String tel) {
            phoneBook.put(tel, surname);
        }

        public void get(String surname) {
            for (HashMap.Entry<String, String> entry: phoneBook.entrySet()) {
                String value = entry.getValue();
                if (Objects.equals(value, surname)) {
                    System.out.println(entry.getKey());
                }
            }
        }
    }

    public static void main(String[] args) {
        printStr(5, "Privet mir");
//        System.out.println(Arrays.toString(changeArray()));
//        System.out.println(Arrays.toString(fillArray()));
//        System.out.println(Arrays.deepToString(twoDimArray()));
//        System.out.println(Arrays.toString(initArray(5, 5)));

        Cat cat = new HomeWork().new Cat(250);
        cat.run();
        String[] arr = {"privet","privet", "lolk", "milk", "mi", "aaa"};
        ArrayList<String> res = new ArrayList<String>();
        for (String str : arr) {
            if (!res.contains(str)) {
                res.add(str);
            }
        }
        Object[] resObj = res.toArray();
        for(Object str : resObj){
            System.out.println(str);
        }

        Phonebook phoneBook = new HomeWork().new Phonebook();
        phoneBook.add("Fedoseyeva", "+7888888888");
        phoneBook.add("Fedoseyeva", "+7999999999");
        phoneBook.add("Pyshkin", "+75555555555");

        phoneBook.get("Fedoseyeva");
    }
}
