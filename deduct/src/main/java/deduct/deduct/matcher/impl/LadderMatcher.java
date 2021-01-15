package deduct.deduct.matcher.impl;

import deduct.deduct.matcher.SeverityLadderBase;
import deduct.deduct.matcher.SeverityLadderMatcher;
import deduct.domain.entity.DeductResult;

import java.util.Comparator;
import java.util.List;

/**
 * 按照阶梯扣款
 */
public class LadderMatcher implements SeverityLadderMatcher {

    @Override
    public DeductResult calculateMatching(long amount, List<SeverityLadderBase> combineLadders, DeductResult result) {
        // 确保进入扣款match 的result 是经过初始化了的
        combineLadders.sort(Comparator.comparing(SeverityLadderBase::getLowThreshold));
        for (SeverityLadderBase ladder : combineLadders) {
            if (ladder.match()) {
                int tmp_amount = Math.min((int) amount, ladder.getHighThreshold()) - ladder.getLowThreshold();
                result.add(ladder.getUnit(), tmp_amount, ladder.getFee());
            }
        }
        return result;
    }
}
