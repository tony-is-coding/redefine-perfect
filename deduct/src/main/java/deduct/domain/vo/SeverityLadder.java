package deduct.domain.vo;

import deduct.enums.CompareSymbolEnum;
import deduct.enums.DeductFeeUnitEnum;

import java.math.BigDecimal;

public class SeverityLadder {
    private CompareSymbolEnum lowRelation;
    private CompareSymbolEnum highRelation;
    private int lowThreshold;
    private int highThreshold;
    private DeductFeeUnitEnum unit;
    private BigDecimal fee;
}
