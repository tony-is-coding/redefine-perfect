package deduct.service;

import deduct.deduct.DeductEngine;
import deduct.deduct.DeductEngineFactory;
import deduct.dto.DeductDataSourceDTO;
import deduct.dto.DeductResultDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DeductService {
    @Autowired
    DeductEngineFactory engineFactory;

    DeductResultDTO deduct(DeductDataSourceDTO deductDataSource) {
        DeductEngine engine = engineFactory.create(deductDataSource);
        return engine.deduct();
    }

    public static void main(String[] args) {
        System.out.println("");
    }
}
