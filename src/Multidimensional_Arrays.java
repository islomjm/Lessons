public class Multidimensional_Arrays {
    public Multidimensional_Arrays() {
    }

    public static void main(String[] args) {
        int[] var10000 = new int[]{1, 2, 3, 4};
        int[][] matrice = new int[][]{{1, 2, 3, 4, 5, 6}, {5, 7, 9, 7, 2, 4}, {9, 4, 2, 5, 0, 3}};
        System.out.println(matrice[0][2]);
        System.out.println(matrice[1][1]);
        System.out.println(matrice[2][3]);
        int[] number1 = new int[5];
        String[][] strings = new String[2][3];
        strings[0][0] = "Привет";
        strings[0][1] = "Как дела?";
        strings[1][0] = "Всё хорошо!";
        strings[1][1] = "Отлично";
        strings[0][2] = "Салам";
        strings[1][2] = "Пока";
        System.out.println(strings[0][1]);
        System.out.println(strings[1][0]);

        int k;
        int m;
        for(k = 0; k < matrice.length; ++k) {
            for(m = 0; m < matrice[k].length; ++m) {
                System.out.print(matrice[k][m] + " ");
            }

            System.out.println();
        }

        for(k = 0; k < strings.length; ++k) {
            for(m = 0; m < strings[k].length; ++m) {
                System.out.print(strings[k][m] + " ");
            }

            System.out.println();
        }

    }
}
