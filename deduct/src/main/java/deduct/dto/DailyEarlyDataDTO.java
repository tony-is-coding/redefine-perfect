package deduct.dto;

import lombok.Data;

import java.util.List;

@Data
public class DailyEarlyDataDTO {
    // 每日早退分钟数列表
    private List<Integer> dailyEarlyMinuteList;
}
