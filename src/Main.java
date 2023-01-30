import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static void task1() {
        System.out.println("Задание 1");
        int[ ] arr = generateRandomArray();
        System.out.println(Arrays.toString(arr));
//
        int sum = 0;
        for (int i = 0; i < arr.length; i++){
            sum += arr[i];
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей.");
    }
    public static void task2() {
        System.out.println("Задача 2");
        int[ ] arr = generateRandomArray();
        System.out.println(Arrays.toString(arr));
        int maxPayment = 100_000;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxPayment) {
                maxPayment = arr[i];
            }
        }
        System.out.println("Максимальная сумма трат за день составила " + maxPayment + " рублей.");
        //
        int minPayment = 200_000;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > minPayment);{
                minPayment = arr[i];
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + minPayment + " рублей.");
    }

    public static void task3() {
        System.out.println("Задача 3");
        int[ ] arr = generateRandomArray();
        System.out.println(Arrays.toString(arr));
        double sum = 0;
        for (int i = 0; i < arr.length; i++){
            sum += arr[i];
        }
        System.out.println("Средняя сумма трат за месяц составила " + sum / arr.length + " рублей.");
    }

    public static void task4() {
        System.out.println("Задание 4");
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
            System.out.println(reverseFullName);
        for (int i = reverseFullName.length - 1; i >= 0; --i) {
            System.out.print(reverseFullName[i]);
        }
    }
    }
