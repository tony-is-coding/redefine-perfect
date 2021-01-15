package deduct.enums;

/**
 * 比较符号
 */
public enum CompareSymbolEnum {
    LT(1), // 小于
    LTE(2); // 小于等于
    private final int value;

    CompareSymbolEnum(int value) {
        this.value = value;
    }

    public int getValue() {
        return this.value;
    }

    public static CompareSymbolEnum valueOf(int value) {
        for (CompareSymbolEnum e : CompareSymbolEnum.values()) {
            if (e.getValue() == value) {
                return e;
            }
        }
        return LT;
    }

}
