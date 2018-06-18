package factorial;

public class Factorial {

    public static void main(String[] args) {

        int f = factorial();

        System.out.println(f);

    }

    private static int factorial() {
        int j;
        int f;
        j = 8;
        int i;
        if (j == 0) {
            f = 1;
        } else {
            f = 1;
            for (i = j; i >= 1; i--) {
                f = f * i;
            }
        }
        return f;
    }

}
