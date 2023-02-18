package ch08;

public abstract class Calculator implements Calc{
    @Override
    public int add(int number1, int number2) {
        return number1+number2;
    }

    @Override
    public int subtract(int number1, int number2) {
        return number1-number2;
    }
}
