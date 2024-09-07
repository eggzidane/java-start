package ch03.sec04;

public class AccuracyExample1 {

    public static void main(String[] args) {
        int apple = 1;
        double pieceUnit = 0.1;
        int number = 7;

        double result = apple - number*pieceUnit;
        System.out.println("사과 1개에서 남은 양: " + result); // 0.299999999999999993 부동소수점때문에
    }
}
