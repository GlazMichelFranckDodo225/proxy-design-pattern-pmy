package com.dgmf.proxy;

import com.dgmf.service.IService;
import com.dgmf.service.impl.ServiceImpl;

public class LogProxy implements IService {
    private ServiceImpl serviceImlp = new ServiceImpl();

    @Override
    public double compute(int param) {
        double time1 = System.currentTimeMillis();
        double result = serviceImlp.compute(param);
        double time2 = System.currentTimeMillis();

        double executionDurationComputeMethod = time2 - time1;

        System.out.println("Compute Method Execution Duration : " +
                (executionDurationComputeMethod / 1000) + " seconds");

        return result;
    }
}
