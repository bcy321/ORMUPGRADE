package ch07;
/* 템플릿 메서드 패턴
* 추상 메서드나 구현된 메서드를 활용하여 코드의 흐름을 정의하는 메서드
* final로 선언하여 하위 클래스에서 재정의 할 수 없게 함
* 프레임워크에서 많이 사용되는 설계 패턴
* 추상 클래스롤 선언된 상위 클래스에서 템플릿 메서드를 활용하여 전체적인 흐름을 정의하고 하위클래스에서
* 다르게 구현되어야 하는 부분은 추상 메서드로 선언하여 하위클래스에서 구현 하도록 함함* */
public class TemplateMethodRun {
    public static void main(String[] args) {
        Car aiCar = new AiCar();
        aiCar.run();

        Car mCar = new ManualCar();
        mCar.run();
    }
}
