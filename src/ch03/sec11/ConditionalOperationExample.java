package ch03.sec11;

import ch03.sec05.InfinityAndNaNCheckExample;

public class ConditionalOperationExample {

    public static void main(String[] args) {
        int score = 75;
        char grade = (score > 90) ? 'A' : ((score > 80) ? 'B' : 'C');
        System.out.println(score + "점은 " + grade + "등급입니다.");
    }
}
