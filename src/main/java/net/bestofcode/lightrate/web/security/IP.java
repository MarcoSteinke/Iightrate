package net.bestofcode.lightrate.web.security;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class IP {

    private final String value;

    @Override
    public String toString() {

        return this.value;

    }
}
