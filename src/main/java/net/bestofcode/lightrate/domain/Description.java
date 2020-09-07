package net.bestofcode.lightrate.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class Description implements Credential{

    private final String descriptionContent;
    private static final int MAX_LENGTH = 200;

    @Override
    public boolean isValid() {
        return false;
    }

    @Override
    public int length() {
        return 0;
    }
}
