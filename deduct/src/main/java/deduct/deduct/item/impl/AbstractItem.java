package deduct.deduct.item.impl;

import deduct.deduct.item.DeductItem;
import deduct.deduct.item.DeductRule;
import deduct.deduct.matcher.SeverityLadderBase;
import deduct.enums.DeductTypeEnum;
import deduct.enums.SeverityLadderTypeEnum;
import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

@Data
abstract class AbstractItem implements DeductItem {

    private final DeductTypeEnum deductType;

    private final long monthTotalMinutes;
    private final int monthTotalTimes;
    private final int monthTotalDays;
    private final BigDecimal monthTotalHours;

    private final List<Integer> minutesPerTimeList;
    private final List<Integer> hourPerTimeList;

    private final List<Integer> dailyTotalMinuteList;
    private final List<Integer> dailyTotalTimeList;
    private final List<Integer> dailyTotalHourList;

    private final DeductRule deductRule;

    public AbstractItem(long monthTotalMinutes, int monthTotalTimes, int monthTotalDays, BigDecimal monthTotalHours, List<Integer> minutesPerTimeList, List<Integer> hourPerTimeList, List<Integer> dailyTotalMinuteList, List<Integer> dailyTotalTimeList, List<Integer> dailyTotalHourList, DeductRule deductRule, DeductTypeEnum deductType) {
        this.monthTotalMinutes = monthTotalMinutes;
        this.monthTotalTimes = monthTotalTimes;
        this.monthTotalDays = monthTotalDays;
        this.monthTotalHours = monthTotalHours;
        this.minutesPerTimeList = minutesPerTimeList;
        this.hourPerTimeList = hourPerTimeList;
        this.dailyTotalMinuteList = dailyTotalMinuteList;
        this.dailyTotalTimeList = dailyTotalTimeList;
        this.dailyTotalHourList = dailyTotalHourList;
        this.deductRule = deductRule;
        this.deductType = deductType;
    }

    @Override
    public long getMonthTotalMinutes() {
        return monthTotalMinutes;
    }

    @Override
    public int getMonthTotalTimes() {
        return monthTotalTimes;
    }

    @Override
    public int getMonthTotalDays() {
        return monthTotalDays;
    }

    @Override
    public BigDecimal getMonthTotalHours() {
        return monthTotalHours;
    }

    @Override
    public List<Integer> getPerTimeMinuteList() {
        return minutesPerTimeList;
    }

    @Override
    public List<Integer> getPerTimeHourList() {
        return hourPerTimeList;
    }

    @Override
    public List<Integer> getDayTotalMinuteList() {
        return dailyTotalMinuteList;
    }

    @Override
    public List<Integer> getDayTotalHourList() {
        return dailyTotalHourList;
    }

    @Override
    public List<Integer> getDayTotalTimeList() {
        return dailyTotalTimeList;
    }


    // 规则类, 一下为差异部分
    @Override
    public BigDecimal getDeductUnit() {
        return deductRule.getDeductUnit(deductType);
    }

    @Override
    public BigDecimal getFixAmount() {
        return deductRule.getFixAmount(deductType);
    }

    @Override
    public int getFreeAmount() {
        return deductRule.getFreeAmount(deductType);
    }

    @Override
    public SeverityLadderTypeEnum getSeverityLadderType() {
        return deductRule.getSeverityLadderType(deductType);
    }

    @Override
    public List<SeverityLadderBase> getCombineLadders() {
        return deductRule.getCombineLadders(deductType);
    }

    public static void main(String[] args) {
        System.out.println("hello world");
    }

}
