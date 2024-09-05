package method;

public class MethodValue2 {

    public static void main(String[] args) {
        int number = 5; // number = 변수
        System.out.println("1. changeNumber 호출 전, num1: " + number); //5
        changeNumber(number);
        System.out.println("4. changeNumber 호출 후, num1: " + number); //5
        //자바는 항상 변수의 값을 복사해서 대입한다. 그래서 number의 값은 5이다.
    }

    public static void changeNumber(int number) { // number = 매개변수(파라미터) 메인의 number와 다름
        System.out.println("2. changeNumber 변경 전, num2: " + number); //5
        number = number * 2;
        System.out.println("3. changeNumber 변경 후, num2: " + number); //5
    }
}
