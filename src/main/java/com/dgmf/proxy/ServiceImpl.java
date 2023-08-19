package com.dgmf.proxy;

public class ServiceImpl implements IService {
    @Override
    public double compute() {
        double value = 33;

        return value * 32;
    }
}
