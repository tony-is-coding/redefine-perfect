package deduct.deduct.calculator.impl;

import deduct.deduct.calculator.DeductCalculator;
import deduct.deduct.item.DeductItem;
import deduct.domain.entity.DeductResult;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

/**
 * 按次数
 */
@Service
public class DeductByTimes implements DeductCalculator {
    @Override
    public DeductResult calculate(DeductItem item, DeductResult result) {
        if (item.getMonthTotalTimes() > item.getFreeAmount()) {
            result.setMoney(item.getDeductUnit().multiply(BigDecimal.valueOf(item.getMonthTotalTimes())));
        }
        return result;
    }
}
