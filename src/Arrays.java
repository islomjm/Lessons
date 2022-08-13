public class Arrays {
    public Arrays() {
    }

    public static void main(String[] args) {
        boolean number = true;
        int[] numbers = new int[7];

        for(int i = 0; i < numbers.length; ++i) {
            numbers[i] = i * 10;
            System.out.println(numbers[i]);
        }

        System.out.println();
        int[] numbers1 = new int[]{1, 2, 3, 4, 5};

        for(int i = 0; i < numbers1.length; ++i) {
            System.out.println(numbers1[i]);
        }

    }
}
