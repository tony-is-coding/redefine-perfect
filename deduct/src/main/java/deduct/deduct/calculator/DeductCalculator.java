package deduct.deduct.calculator;

import deduct.deduct.item.DeductItem;
import deduct.domain.entity.DeductResult;

public interface DeductCalculator {
    DeductResult calculate(DeductItem item, DeductResult result);
}
