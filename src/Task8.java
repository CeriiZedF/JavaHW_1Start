import java.util.Scanner;

public class Task8 {
    private static byte[] numbers = new byte[2];
    public static void main(String[] args) {
        input();
        ifSwap();
        printTable();
    }
    private static void ifSwap(){
        if(numbers[0] > numbers[1]) {
            byte temp = numbers[0];
            numbers[0] = numbers[1];
            numbers[1] = temp;
        }
    }

    private static void printTable(){
        for(int i = numbers[0]; i <= numbers[1]; i++){
            for(int j = 1; j <= 10; j++){
                System.out.print(i + " * " + j + " = " + (i * j) + "    ");
            }
            System.out.println();
        }
    }

    private static void input(){
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter number " + i + ": ");
            do {
                numbers[i] = sc.nextByte();
                if(numbers[i] < 0 || numbers[i] > 10){
                    System.out.println("Please enter a number between 0 and 10");
                }
            } while(numbers[i] < 0 || numbers[i] > 10);
        }

    }
}
