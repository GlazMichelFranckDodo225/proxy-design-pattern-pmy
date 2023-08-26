package com.dgmf.proxy;

import com.dgmf.service.IService;
import com.dgmf.service.impl.ServiceImpl;

public class SimpleProxy implements IService {
    private ServiceImpl serviceImpl = new ServiceImpl();

    @Override
    public double compute(int param) {
        System.out.println("Proxy - Before");

        double result = serviceImpl.compute(param);

        System.out.println("Proxy - After");

        return result;
    }
}
