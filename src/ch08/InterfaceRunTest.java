package ch08;
/*
* 인터페이스
* 모든 메서드가 추상 메서드로 선언됨 public abstract
* 모든 변수는 상수로 선언된 public static final
* interface 인터페이스 이름{
*   public static final float pi = 3.14;
*   public void makeSomething();
* }
*
* */
public class InterfaceRunTest {
    public static void main(String[] args) {
        int number1 = 10;
        int number2 = 2;
        Calc calc = new CompleteCalc();
        System.out.println(calc.add(number1,number2));
        System.out.println(calc.subtract(number1,number2));
        System.out.println(calc.times(number1,number2));
        System.out.println(calc.divide(number1,number2));

    }
}
