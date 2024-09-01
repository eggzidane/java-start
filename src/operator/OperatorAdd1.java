package operator;

public class OperatorAdd1 {
    public static void main(String[] args) {
        int a = 0;

        a = a + 1;
        System.out.println("a = " + a); //soutv로하면 바로되고 값은 1

        a = a + 1;
        System.out.println("a = " + a); //2

        //증감 연산자
        ++a; // a = a + 1
        System.out.println("a = " + a); //3
        ++a; // a = a + 1
        System.out.println("a = " + a); //4
        --a; // a = a - 1
        System.out.println("a = " + a); //3
    }
}
