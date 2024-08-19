import java.util.Arrays;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class Task9_10_12 {
    private static int size = 100;
    private static int[] array = new int[size];

    public static void main(String[] args) {
        genRandNumberToArray();
        printArray(array);
        maxSearch();
        minSearch();
        createArrayNegative(searchCountNegativeNumber());
        createArrayPositive(searchCountPositiveNumber());
        searchCountZero();
        createArrayEven();
        createArrayOdd();
        selectModeSort();
    }
    // Task 12
    private static void selectModeSort() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input 1 - Asc, 2 - Desc");
        int mode;
        do {
            mode = sc.nextInt();
        } while(mode != 1 && mode != 2);

        if (mode == 1) {
            sortArray(array, "asc");
        } else {
            sortArray(array, "desc");
        }

        printArray(array);
    }

    public static void sortArray(int[] array, String order) {
        if (order.equalsIgnoreCase("asc")) {
            Arrays.sort(array);
        } else if (order.equalsIgnoreCase("desc")) {
            Arrays.sort(array);
            reverseArray(array);
        } else {
            System.out.println("Неверный порядок сортировки. Используйте 'asc' для возрастания или 'desc' для убывания.");
        }
    }

    public static void reverseArray(int[] array) {
        int n = array.length;
        for (int i = 0; i < n / 2; i++) {
            int temp = array[i];
            array[i] = array[n - 1 - i];
            array[n - 1 - i] = temp;
        }
    }
    // Task 10
    private static void createArrayPositive(int count){
        int[] arrayPositive = new int[count];

        int index = 0;
        for (int num : array) {
            if (num > 0) {
                arrayPositive[index++] = num;
            }
        }

        printArray(arrayPositive);
    }


    private static void createArrayNegative(int count){
        int[] arrayNegative = new int[count];

        int index = 0;
        for (int num : array) {
            if (num < 0) {
                arrayNegative[index++] = num;
            }
        }

        printArray(arrayNegative);
    }

    private static void createArrayOdd(){
        int oddCount = 0;
        for (int num : array) {
            if (num % 2 != 0) {
                oddCount++;
            }
        }

        int[] oddArray = new int[oddCount];
        int index = 0;
        for (int num : array) {
            if (num % 2 != 0) {
                oddArray[index++] = num;
            }
        }

        printArray(oddArray);

    }

    private static void createArrayEven(){
        int evenCount = 0;
        for (int num : array) {
            if (num % 2 == 0) {
                evenCount++;
            }
        }

        int[] evenArray = new int[evenCount];
        int index = 0;
        for (int num : array) {
            if (num % 2 == 0) {
                evenArray[index++] = num;
            }
        }

        printArray(evenArray);

    }

    private static void searchCountZero() {
        int count = 0;
        for (int i = 0; i < size; i++) {
            if (array[i] == 0) {
                count++;
            }
        }
        System.out.println("Count zero number " + count);
    }

    private static int searchCountPositiveNumber() {
        int count = 0;
        for (int i = 0; i < size; i++) {
            if (array[i] > 0) {
                count++;
            }
        }
        System.out.println("Count positive number " + count);
        return count;
    }

    private static int searchCountNegativeNumber(){
        int count = 0;
        for(int i = 0; i < size; i++){
            if(array[i] < 0){
                count++;
            }
        }

        System.out.println("Count negative number " + count);
        return count;
    }

    private static void maxSearch() {
        int temp = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > temp) {
                temp = array[i];
            }
        }

        System.out.println("Max: " + temp);
    }

    private static void minSearch() {
        int temp = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < temp) {
                temp = array[i];
            }
        }

        System.out.println("Min: " + temp);
    }

    private static void printArray(int[] array){
        System.out.print("Array: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ", ");
        }
        System.out.println();
    }

    //generateRandomNumberToArray
    private static void genRandNumberToArray() {
        Random rand = new Random();

        for (int i = 0; i < size; i++) {
            array[i] = rand.nextInt(-size, size);
        }
    }


}
