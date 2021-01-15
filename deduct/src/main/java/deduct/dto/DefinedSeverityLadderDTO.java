package deduct.dto;

import lombok.Data;

/*
    自定义公式下的 分段/阶梯 扣款项
 */
@Data
public class DefinedSeverityLadderDTO {
    private int low_relation; // 前一个比较符号
    private int high_relation; // 后一个比较符号
    private int low; // 低位值
    private int high; // 高位值
    private String value; // 解析公式

    // 原来二期为了做兼容而设计, 暂时不会用到
    private float fee; // 按 元/分钟、记事假 数量
    private int typ; // 按 元/分钟、记事假 单位

}
