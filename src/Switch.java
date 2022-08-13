import java.util.Scanner;

public class Switch {
    public Switch() {
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите возраст:");
        int age = scanner.nextInt();
        switch (age) {
            case 0:
                System.out.println("Ты родился!");
                break;
            case 7:
                System.out.println("Ты учишься в школе!");
                break;
            case 18:
                System.out.println("Ты закончил школу!");
                break;
            default:
                System.out.println("Ни одно из предыдущих условий не подошло");
        }

        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Введите возрас(строчно):");
        switch (scanner1.nextLine()) {
            case "нол":
                System.out.println("Ты родился");
                break;
            case "семь":
                System.out.println("Ты учишься в школе!");
                break;
            case "восемьнадцать":
                System.out.println("Ты закончил школу!");
                break;
            default:
                System.out.println("Ни одно из предыдущих условий не подошло!");
        }

    }
}
