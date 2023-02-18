package ch06;
/*
* 추상 클래스 구현하기
* 구현 코드 없이 메서드의 선언만 있는 추상 메서드를 포함한 클래스
* 메서드 선언 : 변환타입, 메서드 이름, 매개변수로 구성
* 메서드 정의 : 메서드 구현과 동일한 의미 구현부 body {}를 가짐
* abstract 예약어 사용
* 추상 클래스는 new 할 수 없음
*
* */
public class AbstractClassRunTest {
    public static void main(String[] args) {
        Computer desktop = new Desktop();
        desktop.display();

    }
}
