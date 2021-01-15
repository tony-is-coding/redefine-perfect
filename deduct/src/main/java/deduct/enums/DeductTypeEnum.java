package deduct.enums;

public enum DeductTypeEnum {
    LATE(1),
    EARLY(2),
    MISS_CARD(3),
    ABSENTEEISM(4),
    FIXED(5);

    private final int value;


    DeductTypeEnum(int value) {
        this.value = value;
    }

    public int getValue() {
        return this.value;
    }

}
