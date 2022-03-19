package lessons.algorithms;

public class LinearAndBinarySearch {
    private static int counter = 0;

    public static void main(String[] args) {
        int[] array = new int[] {-10,-9,7,-5,-4,0,1,2,3,4,5,6,10,11,23,25,26,28,29};
        int result = binarySearch(array, 10); // linear 13 проходов
        System.out.println("Array lenght: " + array.length);
        System.out.println(result);
        System.out.println(counter);
    }

    private static int linearSearch(int[] array, int elementToSearch) {
        int resultElement = -1;
        for (int j : array) {
            counter++;
            if (j == elementToSearch) {
                return j;
            }
        }
        return  -1;
    }

    private static int binarySearch(int[] array, int elementToSearch) {
        int lowIndex = 0;
        int highIndex = array.length - 1;

        while (lowIndex <= highIndex) {
            counter++;
            int midIndex = (lowIndex + highIndex) / 2;
            int midElement = array[midIndex];
            if (midElement < elementToSearch) {
                lowIndex = midIndex + 1;
            } else  if (midElement > elementToSearch) {
                highIndex = midIndex - 1;
            } else  {
                return midElement;
            }
        }
        return -1;
    }

}
