public class ForLoop {
    public ForLoop() {
    }

    public static void main(String[] args) {
        int i;
        for(i = 0; i <= 10; ++i) {
            System.out.println("Hello " + i);
        }

        for(i = 0; i <= 10; i += 5) {
            System.out.println("Hi " + i);
        }

        for(i = 10; i >= 0; i -= 5) {
            System.out.println("Hey " + i);
        }

    }
}
