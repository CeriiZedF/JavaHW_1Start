import java.util.Scanner;

public class Task6 {
    private static final double[] TRANSFORM_VALUE = new double[]{0.000621371, 39.3701, 1.09361};
    private static double result = 0;
    private static byte selectIndex = 0;

    public static void main(String[] args) {
        result = inputMeters();
        selectMode();
        calculate(TRANSFORM_VALUE[selectIndex]);
    }

    private static void calculate(double temp) {
        result = result * temp;
        System.out.println(result);
    }

    private static double inputMeters(){
        Scanner scan = new Scanner(System.in);
        double temp = 0;
        System.out.println("Input Meters");
        do {
            temp = scan.nextDouble();
            if(temp <= 0){
                System.out.println("Error input");
            }
        } while(temp <= 0);
        return temp;
    }

    private static void selectMode(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Input 1-3 to -> Mile, Inches, Yards");
        do{
            if(selectIndex < 0 || selectIndex > 3){
                System.out.println("Please input 1-3 to -> Mile, Inches, Yards");
            }
            selectIndex = sc.nextByte();
            --selectIndex;
        } while(selectIndex < 0 || selectIndex > 3);
    }
}
