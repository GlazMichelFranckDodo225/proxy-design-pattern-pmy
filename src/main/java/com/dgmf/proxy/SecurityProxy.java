package com.dgmf.proxy;

import com.dgmf.context.SecurityContext;
import com.dgmf.service.IService;
import com.dgmf.service.impl.ServiceImpl;

public class SecurityProxy implements IService {
    private ServiceImpl serviceImpl = new ServiceImpl();

    @Override
    public double compute(int param) {
        if(!SecurityContext.role.equals("root")) {
            throw new RuntimeException("Not Authorized");
        }

        double result = serviceImpl.compute(param);

        return result;
    }
}
