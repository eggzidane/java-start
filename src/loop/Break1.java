package loop;

public class Break1 {

    public static void main(String[] args) {
        int sum = 0;
        int i = 1;

        while (true) {
            sum = sum + i;
            if(sum > 1000) {
                System.out.println("합이 10보다 크면 종료: i=" + i + " sum=" + sum);
                break; // sum <=1000 일때는 if문 실행X break는 if가아니라 while문 자체를 나온다.
            }
            i++;
        }
    }
}
