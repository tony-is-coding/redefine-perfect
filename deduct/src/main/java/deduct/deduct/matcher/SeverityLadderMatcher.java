package deduct.deduct.matcher;

import deduct.domain.entity.DeductResult;

import java.util.List;

/**
 * 组合扣款下 阶梯/阶段匹配规则
 */
public interface SeverityLadderMatcher {
    /**
     * 阶梯/阶段 组合扣款器 进行 匹配扣款计算
     * @param amount
     * @param combineLadders
     * @param result
     * @return
     */
    DeductResult calculateMatching(long amount, List<SeverityLadderBase> combineLadders, DeductResult result);
}
