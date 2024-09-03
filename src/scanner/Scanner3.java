package scanner;

import java.util.Scanner;

public class Scanner3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("첫 번째 숫자를 입력하세요. :");
        int num1 = input.nextInt();

        System.out.print("두 번쨰 숫자를 입력하세요. :");
        int num2 = input.nextInt();

        if (num1 > num2) {
            System.out.println("더 큰 숫자: " + num1);
        } else if (num1 < num2) {
            System.out.println("더 큰 숫자: " + num2);
        } else {
            System.out.println("두 숫자는 크기가 같습니다."); //이 조건떄문에 삼항연산자가 안된다.
        }



    }
}
