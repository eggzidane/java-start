package array;

public class Array1Ref2 {

    public static void main(String[] args) {
        int[] students; //1.배열 변수 선언
        students = new int[5]; //2. 배열 생성과 초기화 -> students 가 참조값을 반환해서 가진다
                               //참조값: 메모리 주소
        System.out.println(students);

        //변수 값 대입
        students[0] = 90;
        students[1] = 80;
        students[2] = 70;
        students[3] = 60;
        students[4] = 50;

        //변수 값 사용
        for(int i = 0; i < students.length; i++) {
            System.out.println("학생" + (i + 1) + "점수: " + students[i]); // (i+1) 해줘야함.
        }
    }
}
