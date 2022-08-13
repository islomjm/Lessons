import java.util.Scanner;

public class Input {
    public Input() {
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Введите что нибудь");
        String string = s.nextLine();
        System.out.println("Вы ввели " + string);
        Scanner d = new Scanner(System.in);
        System.out.println("Введите какое-ниубдь число");
        int x = d.nextInt();
        System.out.println("Вы ввели " + x);
    }
}
