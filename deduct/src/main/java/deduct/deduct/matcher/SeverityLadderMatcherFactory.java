package deduct.deduct.matcher;

import deduct.deduct.matcher.impl.LadderMatcher;
import deduct.deduct.matcher.impl.SegmentMatcher;
import deduct.enums.SeverityLadderTypeEnum;

public class SeverityLadderMatcherFactory {
    public static SeverityLadderMatcher create(SeverityLadderTypeEnum type) {
        switch (type) {
            case SEGMENT:
                return new SegmentMatcher();
            case LADDER:
            default:
                return new LadderMatcher();
        }
    }
}
