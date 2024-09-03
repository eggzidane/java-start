package scanner.ex;

import java.util.Scanner;

public class ScannerEx4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("구구단의 단 수 입력해주세요: ");
        int grade = scanner.nextInt();

        for (int num = 1; num <= 9; num++) {
            int multiply = grade * num;
            System.out.println(grade + " X " + num + " = " + multiply);
        }
    }
}
