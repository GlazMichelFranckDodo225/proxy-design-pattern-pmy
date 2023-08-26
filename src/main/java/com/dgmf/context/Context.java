package com.dgmf.context;

import com.dgmf.service.IService;

// Classe Cliente
public class Context {
    // Objet de Type IService (interface) mais
    // c'est l'implémentation (ServiceImpl) qui est
    // récupérée concrêtement
    private IService service;

    // La classe cliente va récupérer l'opération
    // "compute()" de l'interface
    public void compute(int param) {
        System.out.println("=====");

        double result = service.compute(param);

        System.out.println("Result : " + result);

        System.out.println("=====");
    }

    public void setService(IService service) {
        this.service = service;
    }
}
