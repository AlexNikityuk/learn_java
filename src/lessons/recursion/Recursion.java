package lessons.recursion;

public class Recursion {
    public static void main(String[] args) {
        System.out.println(factorial(4));
    }

    private static int factorial (int number) {
        if (number == 0 || number == 1) {
            return 1;
        }
        int result = number * factorial(number - 1);
        return result;
    }
}
