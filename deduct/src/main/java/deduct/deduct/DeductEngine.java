package deduct.deduct;

import deduct.deduct.calculator.DeductCalculator;
import deduct.deduct.calculator.DeductCalculatorFactory;
import deduct.deduct.item.DeductItem;
import deduct.deduct.item.DeductRule;
import deduct.domain.entity.DeductResult;
import deduct.dto.DeductResultDTO;
import deduct.enums.DeductTypeEnum;
import lombok.Data;

@Data
public class DeductEngine {

    private DeductItem lateItem;
    private DeductItem earlyItem;
    private DeductItem missCardItem;
    private DeductItem absenteeismItem;

    private DeductRule deductRule;

    private DeductCalculatorFactory calculatorFactory;

    public DeductResultDTO deduct() {
        DeductResultDTO results = new DeductResultDTO();
        results.setEarlyDeduct(deductEarly());
        results.setLateDeduct(deductLate());
        results.setMissCardDeduct(deductMissCard());
        results.setAbsenteeismDeduct(deductAbsenteeism());
        return results;
    }

    private DeductResult deductLate() {
        DeductCalculator calculator = calculatorFactory.create(deductRule.getDeductMethod(DeductTypeEnum.LATE));
        return calculator.calculate(lateItem, new DeductResult());
    }

    private DeductResult deductEarly() {
        DeductCalculator calculator = calculatorFactory.create(deductRule.getDeductMethod(DeductTypeEnum.EARLY));
        return calculator.calculate(earlyItem, new DeductResult());
    }

    private DeductResult deductMissCard() {
        DeductCalculator calculator = calculatorFactory.create(deductRule.getDeductMethod(DeductTypeEnum.MISS_CARD));
        return calculator.calculate(missCardItem, new DeductResult());
    }

    private DeductResult deductAbsenteeism() {
        DeductCalculator calculator = calculatorFactory.create(deductRule.getDeductMethod(DeductTypeEnum.ABSENTEEISM));
        return calculator.calculate(absenteeismItem, new DeductResult());
    }

}
