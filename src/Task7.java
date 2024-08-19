import org.w3c.dom.ranges.Range;

import java.util.Scanner;

public class Task7 {
    private static int left = 0;
    private static int right = 0;
    private static int max = 100;

    public static void main(String[] args) {
        left = inputValue(max);
        right = inputValue(left);
        normalize();
        print();
    }

    private static void print(){
        for (int i = left; i <= right; i++) {
            if(i % 2 != 0){
                System.out.println(i);
            }
        }
    }

    private static void normalize(){
        if(left > right){
            int temp = left;
            left = right;
            right = temp;
        }
    }

    private static int inputValue(int max) {
        Scanner sc = new Scanner(System.in);
        int value = 0;
        System.out.println("Enter an integer: ");
        do {
            if (value < 0) {
                System.out.println(STR."Error : Range 0 - \{max}");
            }
            value = sc.nextInt();
        } while (value < 0);


        return value;
    }
}
