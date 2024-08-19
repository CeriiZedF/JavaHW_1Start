import java.util.Scanner;

public class Task4 {
    private static int num = 0;
    public static void main(String[] args) {
        input();
        transform(2);
        System.out.println(num);
    }

    private static void transform(int count){
        char[] digits = String.valueOf(num).toCharArray();
        int j = String.valueOf(num).length() - 1;
        for(int i = 0; i < count; i++, j--){
            char temp = digits[i];
            digits[i] = digits[j];
            digits[j] = temp;
        }
        num = Integer.parseInt(String.valueOf(digits));
    }

    private static void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        while(true) {
            num = Integer.parseInt(sc.nextLine());
            if(String.valueOf(num).length() != 6){
                System.out.println("Enter 6 numbers: ");
            }
            else{
                break;
            }
        }
        sc.close();
    }
}
