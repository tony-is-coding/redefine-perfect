package deduct.deduct.item.impl;

import deduct.deduct.item.DeductRule;
import deduct.deduct.matcher.SeverityLadderBase;
import deduct.enums.DeductTypeEnum;
import deduct.enums.SeverityLadderTypeEnum;

import java.math.BigDecimal;
import java.util.List;

public class LateItem extends AbstractItem {
    public LateItem(long monthTotalMinutes, int monthTotalTimes, int monthTotalDays, BigDecimal monthTotalHours, List<Integer> minutesPerTimeList, List<Integer> hourPerTimeList, List<Integer> dailyTotalMinuteList, List<Integer> dailyTotalTimeList, List<Integer> dailyTotalHourList, DeductRule deductRule) {
        super(monthTotalMinutes, monthTotalTimes, monthTotalDays, monthTotalHours, minutesPerTimeList, hourPerTimeList, dailyTotalMinuteList, dailyTotalTimeList, dailyTotalHourList, deductRule, DeductTypeEnum.LATE);
    }
}
