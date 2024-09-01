package cond;

public class If4 {
    public static void main(String[] args) {
        int age = 8;
        //if-else if문은 true이면 체크x false면 다음 조건으로 넘어간다. 모두 false면 else가 출력된다.

        if (age <= 7) {
            System.out.println("미취학");
        } else if (age <= 13) {
            System.out.println("초등학생");
        } else if (age <= 16) {
            System.out.println("중학생");
        } else if (age < 19) {
            System.out.println("고등학생");
        } else {
            System.out.println("성인");
        }
    }
}
