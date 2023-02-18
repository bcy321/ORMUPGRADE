package ch08;

public class CompleteCalc extends Calculator{
    @Override
    public int times(int number1, int number2) {
        return number1*number2;
    }

    @Override
    public int divide(int number1, int number2) {
        if (number2 == 0){
            return ERROR;
        }
        return number1/number2;
    }

    public void showInfo(){
        System.out.println("모두 구현했습니다.");
    }
}
