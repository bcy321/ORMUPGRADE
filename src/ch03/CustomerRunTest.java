package ch03;
/*
* 메서드 재정의와 가상 메서드 원리
* 메서드의 이름은 주소값을 나타냄
* 메서드는 명령어의 set이고 프로그램이 로드되면 메서드 영역에 명령어 set이 위치
* 해당 메서드가 호출 되면 명령어 set이 있는 주소를 찾아 명령어가 실행됨
* 이때 메서드에서 사용하는 변수들은 스택 메모리에 위치하게됨
* 따라서 다른 인스턴스라도 같은 메서드의 코드는 같으므로 메서드가 호출됨
* 인스턴스가 생성되면 변수는 힙메모리에 따로 생성되지만 메서드 명령어 set은 처음 한번만 로드됨
*
* */
public class CustomerRunTest {
    public static void main(String[] args) {

        int price = 1000;

        Customer c1 = new Customer(1000,"김철수");
        c1.bonusPoint = 1000;
        System.out.println(c1.showCustomerInfo());
        System.out.println(c1.getCustomerName() + "님의 구매 내역은" + c1.calcPrice(price) + "입니다.");

        VipCustomer v1 = new VipCustomer(2000, "이브입");
        v1.bonusPoint = 10000;
        System.out.println(v1.showCustomerInfo());
        System.out.println(v1.getCustomerName() + "님의 구매 내역은" + v1.calcPrice(price) + "입니다.");

        Customer vc = new VipCustomer(12345, "Noname");
        System.out.println(vc.calcPrice(1000));
    }
}
