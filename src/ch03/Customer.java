package ch03;

public class Customer {
    private int customerId;
    private String customerName;
    protected String customerGrade;
    int bonusPoint;
    double bonusRatio;

    public Customer(int customerId, String customerName) {
        this.customerId = customerId;
        this.customerName = customerName;
        bonusRatio = 0.01;
        customerGrade = CustomerGrade.SILVER.getValue();
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerGrade() {
        return customerGrade;
    }

    public void setCustomerGrade(String customerGrade) {
        this.customerGrade = customerGrade;
    }

    public int calcPrice(int price){
        bonusPoint += price * bonusRatio;
        return price;
    }
    public String showCustomerInfo(){
        String showText = customerName + "님의 등급은 " + customerGrade + "이며, 보너스 포인트는 " + bonusPoint + "입니다.";
        return showText;
    }
}
