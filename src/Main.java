import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        taskOne();
        taskTwo();
        taskThree();
        taskFour();
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

    private static void taskOne() {
        System.out.println("Задание 1");
        int sum = 0;
        for (int element : arr) {
            sum += element;
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей");
    }
    private static void taskTwo() {
        System.out.println("Задание 2");
        int maxExpenses = arr[0];
        int minExpenses = maxExpenses;
        for (int current : arr) {
            if (current > maxExpenses) {
                maxExpenses = current;
            }
            if (current < minExpenses) {
                minExpenses = current;
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + minExpenses  + " рублей. Максимальная сумма трат за день составила " + maxExpenses + " рублей");
    }
    private static void taskThree() {
        System.out.println("Задание 3");
        double averageAmount = -1;
        for (int average : arr) {
            averageAmount += (double) average;
            average /= arr.length;

        }
        System.out.println("Средняя сумма трат за месяц составила " + averageAmount + " рублей");
    }
    private static void taskFour() {
        System.out.println("Задание 4");
        char[] reverseFullName = {'n','a','v','I',' ','v','o','n','a','v','I'};
        for (int i = reverseFullName.length-1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
    }
}