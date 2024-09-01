package operator;

public class Operator1 {
    public static void main(String[] args) {
        //변수 초기화
        int a = 5;
        int b = 2;

        //덧셈
        int sum = a + b;
        System.out.println("a + b =" + sum); //출력 a + b = 7

        //뺄셈
        int diff = a - b;
        System.out.println("a - b =" + diff); //출력 a - b = 3

        //곱셈
        int multi = a * b;
        System.out.println("a * b =" + multi); //출력 a * b = 10

        //나눗셈
        int div = a / b; // 정수만 표현할수있으므로 소수점 표현이안되기때문에 2.5에서 2만나온다
        System.out.println("a / b =" + div); // 출력 a / b = 2 b를 0으로하면 여기부터 밑으로는 출력이 안된다

        //나머지
        int mod = a % b;
        System.out.println("a % b =" + mod);

    }
}
