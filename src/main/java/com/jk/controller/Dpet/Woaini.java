package com.jk.controller.Dpet;

import java.io.Serializable;

public class Woaini implements Serializable{
    private Integer id;
    private String  name;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Woaini{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Woaini woaini = (Woaini) o;

        return getId().equals(woaini.getId());
    }

    @Override
    public int hashCode() {
        return getId().hashCode();
    }
}
