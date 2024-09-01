package loop.ex;

public class ForEx3 {

    public static void main(String[] args) {
        int max = 5;
        int sum = 0;
        for (int i = 1; i <= max; i++) {
            sum += i;
        }
        System.out.println(sum); // i~max 합을 보려면 sout은 for문 밖에서 실행하게한다.
    }
}
