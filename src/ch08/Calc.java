package ch08;

public interface Calc {
    double PI = 3.14;
    int ERROR = Integer.MIN_VALUE;

    int add(int number1, int number2);
    int subtract(int number1, int number2);
    int times(int number1, int number2);
    int divide(int number1, int number2);
}
