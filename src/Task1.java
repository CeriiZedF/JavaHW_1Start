

public class Task1 {
    public static void main(String[] args) {
        String[] arr = { "\"Your time is limited,", "so don’t waste it", "it living someone else’s life\"", "Steve Jobs"};
        for(int i = 0; i < arr.length; i++) {
            String tabs = "\t".repeat(i);
            System.out.println(tabs + arr[i]);
        }
    }
}