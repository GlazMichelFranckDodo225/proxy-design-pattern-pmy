package com.dgmf.proxy;

// Classe Cliente
public class Context {
    // Objet de Type IService (interface) mais
    // c'est l'implémentation (ServiceImpl) qui
    // récupérée concrêtement
    private IService service;

    // La classe cliente va récupérer l'opération
    // "compute()" de l'interface
    public void compute() {
        System.out.println("=================");

        double result = service.compute();
        System.out.println("Result : " + result);

        System.out.println("=================");
    }

    public void setService(IService service) {
        this.service = service;
    }
}
