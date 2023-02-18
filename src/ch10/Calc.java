package ch10;

public interface Calc {
    double PI = 3.14;
    int ERROR = Integer.MIN_VALUE;

    int add(int n1, int n2);
    int sub(int n1, int n2);
    int mul(int n1, int n2);
    int div(int n1, int n2);

    default void description(){
        System.out.println("정수의 사칙연산을 제공합니다.");
    }

    static int total(int[] arr){
        int total = 0;
        for (int n : arr){
            total+=n;
        }
        return total;
    }


}
