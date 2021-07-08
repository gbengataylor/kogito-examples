package org.acme.service;

import java.util.Collection;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

import org.acme.coffeeservice.client.CoffeeResource;
import org.acme.model.Coffee;

import org.eclipse.microprofile.rest.client.inject.RestClient;

@ApplicationScoped
public class CoffeeService {

//Add RestClient annotations
//Add RestClient attribute
    @Inject
    @RestClient
    CoffeeResource coffeeResource;
    
    public Collection<Coffee> getCoffees() {
        System.out.println("Kogito calling our CoffeeService microservice!");
        return coffeeResource.getCoffees();
    }

}