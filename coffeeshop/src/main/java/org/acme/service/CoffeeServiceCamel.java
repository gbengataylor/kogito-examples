package org.acme.service;

import java.util.Collection;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

import org.acme.coffeeservice.client.CoffeeResource;
import org.acme.model.Coffee;

import org.apache.camel.CamelContext;
import org.apache.camel.FluentProducerTemplate;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@ApplicationScoped
public class CoffeeServiceCamel {

    private static final Logger LOGGER = LoggerFactory.getLogger(CoffeeService.class);

//Add CamelContext
    @Inject
    CamelContext camelContext;

//Add FluentProducerTemplate
    private FluentProducerTemplate producer;

//Add PostConstruct
    @PostConstruct
    void init() {
        producer = camelContext.createFluentProducerTemplate();
        producer.setDefaultEndpointUri("direct://getCoffees");
    }
//Add PreDestroy
    @PreDestroy
    void destroy() {
        producer.stop();
    }
    public Collection<Coffee> getCoffees() {
        LOGGER.debug("Retrieving coffees using camel");
        //Add Method Implementation
        return producer.request(Collection.class);
    }

}