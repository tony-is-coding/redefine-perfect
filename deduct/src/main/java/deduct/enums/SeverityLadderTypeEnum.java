package deduct.enums;

public enum SeverityLadderTypeEnum {
    LADDER(1), // 阶梯
    SEGMENT(2); // 分段

    private final int value;

    SeverityLadderTypeEnum(int value) {
        this.value = value;
    }

    public int getValue() {
        return this.value;
    }

    public static SeverityLadderTypeEnum valueOf(int value) {
        for (SeverityLadderTypeEnum e : SeverityLadderTypeEnum.values()) {
            if (e.getValue() == value) {
                return e;
            }
        }
        return LADDER;
    }
}
