package deduct.domain.entity;

import deduct.deduct.item.DeductRule;
import deduct.deduct.matcher.SeverityLadderBase;
import deduct.enums.DeductMethodEnum;
import deduct.enums.DeductTypeEnum;
import deduct.enums.SeverityLadderTypeEnum;
import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

@Data
public class DeductRuleEntity implements DeductRule {
    @Override
    public DeductMethodEnum getDeductMethod(DeductTypeEnum deductType) {
        return null;
    }

    @Override
    public BigDecimal getDeductUnit(DeductTypeEnum deductType) {
        return null;
    }

    @Override
    public BigDecimal getFixAmount(DeductTypeEnum deductType) {
        return null;
    }

    @Override
    public int getFreeAmount(DeductTypeEnum deductType) {
        return 0;
    }

    @Override
    public SeverityLadderTypeEnum getSeverityLadderType(DeductTypeEnum deductTypeEnum) {
        return null;
    }

    @Override
    public List<SeverityLadderBase> getCombineLadders(DeductTypeEnum deductTypeEnum) {
        return null;
    }
}
