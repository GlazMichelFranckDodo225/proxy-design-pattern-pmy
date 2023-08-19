package com.dgmf;

import com.dgmf.proxy.Context;
import com.dgmf.proxy.IService;
import com.dgmf.proxy.ServiceImpl;

public class Main {
    public static void main(String[] args) {
        Context context = new Context();
        // IService service = new ServiceImpl();
        // context.setService(service);
        context.setService(new ServiceImpl());
        context.compute();
    }
}