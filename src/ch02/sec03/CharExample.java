package ch02.sec03;

public class CharExample {

    public static void main(String[] args) {
        char c1 = 'A';
        char c2 = 65;

        char c3 = '가';
        char c4 = 44032;
        char c5 = ' '; // 단순히 초기화목적이면 이렇게 공백 (유니코드:32)하나 포함해서 초기화해야한다.
        char c6;

        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
        System.out.println(c4);
    }
}
