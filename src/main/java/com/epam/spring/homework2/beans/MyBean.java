package com.epam.spring.homework2.beans;

public class MyBean {
    String name;
    int value;

    public MyBean(String name, int value) {
        this.name = name;
        this.value = value;
    }

    public MyBean(int value) {
        this.name = this.getClass().getSimpleName();
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public int getValue() {
        return value;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() +"{" +
                "name='" + name + '\'' +
                ", value=" + value +
                '}';
    }
}
