public class Break_Continue {
    public Break_Continue() {
    }

    public static void main(String[] args) {
        for(int i = 0; i != 20; ++i) {
            System.out.println(i);
        }

        System.out.println("Мы вышли из цикла!");

        for(int u = 0; u <= 15; ++u) {
            if (u % 2 != 0) {
                System.out.println("Это нечётное число! " + u);
            }
        }

    }
}
