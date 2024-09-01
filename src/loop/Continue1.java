package loop;

public class Continue1 {

    public static void main(String[] args) {
        int i = 1;


        while (i <= 5) {
            if (i == 3) {
                i++;
                continue; // 3이면 1증가하고 While문 시작부분으로 다시 돌아감
            }
            System.out.println(i);
            i++;
        }
    }
}
