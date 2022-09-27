public class Main {
    public static void main(String[] args) {
        task_1();
        task_2();
    }

    static int[] arr = generateRandomArray();

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
    public static void task_1() {
        System.out.println("Задание 1");
        arr = generateRandomArray();
        int sum = 0;
        for (int element: arr) {
            sum += element;
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей");

    }
    public static void task_2() {
        System.out.println("Задание 2");
        arr = generateRandomArray();
    }
}