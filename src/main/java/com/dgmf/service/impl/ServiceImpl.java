package com.dgmf.service.impl;

import com.dgmf.service.IService;

public class ServiceImpl implements IService {
    @Override
    public double compute(int param) {
        double value = 33;

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        return value * param;
    }
}
