package deduct.deduct.item;

import deduct.deduct.matcher.SeverityLadderBase;
import deduct.enums.DeductMethodEnum;
import deduct.enums.DeductTypeEnum;
import deduct.enums.SeverityLadderTypeEnum;

import java.math.BigDecimal;
import java.util.List;

public interface DeductRule {
    DeductMethodEnum getDeductMethod(DeductTypeEnum deductType);

    BigDecimal getDeductUnit(DeductTypeEnum deductType);

    BigDecimal getFixAmount(DeductTypeEnum deductType);

    int getFreeAmount(DeductTypeEnum deductType);

    SeverityLadderTypeEnum getSeverityLadderType(DeductTypeEnum deductTypeEnum);

    List<SeverityLadderBase> getCombineLadders(DeductTypeEnum deductTypeEnum);
}
