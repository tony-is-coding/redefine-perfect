package deduct.deduct.matcher.impl;

import deduct.deduct.matcher.SeverityLadderBase;
import deduct.deduct.matcher.SeverityLadderMatcher;
import deduct.domain.entity.DeductResult;

import java.util.Comparator;
import java.util.List;

public class SegmentMatcher implements SeverityLadderMatcher {
    @Override
    public DeductResult calculateMatching(long amount, List<SeverityLadderBase> combineLadders, DeductResult result) {
        combineLadders.sort(Comparator.comparing(SeverityLadderBase::getLowThreshold).reversed());
        for (SeverityLadderBase ladder : combineLadders) {
            if (ladder.match()) {
                result.update(ladder.getUnit(), (int) amount, ladder.getFee());
                break;
            }
        }
        return result;
    }
}
