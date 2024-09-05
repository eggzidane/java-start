package array;

public class Array1Ref3 {

    public static void main(String[] args) {
        int[] students; //1.배열 변수 선언
        students = new int[]{90, 80, 70, 60, 50}; //2. 배열 생성과 초기화 -> students 가 참조값을 반환해서 가진다
                                                  //참조값: 메모리 주소

        //변수 값 사용
        for(int i =0; i < students.length; i++) {
            System.out.println("학생" + (i + 1) + "점수: " + students[i]); // (i+1) 해줘야함.
        }
    }
}
