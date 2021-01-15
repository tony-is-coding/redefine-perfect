package deduct.deduct.calculator;

import deduct.deduct.calculator.impl.*;
import deduct.enums.DeductMethodEnum;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class DeductCalculatorFactory {

    // TODO: 优化出单例来

    public DeductCalculator create(DeductMethodEnum deductMethod) {
        switch (deductMethod) {
            case NONE:
                return new DeductNone();
            case BY_MINUTES:
                return new DeductByMinutes();
            case BY_TIMES:
                return new DeductByTimes();
            case BY_FIX_AMOUNT:
                return new DeductByFixAmount();
            case BY_SALARY_PROPORTION:
                return new DeductBySalaryProportion();
            case BY_DAY_TOTAL_MINUTES_LADDER:
                return new DeductByDayTotalMinutesLadder();
            case BY_DAY_TOTAL_TIMES_LADDER:
                return new DeductByDayTotalTimesLadder();
            case BY_MONTH_TOTAL_MINUTES_COMBINE:
                return new DeductByMonthTotalMinutesCombine();
            case BY_MONTH_TOTAL_TIMES_COMBINE:
                return new DeductByMonthTotalTimesCombine();
            case BY_PER_TIME_HOURS_COMBINE:
                return new DeductByPerTimeHoursCombine();
            case BY_PER_TIME_MINUTES_COMBINE:
                return new DeductByPerTimeMinutesCombine();
            default:
                log.error("扣款类型不符合: {}", deductMethod.toString());
                return new DeductNone();
        }
    }
}
