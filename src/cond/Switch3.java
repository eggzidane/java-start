package cond;

public class Switch3 {
    public static void main(String[] args) {
        int grade = 3;

        int coupon;
        switch (grade) {
            case 1:
                coupon = 1000;
                break;
            case 2: //브레이크가없기에 2번실행했는데 없네? -> 3번으로감 이게 switch문의 특징이다. 실행 -> 브레이크 ->출력
            case 3:
                coupon = 3000;
                break;
            default:
                coupon = 500;


        }
        System.out.println("발급받은 쿠폰 " + coupon + "원");
    }
}
