package scanner.ex;

import java.util.Scanner;

public class ScannerWhileEx1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while(true) {
            System.out.print("이름을 입력하세요 (exit를 입력하면 종료): ");
            String name = scanner.nextLine();

            if (name.equals("exit")) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }
            System.out.print("나이를 입력하세요: ");
            int age = scanner.nextInt(); // 10\n 10만 가져감
            scanner.nextLine(); // 남은 \n를 읽어줌


            System.out.println("입력한 이름: " + name +", 나이: " + age);
        }
    }
}
