### DeductEngine

> 本目录下的代码 为基于 面向对象设计 + 依赖倒置接口设计原则 设计的一款 考勤扣款计算引擎 微服务;

本系统完全按照解耦需求设计, 对外依赖统一为DTO, 如果需要设计成rest api 可以独立设计VO, 不会影响核心业务能力

##### 业务核心点介绍:

- 考勤扣款:     

  ​         将企业员工月度 `迟到 早退 缺卡 旷工`等 四项基本考勤的异常行为进行统计, 按照一定规则进行计算后得出需要扣减的金额以及记录对应的事假旷工等; 扣款单位详见: [扣款单位枚举](https://github.com/tony-is-coding/redefine-perfect/blob/main/deduct/src/main/java/deduct/enums/DeductFeeUnitEnum.java)

- 扣款计算规则方式

  按照不同的规则进行 基本四项 扣款计算, 扣款方式详见: [扣款方式枚举](https://github.com/tony-is-coding/redefine-perfect/blob/main/deduct/src/main/java/deduct/enums/DeductMethodEnum.java)

- 按照阶梯/阶段 进行扣款

  - 阶梯扣款

    比如 迟到 1-10 扣款50, 11-20 扣款100; 次数如果 迟到 8 则扣款 50，18 则扣款 100

  - 阶段扣款

    比如迟到 1-10 部分扣款,  11 - 20 部分扣款100, 21-30 部分扣款 200, 次数迟到 8 则扣款50, 

    迟到18 则扣款 50 + 100 = 150, 迟到 28 则扣款 50+100+200 = 350 依次计算

- 更多自定义扣款此项目不做编码展示;



##### 核心设计思路

- 扣款引擎  [DeductEngine]((https://github.com/tony-is-coding/redefine-perfect/blob/main/deduct/src/main/java/deduct/deduct/DeductEngine.java)) 

  系统核心, 提供扣款核算能力, 扣款模型核心入口

- 计算器 [Calculator](https://github.com/tony-is-coding/redefine-perfect/blob/main/deduct/src/main/java/deduct/deduct/calculator/DeductCalculator.java)

  提供核心的 单类 计算能力,  以扣款方式做拓展, 实现按不同的扣款方式进行扣款

- 数据规则 - 最小扣款单元 [DeductItem](https://github.com/tony-is-coding/redefine-perfect/blob/main/deduct/src/main/java/deduct/deduct/item/DeductItem.java)

  数据与规则绑定的最小单元, 并发的最小粒度

- 阶梯/阶段 扣款规则 匹配器[SeverityLadderMatcher](https://github.com/tony-is-coding/redefine-perfect/blob/main/deduct/src/main/java/deduct/deduct/matcher/SeverityLadderMatcher.java)

  将  异常数值 与 规则匹配, 得出实际需要扣减的 数值结果