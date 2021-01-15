package deduct.domain.entity;

import deduct.enums.DeductFeeUnitEnum;
import lombok.Data;

import java.math.BigDecimal;

@Data
public class DeductResult {
    private String employeeId;
    private String companyId;
    private int year;
    private int month;

    private BigDecimal money;
    private BigDecimal leaveHour;
    private BigDecimal absenteeismHour;


    /**
     * 新建临时结果, 用来运输
     *
     * @return
     */
    public static DeductResult temp() {
        DeductResult temp = new DeductResult();
        temp.money = BigDecimal.valueOf(0);
        temp.leaveHour = BigDecimal.valueOf(0);
        temp.absenteeismHour = BigDecimal.valueOf(0);
        return temp;
    }

    public void clear() {
        this.money = BigDecimal.valueOf(0);
        this.leaveHour = BigDecimal.valueOf(0);
        this.absenteeismHour = BigDecimal.valueOf(0);
    }

    public void incrBy(DeductResult result) {
        this.money = this.money.add(result.getMoney());
        this.leaveHour = this.leaveHour.add(result.getLeaveHour());
        this.absenteeismHour = this.absenteeismHour.add(result.getAbsenteeismHour());
    }

    // 更新
    public void update(DeductFeeUnitEnum unit, int amount, BigDecimal fee) {
        switch (unit) {
            case PER_MINUTE:
            case PER_TIME:
                money = fee.multiply(BigDecimal.valueOf(amount));
                break;
            case LEAVE:
                leaveHour = fee;
                break;
            case ABSENTEEISM:
                absenteeismHour = fee;
        }
    }

    // 增加
    public void add(DeductFeeUnitEnum unit, int amount, BigDecimal fee) {
        switch (unit) {
            case PER_MINUTE:
            case PER_TIME:
                money = money.add(fee.multiply(BigDecimal.valueOf(amount)));
                break;
            case LEAVE:
                leaveHour = leaveHour.add(fee);
                break;
            case ABSENTEEISM:
                absenteeismHour = absenteeismHour.add(fee);
                break;
        }
    }
}
