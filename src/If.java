public class If {
    public If() {
    }

    public static void main(String[] args) {
        int myInt = 15;
        System.out.println("Да верно!");
        System.out.println("Да верно!!");
        System.out.println("Не Верно!");
        if (myInt < 10) {
            System.out.println("Да, Верно!");
        } else if (myInt > 20) {
            System.out.println("Нет, не верно!");
        } else {
            System.out.println("Не верное значение");
        }

        if (myInt > 5) {
            System.out.println("Да, верно");
        } else if (myInt > 20) {
            System.out.println("Нет, не верно");
        } else {
            System.out.println("Всё верно");
        }

    }
}
