package com.dgmf.proxy;

public class SecurityProxy implements IService{
    private ServiceImpl serviceImpl = new ServiceImpl();

    @Override
    public double compute() {
        if(!SecurityContext.role.equals("root")) {
            throw new RuntimeException("Not Authorized");
        }

        double result = serviceImpl.compute();

        return result;
    }
}
