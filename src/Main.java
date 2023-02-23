import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[31];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static void task1() {
        System.out.println("Задача 1");
        int[] arr = generateRandomArray();
        for (int i = 1; i < arr.length; i++) {
            System.out.println("Сумма трат за " + i + "-й день составила " + arr[i] + " рублей");
        }
    }

    public static void task2() {
        System.out.println("Задача 2");
        int[] arr = generateRandomArray();
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + min + " рублей");

        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        System.out.println("Максимальная сумма трат за день составила " + max + " рублей");
    }

    public static void task3() {
        System.out.println("Задача 3");
        int[] arr = generateRandomArray();
        double average = 0;
        for (int i = 1; i < arr.length; i++) {
            average += arr[i] / arr.length;
        }
        System.out.println("Средняя сумма трат за день составила " + average + " рублей");
    }

    public static void task4() {
        System.out.println("Задача 4");
        char[] mas = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = 0; i < mas.length; i++) {
            System.out.print(mas[i]);
        }
        int n = mas.length;
        for (int i = 0; i < n / 2; i++) {
            char temp = mas[n - i - 1];
            mas[n - i - 1] = mas[i];
            mas[i] = temp;
        }
        System.out.println();
        for (int i = 0; i < mas.length; i++) {
            System.out.print(mas[i]);
        }
    }
}