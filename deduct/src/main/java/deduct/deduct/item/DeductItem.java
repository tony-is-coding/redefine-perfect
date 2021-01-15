package deduct.deduct.item;

import deduct.deduct.matcher.SeverityLadderBase;
import deduct.enums.SeverityLadderTypeEnum;

import java.math.BigDecimal;
import java.util.List;

public interface DeductItem {
    // ============= 数据部分 =======================
    long getMonthTotalMinutes();

    int getMonthTotalTimes();

    @Deprecated
    int getMonthTotalDays();

    @Deprecated
    BigDecimal getMonthTotalHours();

    List<Integer> getPerTimeMinuteList();

    List<Integer> getPerTimeHourList();

    List<Integer> getDayTotalMinuteList();

    @Deprecated
    List<Integer> getDayTotalHourList();

    List<Integer> getDayTotalTimeList();

    // ============== 规则部分 =============

    SeverityLadderTypeEnum getSeverityLadderType();

    /**
     * 获取组合 阶梯/分段 扣款 主要针对高级规则
     */
    List<SeverityLadderBase> getCombineLadders();

    /**
     * 获取单位计价(元), 主要针对普通规则
     */
    BigDecimal getDeductUnit();

    /**
     * 获取 固定计价(元), 主要针对普通规则
     */
    BigDecimal getFixAmount();

    /**
     * 获取每月基础不扣款 (分钟/次数共用一个字段了)
     */
    int getFreeAmount();


}
