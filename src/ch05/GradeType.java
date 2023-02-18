package ch05;

public enum GradeType {
    SILVER("SILVER"),
    GOLD("GOLD"),
    VIP("VIP");

    private final String value;

    GradeType(String value){
        this.value = value;

    }
    public String getValue(){
        return value;
    }
}
