import java.util.Scanner;

public class DoWhile {
    public DoWhile() {
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int value;
        do {
            System.out.println("Введите 10");
            value = scanner.nextInt();
        } while(value != 10);

        System.out.println("Красавчик, ты ввёл 10");
    }
}
