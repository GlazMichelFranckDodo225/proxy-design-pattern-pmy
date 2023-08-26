package com.dgmf.proxy;

import com.dgmf.service.IService;
import com.dgmf.service.impl.ServiceImpl;

import java.util.HashMap;
import java.util.Map;

public class CacheProxy implements IService {
    private Map<Integer, Double> cache = new HashMap<>();
    private ServiceImpl serviceimpl = new ServiceImpl();

    @Override
    public double compute(int param) {
        Double cacheValue = cache.get(param);

        if(cacheValue != null) {
            System.out.println("===== Cache Result =====");
            return cacheValue;
        }
        else {
            double result = serviceimpl.compute(param);
            cache.put(param, result);

            System.out.println("===== New Computing Result =====");
            return result;
        }
    }
}
