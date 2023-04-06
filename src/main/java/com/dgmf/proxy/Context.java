package com.dgmf.proxy;

// Classe Cliente
public class Context {
    // Objet de Type IService
    private IService service;

    public void compute() {
        double result = service.compute();

        System.out.println(result);
    }

    public void setService(IService service) {
        this.service = service;
    }
}
