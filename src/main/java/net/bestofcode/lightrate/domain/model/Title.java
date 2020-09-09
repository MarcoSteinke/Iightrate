package net.bestofcode.lightrate.domain.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class Title implements Credential {

    private final String content;
    private static final int MAX_LENGTH = 60;

    @Override
    public boolean isValid() {
        return this.length() >= 0 && this.length() < Title.MAX_LENGTH;
    }

    @Override
    public int length() {
        return this.content.length();
    }
}
