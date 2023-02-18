package ch02;

/*
* */
public class VipCustomer extends Customer {

    double salesRatio;
    private String agentId;

    public VipCustomer(int customerId, String customerName) {
        super(customerId, customerName);
        bonusRatio = 0.05;
        salesRatio = 0.1;
        customerGrade = Grade.VIP.getValue();
        System.out.println("VipCustomer Call");

    }

//    public VipCustomer() {
//        super(); //상위클래스 참조
//        bonusRatio = 0.05;
//        salesRatio = 0.1;
//        customerGrade = Grade.VIP.getValue();
//        System.out.println("VipCustomer Call");
//    }

    public String getAgentId() {
        return agentId;
    }
}
