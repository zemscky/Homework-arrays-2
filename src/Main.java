import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task_1();
        task_2();
        task_3();
        task_4();
    }

    static int[] arr = generateRandomArray();

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        System.out.println(Arrays.toString(arr));
        return arr;
    }

    public static void task_1() {
        System.out.println("Задание 1");
        int sum = 0;
        for (int element : arr) {
            sum += element;
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей");

    }

    public static void task_2() {
        System.out.println("Задание 2");
        int maxExpenses = arr[0];
        int minExpenses = maxExpenses;
        for (int current : arr) {
            if (current > maxExpenses) {
                maxExpenses = current;
            }
        }for (int current : arr) {
            if (current < minExpenses) {
                minExpenses = current;
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + minExpenses  + " рублей. Максимальная сумма трат за день составила " + maxExpenses + " рублей");
    }
    public static void task_3() {
        System.out.println("Задание 3");
        double averageAmount = -1;
        for (int j : arr) {
            averageAmount += (double) j / arr.length;
        }
        System.out.println("Средняя сумма трат за месяц составила " + averageAmount + " рублей");
    }
    public static void task_4() {
        System.out.println("Задание 4");
        char[] reverseFullName = {'n','a','v','I',' ','v','o','n','a','v','I'};
        for (int i = reverseFullName.length-1; i >= 0; i--)
            System.out.print(reverseFullName[i]);
    }
}