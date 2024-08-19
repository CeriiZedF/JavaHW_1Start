

public class Task11 {
    public static void main(String[] args) {
        drawLine(10, 'H', '*');
        drawLine(5, 'V', '#');
    }


    public static void drawLine(int length, char direction, char symbol) {
        if (length <= 0) {
            System.out.println("Длина линии должна быть положительным числом.");
            return;
        }

        switch (direction) {
            case 'H': // горизонтальная линия
                for (int i = 0; i < length; i++) {
                    System.out.print(symbol);
                }
                System.out.println(); // Перевод строки после горизонтальной линии
                break;

            case 'V': // вертикальная линия
                for (int i = 0; i < length; i++) {
                    System.out.println(symbol);
                }
                break;

            default:
                System.out.println("Неверное направление. Используйте 'H' для горизонтальной или 'V' для вертикальной линии.");
                break;
        }
    }
}
