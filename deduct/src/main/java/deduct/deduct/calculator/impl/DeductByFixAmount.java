package deduct.deduct.calculator.impl;

import deduct.deduct.calculator.DeductCalculator;
import deduct.deduct.item.DeductItem;
import deduct.domain.entity.DeductResult;
import org.springframework.stereotype.Service;

/**
 * 按固定金额
 */
@Service
public class DeductByFixAmount implements DeductCalculator {
    @Override
    public DeductResult calculate(DeductItem item, DeductResult result) {
        result.setMoney(item.getFixAmount());
        return result;
    }
}
