package org.example.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("island")
public class Island2 {
    private Tree3 tree3;

    public Island2() {
    }

    @Autowired
    public Island2(Tree3 tree3) {
        this.tree3 = tree3;
    }

    public String toString(){
        return " na ostrove derevo 🌳"+tree3.toString();
    }
}
