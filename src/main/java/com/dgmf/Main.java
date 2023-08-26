package com.dgmf;

import com.dgmf.context.Context;
import com.dgmf.context.SecurityContext;
import com.dgmf.proxy.*;

public class Main {
    public static void main(String[] args) {
        // SecurityContext.authenticate("user1", "1234", "root");
        SecurityContext.authenticate("user1", "1234", "user");

        Context context = new Context();
        // IService service = new ServiceImpl();
        // context.setService(service);
        // context.setService(new ServiceImpl());
        // context.setService(new Proxy());
        // context.setService(new SecurityProxy());
        context.setService(new CacheProxy());
        context.compute(3);
        context.compute(4);
        context.compute(8);
        context.compute(3);
        context.compute(4);
        context.compute(8);
    }
}