package cond.ex;

public class EvenOddEx {

    public static void main(String[] args) {

        int x = 5;

        if (x % 2 == 0) {
            System.out.println("x = " + x +", 짝수");
        }
        else {
            System.out.println("x = " + x +", 홀수");
        }
    }
}
