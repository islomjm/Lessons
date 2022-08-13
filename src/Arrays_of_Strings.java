public class Arrays_of_Strings {
    public Arrays_of_Strings() {
    }

    public static void main(String[] args) {
        int[] numbers = new int[8];
        numbers[0] = 10;
        String[] strings = new String[]{"Привет", "Пока", "Что за", "Джава"};

        for(int i = 0; i < strings.length; ++i) {
            System.out.println(strings[i]);
        }

        System.out.println();
        String[] var9 = strings;
        int sum = strings.length;

        for(int var5 = 0; var5 < sum; ++var5) {
            String str = var9[var5];
            System.out.println(str);
        }

        int[] numbers1 = new int[]{1, 2, 3, 4};
        sum = 0;
        int[] var11 = numbers1;
        int var12 = numbers1.length;

        for(int var7 = 0; var7 < var12; ++var7) {
            int x = var11[var7];
            sum += x;
        }

        System.out.println();
        System.out.println(sum);
    }
}
