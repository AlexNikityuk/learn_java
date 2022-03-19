package lessons.arrays;

import java.util.Arrays;

public class ArrayExample {
    public static void main(String[] args) {

        int[] array = new int[] {1, 2, 3, 4, 0};

        int[] newArray = Arrays.copyOf(array,5);
        newArray[3] = 4;

        System.out.println(Arrays.compare(array, newArray));

        int[][] arrayTwo = new int[4][2];
        arrayTwo[0][0] = 0;
        arrayTwo[0][1] = 1;
        arrayTwo[1][0] = 2;
        arrayTwo[1][1] = 3;
        arrayTwo[2][0] = 4;
        arrayTwo[2][1] = 5;
        arrayTwo[3][0] = 6;
        arrayTwo[3][1] = 7;

        for (int i = 0; i < arrayTwo.length; i++) {
            for (int j = 0; j < arrayTwo[i].length; j++) {
                System.out.println("[" + i + "]" + "[" + j + "] " + "= " + arrayTwo[i][j]);
            }
        }

    }

}
