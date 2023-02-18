package ch02;

public enum Grade {
    SLIVER("SLIVER"),
    GOLD("GOLD"),
    VIP("VIP"),;

    private final String value;

    Grade(String value){
        this.value = value;

    }

    public String getValue(){
        return value;
    }
}
