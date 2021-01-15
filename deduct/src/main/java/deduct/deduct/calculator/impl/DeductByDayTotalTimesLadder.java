package deduct.deduct.calculator.impl;

import deduct.deduct.calculator.DeductCalculator;
import deduct.deduct.item.DeductItem;
import deduct.deduct.matcher.SeverityLadderMatcher;
import deduct.deduct.matcher.SeverityLadderMatcherFactory;
import deduct.domain.entity.DeductResult;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 按每天累计次数 阶梯
 */
@Service
public class DeductByDayTotalTimesLadder implements DeductCalculator {
    @Override
    public DeductResult calculate(DeductItem item, DeductResult result) {
        SeverityLadderMatcher matcher = SeverityLadderMatcherFactory.create(item.getSeverityLadderType());
        DeductResult tempResult = DeductResult.temp();
        List<Integer> dayTotalTimesList = item.getDayTotalTimeList();
        for (Integer amount : dayTotalTimesList) {
            tempResult = matcher.calculateMatching(amount.longValue(), item.getCombineLadders(), tempResult);
            result.incrBy(tempResult);
            tempResult.clear();
        }
        return result;
    }
}
