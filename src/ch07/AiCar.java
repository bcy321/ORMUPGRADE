package ch07;

public class AiCar extends Car{
    @Override
    public void drive() {
        System.out.println("자율주행 합니다.");
        System.out.println("자동차가 스스로 방향을 바꿉니다.");
    }

    @Override
    public void stop() {
        System.out.println("자율주행 자동차가 정지합니다.");
    }

    @Override
    public void washCar() {
        System.out.println("차를 자동으로 세차 해줍니다.");
    }
}
