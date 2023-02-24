package org.example.models;

import org.springframework.stereotype.Component;

@Component("tree")
public class Tree3 {
    private Rabbit4 rabbit4;

    public Tree3() {
    }

    public Tree3(Rabbit4 rabbit4) {
        this.rabbit4 = rabbit4;
    }


}
