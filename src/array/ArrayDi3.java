package array;

public class ArrayDi3 {

    public static void main(String[] args) {
        // 2x3 2차원 배열을 만든다.
        int[][] arr = new int[][]{
            {1,2,3},
            {4,5,6}
        }; //행2, 열3

        for (int row = 0; row < arr.length; row++) {
            for (int column = 0; column < arr[row].length; column++) {
                System.out.print(arr[row][column] + " ");
            }
            System.out.println();//한 행이 끝나면 열을 변경한다.
        }
    }
}
