package loop.ex;

public class NestedEx2 {

    public static void main(String[] args) {
        int rows = 5;

        for (int pyramid = 1; pyramid <= rows; pyramid++) {
            for (int star = 1; star <= pyramid; star++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
