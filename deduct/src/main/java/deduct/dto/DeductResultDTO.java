package deduct.dto;

import deduct.domain.entity.DeductResult;
import lombok.Data;

/**
 * 考勤扣款 每次计算都是全量的计算, 不考虑增量的场景
 */
@Data
public class DeductResultDTO {
    private DeductResult lateDeduct;
    private DeductResult earlyDeduct;
    private DeductResult missCardDeduct;
    private DeductResult absenteeismDeduct;
}
