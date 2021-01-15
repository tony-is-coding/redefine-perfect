package deduct.dto;

import java.util.List;

public class DefinedDeductFormulaDTO {
    private boolean isStep; // 是否开启阶梯
    private boolean isOpenOther; // 是否开启额外扣款
    private Object value; // 自定义扣款公式值 可能为阶梯
    private List<DefinedSeverityLadderDTO> otherValue; // 自定义公式额外扣款 必须是阶梯
}
