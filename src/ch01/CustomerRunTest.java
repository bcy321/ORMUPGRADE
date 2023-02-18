package ch01;

public class CustomerRunTest {
    public static void main(String[] args) {
        Customer customer1 = new Customer();
        customer1.setCustomerId(1234);
        customer1.setCustomerName("이순신");
        customer1.bonusPoint = 1000;
        System.out.println(customer1.showCustomerInfo());

        VipCustomer vipCustomer1 = new VipCustomer();
        vipCustomer1.setCustomerId(2345);
        vipCustomer1.setCustomerName("김유신");
        vipCustomer1.bonusPoint = 10000;
        System.out.println(vipCustomer1.showCustomerInfo());
    }
}
