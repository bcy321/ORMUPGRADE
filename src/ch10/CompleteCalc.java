package ch10;

public class CompleteCalc extends Calculator{

    @Override
    public int mul(int n1, int n2) {
        return n1*n2;
    }

    @Override
    public int div(int n1, int n2) {
        if(n2 == 0){
            return ERROR;
        }

        return n1/n2;
    }

    @Override
    public void description() {
        System.out.println("complete calc desc()");
    }

    public void showInfo(){
        System.out.println("모두 구현 완료");
    }
}
