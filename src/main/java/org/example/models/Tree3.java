package org.example.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("tree")
public class Tree3 {
    private Rabbit4 rabbit4;

    public Tree3() {
    }

    @Autowired
    public Tree3(@Qualifier("rabbit")Rabbit4 rabbit4) {
        this.rabbit4 = rabbit4;
    }

    @Override
    public String toString() {
        return " na dereve zayatc 🐇"+rabbit4.toString();
    }
}
