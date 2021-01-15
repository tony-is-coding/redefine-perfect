package deduct.deduct.calculator.impl;

import deduct.deduct.calculator.DeductCalculator;
import deduct.deduct.item.DeductItem;
import deduct.deduct.matcher.SeverityLadderMatcher;
import deduct.deduct.matcher.SeverityLadderMatcherFactory;
import deduct.domain.entity.DeductResult;
import org.springframework.stereotype.Service;

/**
 * 按月累计次数组合扣款
 */
@Service
public class DeductByMonthTotalTimesCombine implements DeductCalculator {
    @Override
    public DeductResult calculate(DeductItem item, DeductResult result) {
        SeverityLadderMatcher matcher = SeverityLadderMatcherFactory.create(item.getSeverityLadderType());
        result = matcher.calculateMatching(item.getMonthTotalTimes(), item.getCombineLadders(), result);
        return result;
    }
}
