package deduct.deduct.calculator.impl;

import deduct.deduct.calculator.DeductCalculator;
import deduct.deduct.item.DeductItem;
import deduct.deduct.matcher.SeverityLadderMatcher;
import deduct.deduct.matcher.SeverityLadderMatcherFactory;
import deduct.domain.entity.DeductResult;
import org.springframework.stereotype.Service;

import java.util.List;


/**
 * 按每次分钟数 组合
 */
@Service
public class DeductByPerTimeMinutesCombine implements DeductCalculator {
    @Override
    public DeductResult calculate(DeductItem item, DeductResult result) {
        SeverityLadderMatcher matcher = SeverityLadderMatcherFactory.create(item.getSeverityLadderType());
        DeductResult tempResult = DeductResult.temp();
        List<Integer> perTimeMinuteList = item.getPerTimeMinuteList();
        for (Integer amount : perTimeMinuteList) {
            tempResult = matcher.calculateMatching(amount.longValue(), item.getCombineLadders(), tempResult);
            result.incrBy(tempResult);
            tempResult.clear();
        }
        return result;
    }
}
