package method;

public class MethodCasting1 {

    public static void main(String[] args) {
        double number = 1.5;
        //printNumber(number);
        printNumber((int) number); //명시적 형변환을 사용해 double을 int로 변환함. 1.5 -> 1이되서 소수점다날라감.

    }

    public static void printNumber(int n) {
        System.out.println("숫자: " + n);
    }
}
