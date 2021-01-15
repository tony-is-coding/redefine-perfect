package deduct.dto;

import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

@Data
public class DailyAbsenteeismDataDTO {
    // 每日旷工小时数
    private List<BigDecimal> dailyAbsentHourList;
}
