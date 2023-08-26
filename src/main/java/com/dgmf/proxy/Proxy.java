package com.dgmf.proxy;

public class Proxy implements IService{
    private ServiceImpl serviceImpl = new ServiceImpl();

    @Override
    public double compute() {
        System.out.println("Proxy - Before");

        double result = serviceImpl.compute();

        System.out.println("Proxy - After");

        return result;
    }
}
