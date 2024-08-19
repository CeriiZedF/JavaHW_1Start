import java.util.Scanner;

public class Task3 {
    private static int[] arr;
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        setArrLength();
        fillArray();
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        System.out.println(mergeIntToString());
    }

    private static int mergeIntToString(){
        String temp = "";
        for (int i = 0; i < arr.length; i++) {
            temp += arr[i];
        }
        return Integer.parseInt(temp);
    }

    private static void fillArray() {
        for (int i = 0; i < arr.length; i++) {
            int num = -1; // Инициализация переменной для проверки ввода
            while (num < 0 || num > 9) { // Проверка диапазона от 0 до 9
                System.out.print("Введите число (от 0 до 9) для элемента " + i + ": ");
                if (scanner.hasNextInt()) {
                    num = scanner.nextInt();
                    if (num < 0 || num > 9) {
                        System.out.println("Ошибка: введите число в пределах от 0 до 9.");
                    }
                } else {
                    System.out.println("Ошибка: введите целое число.");
                    scanner.next(); // Очистка некорректного ввода
                }
            }
            arr[i] = num;
        }
    }

    private static void setArrLength() {
        int arrLength = 0;
        System.out.println("Сколько чисел объединить (до 20)?");
        do {
            System.out.print("Введите число: ");
            if (scanner.hasNextInt()) {
                arrLength = scanner.nextInt();
                if (arrLength <= 0 || arrLength > 20) {
                    System.out.println("Ошибка: введите число от 1 до 20.");
                }
            } else {
                System.out.println("Ошибка: введите целое число.");
                scanner.next(); // Очистка некорректного ввода
            }
        } while (arrLength <= 0 || arrLength > 20);
        arr = new int[arrLength];
    }
}

