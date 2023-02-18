package ch05;

public class VipCustomer extends Customer{

    private int agentId;
    double salesRatio;

    public VipCustomer(int customerId, String customerName) {
        super(customerId, customerName);
        bonusRatio = 0.05;
        salesRatio = 0.1;
        customerGrade = GradeType.VIP.getValue();
    }

    @Override
    public int calcBonusPoint(int price) {
        bonusPoint += price * bonusRatio;
        price -= (int)(price * salesRatio);
        return price;
    }

    public int getAgentId() {
        return agentId;
    }
}
