package deduct.dto;

import lombok.Data;

@Data
public class DeductDataSourceDTO {
    private DailyLateDataDTO lateData;
    private DailyEarlyDataDTO earlyData;
    private DailyMissCardDataDTO missCardData;
    private DailyAbsenteeismDataDTO AbsenteeismData;
}
