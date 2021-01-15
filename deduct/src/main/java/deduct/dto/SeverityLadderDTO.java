package deduct.dto;

import lombok.Data;


@Data
public class SeverityLadderDTO {
    private int low_relation; // 前一个比较符号
    private float fee; // 按 元/分钟、记事假 数量
    private int high_relation; // 后一个比较符号
    private int low; // 低位值
    private int high; // 高位值
    private int typ; // 按 元/分钟、记事假 单位
}
