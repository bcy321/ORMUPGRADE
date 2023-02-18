package ch03;


public class VipCustomer extends Customer{
    double salesRatio;
    private String agentId;

    public VipCustomer(int customerId, String customerName) {
        super(customerId, customerName);
        bonusRatio = 0.05;
        salesRatio = 0.1;
        customerGrade = CustomerGrade.VIP.getValue();
    }

    public String getAgentId() {
        return agentId;
    }

    @Override
    public int calcPrice(int price) {
        bonusPoint += price * bonusRatio;
        price -= (int)(price * salesRatio);
        return price;
    }
}
