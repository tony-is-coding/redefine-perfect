package deduct.deduct.matcher;

import deduct.enums.DeductFeeUnitEnum;

import java.math.BigDecimal;

/**
 * 阶梯阶段 计算差异;
 */
public interface SeverityLadderBase {
    boolean match();

    int getLowThreshold();

    int getHighThreshold();

    DeductFeeUnitEnum getUnit();

    BigDecimal getFee();

}
