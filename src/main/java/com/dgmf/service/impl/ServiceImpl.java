package com.dgmf.service.impl;

import com.dgmf.service.IService;

public class ServiceImpl implements IService {
    @Override
    public double compute(int param) {
        double value = 33;

        return value * param;
    }
}
