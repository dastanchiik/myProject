package org.example.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("ocean")
public class Ocean1 {
    private Island2 island2;

    public Ocean1() {
    }

    @Autowired
    public Ocean1(Island2 island2) {
        this.island2 = island2;
    }

    public String toString(){
        return " na oceane ostrov 🏝";
    }
}
