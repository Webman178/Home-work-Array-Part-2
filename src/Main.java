
public class Main {
    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr; }
    public static void main(String[] args) {
        int[] arr = generateRandomArray();

        //Задание 1
        System.out.println("Задание 1");
        int sumArr = 0;
        for (int i = 0; i < arr.length; i++) {
            sumArr = sumArr + arr[i];
        }
        System.out.println("Сумма трат за месяц составила " + sumArr + " рублей");

        //Задание 2
        System.out.println("Задание 2");
        int maxArr = -1;
        int minArr = 200001;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxArr) {
                maxArr = arr[i];
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < minArr) {
                minArr = arr[i];
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + minArr + " рублей. Максимальная сумма трат за день составила " + maxArr + " рублей");

        //Задание 3
        System.out.println("Задание 3");
        double midArr = 0;
        midArr = sumArr / arr.length;
        System.out.println("Средняя сумма трат за месяц составила " + midArr + " рублей");

        //Задание 4
        System.out.println("Задание 4");
        char [] name = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        char fullName = 0;
        for (int i = 0; i < name.length/2; i++) {
            fullName = name[i];
            name[i] = name[name.length - i - 1];
            name[name.length - i - 1] = fullName;
        }
        for (int i = 0; i < name.length; i++)
            System.out.print(name[i]);
        System.out.println("");

            } //main
        }// Main

