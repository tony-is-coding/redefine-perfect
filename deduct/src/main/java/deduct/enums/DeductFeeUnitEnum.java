package deduct.enums;

/**
 * 扣款 计费单位
 */
public enum DeductFeeUnitEnum {
    PER_MINUTE(1), //  xx元每次
    PER_TIME(2), // xx元每分钟
    LEAVE(3), // 记事假
    ABSENTEEISM(4); // 记

    private final int value;

    DeductFeeUnitEnum(int value) {
        this.value = value;
    }

    public int getValue() {
        return this.value;
    }

    public static DeductFeeUnitEnum valueOf(int value) {
        for (DeductFeeUnitEnum e : DeductFeeUnitEnum.values()) {
            if (e.getValue() == value) {
                return e;
            }
        }
        return PER_MINUTE;
    }
}
