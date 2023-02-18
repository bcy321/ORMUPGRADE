package ch03;

public enum CustomerGrade {
    SILVER("SILVER"),
    GOLD("GOLD"),
    VIP("VIP");

    private final String value;

    CustomerGrade(String value){
        this.value = value;

    }
    public String getValue(){
        return value;
    }
}
