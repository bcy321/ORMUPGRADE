package ch05;

import java.util.ArrayList;

public class CustomerRunTest {
    public static void main(String[] args) {
        ArrayList<Customer> customerArrayList = new ArrayList<>();
        Customer c1 = new Customer(1000, "tomas");
        Customer c2 = new GoldCustomer(1001, "james");
        Customer c3 = new VipCustomer(1002, "edward");
        Customer c4 = new Customer(1003, "devintel");
        customerArrayList.add(c1);
        customerArrayList.add(c2);
        customerArrayList.add(c3);
        customerArrayList.add(c4);
        for (Customer customer : customerArrayList){
            System.out.println(customer.showCustomerInfo());
        }

        int price = 10000;
        for (Customer customer : customerArrayList){
            System.out.println(customer.getCustomerName() + "님이 " + customer.calcBonusPoint(price) + "원을 지불하셨습니다.");
            System.out.println(customer.getCustomerName() + "님의 보너스 포인트는 " + customer.bonusPoint + "점 입니다.");
        }

    }
}
