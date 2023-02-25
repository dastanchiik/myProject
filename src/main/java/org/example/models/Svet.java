package org.example.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Component;

@Component("svet")
public class Svet {

    private Ocean1 ocean1;

    @Autowired
    public Svet(Ocean1 ocean1) {
        this.ocean1 = ocean1;
    }


    public String result() {
        return "na svete est ocean 🌊"+ocean1.toString();
    }
}
