package deduct.dto;

import lombok.Data;

import java.util.List;

@Data
public class DailyLateDataDTO {
    // 每日迟到分钟数列表
    private List<Integer> dailyLateMinuteList;
}
