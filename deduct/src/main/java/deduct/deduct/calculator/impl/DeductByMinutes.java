package deduct.deduct.calculator.impl;

import deduct.deduct.calculator.DeductCalculator;
import deduct.deduct.item.DeductItem;
import deduct.domain.entity.DeductResult;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

/**
 * 按分钟数
 */
@Service
public class DeductByMinutes implements DeductCalculator {
    @Override
    public DeductResult calculate(DeductItem item, DeductResult result) {
        if (item.getMonthTotalMinutes() > item.getFreeAmount()) {
            result.setMoney(item.getDeductUnit().multiply(BigDecimal.valueOf(item.getMonthTotalMinutes())));
        }
        return result;
    }
}
