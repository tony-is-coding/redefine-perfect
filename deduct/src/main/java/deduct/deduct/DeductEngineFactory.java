package deduct.deduct;

import deduct.deduct.calculator.DeductCalculatorFactory;
import deduct.dto.DeductDataSourceDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DeductEngineFactory {
    @Autowired
    DeductCalculatorFactory calculatorFactory;

    public DeductEngine create(DeductDataSourceDTO deductDataSource) {
        DeductEngine engine = new DeductEngine();
        engine.setCalculatorFactory(calculatorFactory);
        // TODO: 完成item 初始化填充
//        DeductItem lateItem = new LateItem();
//
//        engine.setLateItem(lateItem);


        return engine;
    }
}
