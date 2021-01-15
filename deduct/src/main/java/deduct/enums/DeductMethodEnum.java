package deduct.enums;

/**
 * 扣款方式
 */
public enum DeductMethodEnum {

    NONE(0), // 不扣款
    BY_MINUTES(1), // 按分钟扣款
    BY_TIMES(2), // 按次数扣款
    BY_FIX_AMOUNT(3),// 按固定金额
    BY_PER_TIME_MINUTES_COMBINE(4), // 按单(每次)次分钟数组合扣款
    BY_PER_TIME_HOURS_COMBINE(5), // 按单(每次)次小时数组合扣款
    BY_MONTH_TOTAL_MINUTES_COMBINE(6), // 按月累计分钟数 组合扣款
    BY_MONTH_TOTAL_TIMES_COMBINE(7), // 按月累计次数 组合扣款
    BY_DAY_TOTAL_MINUTES_LADDER(8), // 按天累计分钟数 阶梯扣款
    BY_DAY_TOTAL_TIMES_LADDER(9), // 按天累计次数 阶梯扣款
    BY_SALARY_PROPORTION(10); // 按工资占比

    private final int value;


    DeductMethodEnum(int value) {
        this.value = value;
    }

    public int getValue() {
        return this.value;
    }

    // TODO: 为了兼容原来的设计
    public DeductMethodEnum from() {
        return BY_MINUTES;
    }

}
