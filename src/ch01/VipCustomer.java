package ch01;
/*
* */
public class VipCustomer extends Customer{

    double salesRatio;
    private String agentId;

    public VipCustomer() {
        bonusRatio = 0.05;
        salesRatio = 0.1;
        customerGrade = Grade.VIP.getValue();
    }

    public String getAgentId() {
        return agentId;
    }
}
