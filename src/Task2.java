import java.util.Scanner;

public class Task2 {
    private static int number1 = 0;
    private static int number2 = 0;
    public static void main(String[] args) {
        number1 = inputNumber(number1);
        number2 = inputNumber(number2);
        calculate();
    }
    // Формула (число*процент/100)
    private static void calculate(){
        int sum = 0;
        int temp = number1 * number2;
        sum = temp / 100;
        System.out.println(sum);
    }

    private static int inputNumber(int num){
        Scanner sc = new Scanner(System.in);
        do{
            if(num == -1){
                System.out.println("Error Input");
            }
            System.out.println("Введите число");
            num = sc.nextInt();
        } while (inputValidator(num) == -1);
        return num;
    }

    private static int inputValidator(int num){
        if (num > 0 && num < Integer.MAX_VALUE){
            return num;
        }
        return -1;
    }
}
