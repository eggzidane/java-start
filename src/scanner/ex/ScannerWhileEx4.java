package scanner.ex;

import java.util.Scanner;

public class ScannerWhileEx4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int totalCost = 0;

        while (true) {
            System.out.println("1: 상품 입력, 2: 결제, 3: 프로그램 종료");
            int select = scanner.nextInt();
            scanner.nextLine();

            if(select == 1) {
                System.out.print("상품명을 입력하세요: ");
                String name = scanner.nextLine();

                System.out.print("상품의 가격을 입력하세요: ");
                int price = scanner.nextInt();

                System.out.print("구매 수량을 입력하세요: ");
                int number = scanner.nextInt();

                totalCost += price * number;
                System.out.println("상품명:" + name + " 가격:" + price + " 합계:" + totalCost);

            } else if (select == 2) {
                System.out.println("총 비용: " +totalCost);
                totalCost = 0;

            } else if (select == 3) {
                System.out.println("프로그램을 종료합니다.");
                break;

            } else {
                System.out.println("잘못된 선택입니다. 올바른 숫자를 입력해주세요.");
            }






        }
    }
}
