import java.util.Scanner;

public class Task5 {
    private static int number;
    private static final int min = 1;
    private static final int max = 12;

    public static void main(String[] args) {
        inputNumber();
        printSeasons();
    }

    private static void printSeasons(){
        switch(number){
            case 12, 1, 2: System.out.println("Winter"); break;
            case 3, 4, 5: System.out.println("Spring"); break;
            case 6, 7, 8: System.out.println("Summer"); break;
            case 9, 10, 11: System.out.println("Autumn"); break;
        }
    }

    private static void inputNumber(){
        Scanner sc = new Scanner(System.in);
        String temp = "";
        do {
            if(number < min || number > max){
                System.out.println("Error input range");
            }
            temp = stringToInt(sc.nextLine());
            number = Integer.parseInt(temp);
        } while (number < min || number > max);
        sc.close();

        System.out.println(number);
    }

    private static String stringToInt(String input){

        return input.replaceAll("[^0-9]", "");
    }


}
