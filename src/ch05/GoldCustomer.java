package ch05;

public class GoldCustomer extends Customer{

    double salesRatio;

    public GoldCustomer(int customerId, String customerName) {
        super(customerId, customerName);
        salesRatio = 0.1;
        bonusRatio = 0.02;
        customerGrade = GradeType.GOLD.getValue();
    }

    @Override
    public int calcBonusPoint(int price) {
        bonusPoint += price*bonusRatio;
        return price - (int)(price*salesRatio);
    }
}
