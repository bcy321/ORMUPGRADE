package ch11;
/*
* 여러 인터페이스 구현하기, 인터페이스의 상속
* 여러 인터페이스 구현
* 자바의 인터페이스는 구현 코드가 없으므로 하나의 클래스가 여러 인터페이스는 구현 할 수 없음
* 디폴트 메서드가 중복되는 경우는 구현하는 클래스에서 재정의 하여야 함
* 여러 인터페이스를 구현한 클래스는 인터페이스 타입으로 형 변환 되는 경우 해당 인터페이스에 선언된 메서드만 사용 가능 함
*
*
* */
public class InterFaceFinalRun {
    public static void main(String[] args) {
        Customer customer = new Customer();
        customer.buy();
        customer.sell();
        customer.hello();
        customer.order();
        System.out.println("------------------------");
        Buy buyer = customer;
        buyer.buy();
        buyer.order();
        System.out.println("------------------------");
        Sell sell = customer;
        sell.sell();
        sell.order();

    }
}
